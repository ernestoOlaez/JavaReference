import java.util.LinkedList;

public class Dog extends Mammal 
{
	String animalBreed;

    public static void main(String args[])
    {
        Dog d1[ ] = new Dog[5];
        LinkedList<Dog> list = new LinkedList();
        /* instead we can use input command
        BufferedReader class
        below is the syntax
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        */
        d1[0] = new Dog("white and brown","Male","Carnivores","saint bernard");
        d1[1] = new Dog("black","Male","Carnivores","rottweiler");
        d1[2] = new Dog("grey","Female","Carnivores","greatdane");
        d1[3] = new Dog("white","Male","Carnivores","labrador");
        d1[4] = new Dog("gold","Female","Carnivores","golden retriever");
        list.add(new Dog("black","Female","Carnivores","pit bull"));
        list.add(new Dog("brown and black","Male","Carnivores","german shepard"));
        list.add(new Dog("black","Female","Carnivores","boxer"));
        list.add(new Dog("white and grey","Female","Carnivores","siberian husky"));
        for (Dog i: d1){
            i.displayDogsData();
        }
        for(int i=0;i<4;i++){
            Dog temp = list.get(i);
            temp.displayDogsData();
        }
      //  Dog d = new Dog("white and brown","Male","Herbivores","saint bernard");
    }
    Dog(String color,String gender,String typeofFood,String breed)
    {
        super();
        setAnimalColor(color);
        feedingType = typeofFood;
        setGender(gender);
        this.animalBreed = breed;
    }
    public void displayDogsData()
    {
        System.out.println(getGender()+" "+animalBreed+"Dog is a "+feedingType+" identified in "+getAnimalColor()+" colour");
    }

}
