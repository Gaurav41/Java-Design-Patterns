package Singletone;

public class SingletonClass {

	private static SingletonClass singletonClassInstance =null;
	private SingletonClass() {
	}
	
	 static SingletonClass getInstance()
	{
		if(singletonClassInstance==null)
			singletonClassInstance= new SingletonClass();
			
		return singletonClassInstance;
	}
	public void print(SingletonClass s)
	{
		System.out.println("Hashcode:"+s.hashCode());
	}
}
