public class Plant extends LivingEntity {

    // Attributes
    public String type;
    public int nbrFruit;

    // Constructor
    public Plant() {
        this.type = "Pomme";
    }

    // Methods
    public void fruit() {
        this.nbrFruit = this.nbrVegetal * 3;
        System.out.println("Vous avez " + this.nbrFruit + " fruit.");
    }

    public void expiredFruit() {
        if (weather.equals("Orages")) {
            this.nbrVegetal = this.nbrVegetal - 30;
        }
    }

    // Getters & Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNbrFruit() {
        return nbrFruit;
    }

    public void setNbrFruit(int nbrFruit) {
        this.nbrFruit = nbrFruit;
    }
}
