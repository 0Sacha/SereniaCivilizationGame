import java.util.Scanner;

public class Animal extends LivingEntity {
    // Attributes
    private String type;
    private int age;

    //Constructor

    public Animal(int nbrHuman, int nbrHumanSpe, int nbrAnimal, int nbrVegetal, String weather, int day, String type, int age) {
        super(nbrHuman, nbrHumanSpe, nbrAnimal, nbrVegetal, weather, day);
        this.type = type;
        this.age = age;
    }

    // Methods

    public int fruit() {
        return 0;
    }

    public boolean expired() {
        return false;
    }

    // Getters & Setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
