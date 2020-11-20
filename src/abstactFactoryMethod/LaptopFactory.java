package abstactFactoryMethod;

public class LaptopFactory extends PcAbstractFactory {

	@Override
	public PC getPrice(String name) {

		if (name.equals("HP")) {
			return new HpLaptop();
		} else if (name.equals("DELl")) {
			return new DellLaptop();
		}
		return null;
	}
}
