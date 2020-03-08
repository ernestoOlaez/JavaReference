
public class Animal 
{
	private String animalColor;
	private String gender;
	public String getAnimalColor()
	{
		return animalColor;
	}
	
	public String getGender()
	{
		return gender;
	}
    
	
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	public void setAnimalColor(String animalColor)
	{
		this.animalColor=animalColor;
	}
	
	Animal()
	{
		System.out.println("Animals are motile, they can move spontaneously and independently ");
	}

}
