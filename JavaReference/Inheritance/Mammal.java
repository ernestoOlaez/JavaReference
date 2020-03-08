
public class Mammal extends Animal
{
	final static String characteristic = "viviparous"; // gives birth directly
    public static String feedingType; //Herbivores,Carnivores,Omnivores
    Mammal()
    {
        super();
        System.out.println("All Mammals are "+characteristic+"(means live birth)");
    }
}
