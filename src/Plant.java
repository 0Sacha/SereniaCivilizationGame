public class Plant extends LivingEntity {

    // Attributes

    private String species;

    // Constructor

    public Plant(int nbrHuman, int nbrHumanSpe, int nbrAnimal, int nbrVegetal, String weather, int day, String species) {
        super(nbrHuman, nbrHumanSpe, nbrAnimal, nbrVegetal, weather, day);
        this.species = species;
    }


    //Methods

    public int hunter() {
        return 0;
    }

    public boolean flee() {
        return false;
    }

    //Getters & Setters

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
