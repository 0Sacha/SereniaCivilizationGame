public class LivingEntity {
    public int nbrHuman;
    public int nbrHumanSpe;
    public int nbrAnimal;
    public int nbrVegetal;
    public String weather;
    public int day;

    // Constructor
    public LivingEntity() {
        this.nbrHuman = 100;
        this.nbrHumanSpe = 10;
        this.nbrAnimal = 50;
        this.nbrVegetal = 150;
        this.weather = "sun";
        this.day = 0;
    }

    public LivingEntity(int nbrHuman, int nbrHumanSpe, int nbrAnimal, int nbrVegetal, String weather, int day) {
        this.nbrHuman = nbrHuman;
        this.nbrHumanSpe = nbrHumanSpe;
        this.nbrAnimal = nbrAnimal;
        this.nbrVegetal = nbrVegetal;
        this.weather = weather;
        this.day = day;
    }

    // Methodes
    public void addHuman(int oui) {
        this.nbrHuman = this.nbrHuman + oui;
        System.out.println("Votre monde est maintenant composer de " + this.nbrHuman + " Humains, ");
    }

    public void addHumanSpe(int oui) {
        this.nbrHumanSpe = this.nbrHumanSpe + oui;
        System.out.println("Votre monde est maintenant composer de " + this.nbrHumanSpe + " Humains spéciaux, ");
    }

    public void addAnimal(int oui) {
        this.nbrAnimal = this.nbrAnimal + oui;
        System.out.println("Votre monde est maintenant composer de " + this.nbrAnimal + " animaux, ");
    }

    public void addVegetal(int oui) {
        this.nbrVegetal = this.nbrVegetal + oui;
        System.out.println("Votre monde est maintenant composer de " + this.nbrVegetal + " végétaux, ");
    }

    public void weatherChange(int oui) {
        this.nbrVegetal = this.nbrVegetal + oui;
        System.out.println("Le temps de votre monde est maintenant définie sur " + this.weather);
    }

    public void describeWorld() {
        System.out.println("Votre monde est composer de " + this.nbrHuman + " Humains, "
                + this.nbrHumanSpe + " Humains spéciaux, "
                + this.nbrAnimal + " animaux, "
                + this.nbrVegetal + " végétaux, "
                + "Le temps est définie sur " + this.weather + " et vous êtes au jours " + this.day + ".");
    }

    // Getters & Setters

    public int getNbrHuman() {
        return nbrHuman;
    }

    public void setNbrHuman(int nbrHuman) {
        this.nbrHuman = nbrHuman;
    }

    public int getNbrHumanSpe() {
        return nbrHumanSpe;
    }

    public void setNbrHumanSpe(int nbrHumanSpe) {
        this.nbrHumanSpe = nbrHumanSpe;
    }

    public int getNbrAnimal() {
        return nbrAnimal;
    }

    public void setNbrAnimal(int nbrAnimal) {
        this.nbrAnimal = nbrAnimal;
    }

    public int getNbrVegetal() {
        return nbrVegetal;
    }

    public void setNbrVegetal(int nbrVegetal) {
        this.nbrVegetal = nbrVegetal;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
