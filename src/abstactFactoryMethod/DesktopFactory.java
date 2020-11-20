package abstactFactoryMethod;

public class DesktopFactory extends PcAbstractFactory {

	@Override
	public PC getPrice(String name) {

		if (name.equals("HP")) {
			return new HpDesktop();
		} else if (name.equals("DELL")) {
			return new DellDesktop();
		}
		return null;
	}

}
