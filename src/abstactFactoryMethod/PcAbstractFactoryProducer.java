package abstactFactoryMethod;

public class PcAbstractFactoryProducer {

	public static PcAbstractFactory getPrice(boolean value)
	{
		if(value)
		{
			return new LaptopFactory();
		}else {
			return new DesktopFactory();
		}
			
			
	}
}
