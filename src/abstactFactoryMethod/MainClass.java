package abstactFactoryMethod;

public class MainClass {

	public static void main(String[] args) {
		/** true for laptop false for desktop
		 * if true it returns LaptopFactory Object
		 * if false it returns DesktopFactory Object*/
		PcAbstractFactory pcAbstractFactory = 	PcAbstractFactoryProducer.getPrice(true);
		/**
		 * It takes String "HP" or "DELL" as argument
		 * if HP then returns object of  HpLaptop or HpDesktop object of type 'PC' depending on the object 'pcAbstractFactory' object 
		 */
		PC p= pcAbstractFactory.getPrice("DELL");
		/**
		 * Print price of HP/DELL-laptop/desktop
		 */
		p.price();

	}

}
