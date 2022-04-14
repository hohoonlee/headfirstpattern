package ch08;

import javax.swing.JFrame;
import java.awt.*;

public class MyFrame extends JFrame{
	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 300);
		this.setVisible(true);
	}

	public void paint(Graphics g) {
		super.paint(g);
		g.drawString("내가 최고!", 100, 100);
	}

	public static void main(String[] args) {
		new MyFrame("Head First");
	}

}
