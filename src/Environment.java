import static java.lang.Integer.parseInt;
import java.util.Scanner;

public class Environment {
    public int nbrHuman;
    public int nbrHumanSpe;
    public int nbrAnimal;
    public int nbrVegetal;
    public String weather;
    public int day;

    // Constructor
//     public Environment() {
//        this.nbrHuman = 100;
//        this.nbrHumanSpe = 10;
//        this.nbrAnimal = 50;
//        this.nbrVegetal = 150;
//        this.weather = "Soleil";
//        this.day = 0;
//    }

    public Environment(int nbrHuman, int nbrHumanSpe, int nbrAnimal, int nbrVegetal, String weather, int day) {
        this.nbrHuman = nbrHuman;
        this.nbrHumanSpe = nbrHumanSpe;
        this.nbrAnimal = nbrAnimal;
        this.nbrVegetal = nbrVegetal;
        this.weather = weather;
        this.day = day;
    }
    // Methodes

    // Human
    public void addHuman(int nbrOfEntitiesAdd) {
        this.nbrHuman = this.nbrHuman + nbrOfEntitiesAdd;
    }

    public void removeHuman(int nbrOfEntitiesRemove) {
        this.nbrHuman = this.nbrHuman - nbrOfEntitiesRemove;
    }

    //public void updateHuman(int nbrOfEntitiesUpdate) {
    //    this.nbrHuman = nbrOfEntitiesUpdate;
    //    System.out.println("Votre monde est maintenant composer de " + this.nbrHuman + " Humains, ");
    //}

    // Human special
    //public void addHumanSpe(int nbrOfEntitiesAdd) {
    //    this.nbrHumanSpe = this.nbrHumanSpe + nbrOfEntitiesAdd;
    //    System.out.println("Votre monde est maintenant composer de " + this.nbrHumanSpe + " Humains spéciaux, ");
    //}

    //public void removeHumanSpe(int nbrOfEntitiesRemove) {
    //    this.nbrHumanSpe = this.nbrHumanSpe - nbrOfEntitiesRemove;
    //    System.out.println("Votre monde est maintenant composer de " + this.nbrHumanSpe + " Humains spéciaux, ");
    //}

    //public void updateHumanSpe(int nbrOfEntitiesUpdate) {
    //    this.nbrHuman = nbrOfEntitiesUpdate;
    //    System.out.println("Votre monde est maintenant composer de " + this.nbrHumanSpe + " Humains spéciaux, ");
    //}

    // Animal
    public void addAnimal(int nbrOfEntitiesAdd) {
        this.nbrAnimal = this.nbrAnimal + nbrOfEntitiesAdd;
    }

    public void removeAnimal(int nbrOfEntitiesRemove) {
        this.nbrAnimal = this.nbrAnimal - nbrOfEntitiesRemove;
    }

    // Vegetal
    public void addVegetal(int nbrOfEntitiesAdd) {
        this.nbrVegetal = this.nbrVegetal + nbrOfEntitiesAdd;
    }

    public void removeVegetal(int nbrOfEntitiesRemove) {
        this.nbrVegetal = this.nbrVegetal - nbrOfEntitiesRemove;
    }

    public void weatherChange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quel temps voulez-vous mettre ? (Tapez 1 pour du Soleil, 2 pour de la Pluie, 3 pour des Orages violent, par défaut de Soleil sera présent) : ");
        int weatherSet = parseInt(scanner.nextLine());
        String typeWeather;
        switch (weatherSet) {
            case 1:
                typeWeather = "Soleil";
                break;
            case 2:
                typeWeather = "Pluie";
                break;
            case 3:
                typeWeather = "Orages";
                break;
            default:
                typeWeather = "Soleil";
                break;
        }
        this.weather = typeWeather;
        System.out.println("Le temps de votre monde est maintenant définie sur " + this.weather);
    }

    public void dayStartSelected(int day) {
        this.day = this.day + day;
        System.out.println("Le jour de départ sera le jour n°" + this.day);
    }
    public void dayPast(int day) {
        this.day = this.day + day;
        System.out.println("Jour n°" + this.day);
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
