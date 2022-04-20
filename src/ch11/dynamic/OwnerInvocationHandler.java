package ch11.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
	Person person;

	public OwnerInvocationHandler(Person person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		try {
			if(method.getName().startsWith("get")) {
				return method.invoke(person, args);
			}else if(method.getName().startsWith("setGeekRating")) {
				throw new IllegalAccessException();
			}else if(method.getName().startsWith("set")) {
				return method.invoke(person, args);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
