package factoryMethod;

public class ProfessionFactory {

	public static Profession getProfession(String pro_name)
	{
		if(pro_name.equals("Doctor"))
		{
			return new Doctor();
		}else if (pro_name.equals("Engg"))
		{
			return new Engg();
		}
		return null;
	}
}
