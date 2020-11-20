package factoryMethod;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Enter Profession");
		Scanner sc= new Scanner(System.in);
		String pro_name=sc.next();
		
		Profession p = ProfessionFactory.getProfession(pro_name);
		p.print();
	}

}
