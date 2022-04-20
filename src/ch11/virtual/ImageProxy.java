package ch11.virtual;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon {
	volatile ImageIcon imageIcon; //cache 미사용 (읽기보호)
	final URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;

	public ImageProxy(URL imageURL) {
		this.imageURL = imageURL;
	}

	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		if(imageIcon != null) {
			imageIcon.paintIcon(c, g, x, y);
		}else {
			g.drawString("앨범 커버를 불러오는 중입니다. 잠시만 기다려 주세요.", x + 300, y + 190);
			if(retrieving) return;
			retrieving = true;
			retrievalThread = new Thread(()->{
				try {
					setImageIcon(new ImageIcon(imageURL, "Album Cover"));
					c.repaint();
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
			retrievalThread.start();
		}
	}

	@Override
	public int getIconWidth() {
		return (imageIcon != null)?imageIcon.getIconWidth():800;
	}
	@Override
	public int getIconHeight() {
		return (imageIcon != null)?imageIcon.getIconHeight():600;
	}

	synchronized void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}

}
