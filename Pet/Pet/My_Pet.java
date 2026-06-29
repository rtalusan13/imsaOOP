
/**
 * This class implements a pet.
 * @author (Raphael Talusan)
 * @version (8/31/23)
 */
public class My_Pet
{
    // instance variables - replace the example below with your own
    private String name; //name of pet
    private int weight; //weight of pet
    private String breed; //breed of pet
    private boolean immunized; //true/false immunization

    /**
     * Constructor for objects of class My_Pet
     */
    public My_Pet()
    {
        // initialise instance variables
        name = "Buddy";
        weight = 45;
        breed = "German Shephard";
        immunized = false;
    }
    public My_Pet(String name)
    {
        this.name = name;
    }
    public My_Pet(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
        weight = 100;
    }
    //this "accessor" method provides the name of the pet
    public String getName()
    {
        return name;
    }
    //this method provides the weight of the pet
    public int getWeight()
    {
        return weight;
    }
    //this method provides the breed of the pet
    public String getBreed()
    {
        return breed;
    }
    //this method provides the immunization status of the pet
    public boolean getImmunized()
    {
        return immunized;
    }
    // this "new data" method changes the name of the pet
    public void setName(String name)
    {
        this.name = name;
        //why does this work? has to deal with void 
        //does not return, rather accepts input and changes data
    }
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    public void setImmunizationStatus()
    {
        if (immunized){
            immunized = false;
        }
        else{
            immunized = true;
        }
    }
    public void details()
    {
        System.out.println("Name of pet : "+name);
        System.out.println("Weight of pet : "+weight);
        System.out.println("Breed of pet : "+breed);
        if (immunized){
            System.out.println("Immunized");
        }
        else{
            System.out.println("Not Immunized");
        }
        System.out.println(name.length());
    }
}
