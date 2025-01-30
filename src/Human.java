public class Human extends LivingEntity {

    // Attributes

    private String name;
    private String profession;
    private int age;


    //Constructor

    public Human(int nbrHuman, int nbrHumanSpe, int nbrAnimal, int nbrVegetal, String weather, int day, String name, String profession, int age) {
        super(nbrHuman, nbrHumanSpe, nbrAnimal, nbrVegetal, weather, day);
        this.name = name;
        this.profession = profession;
        this.age = age;
    }


    //Methods

    public void work() {

    }

    //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
