import java.util.Scanner;

public class Animal extends LivingEntity {
    // Attributes
    //public String species;
    public String type;
    public int age;

    //Constructor

    public Animal() {
        this.type = "Vache";
        this.age = 7;
    }


    // Methods

    public int hunter() {
        int hunterSuccess = Math.random()<0.5?1:2;
        return hunterSuccess = 2;
    }

    public boolean escape() {
        int escapeSuccess = Math.random()<0.5?1:2;
        return escapeSuccess == 1;
    }

    // Getters & Setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
