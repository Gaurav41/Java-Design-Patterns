package Singletone;

public class Main {

	public static void main(String[] args) {

		SingletonClass s = SingletonClass.getInstance();
		s.print(s);
		SingletonClass s1 = SingletonClass.getInstance();
		s.print(s1);
	}

}
