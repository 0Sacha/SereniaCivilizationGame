public class LivingEntity extends EnvironmentSpe {
    public int nbrDieHuman;
    public int nbrDieAnimal;
    public int nbrAnimalEat;
    public int nbrVegetalEat;
    // public int health; Prochaine version
    // public int energy; Prochaine version

    public void living() {
        this.nbrAnimalEat = 0;
        this.nbrVegetalEat = 0;
        this.nbrAnimal = 0;
        this.nbrVegetal = 0;
    }

    // Methodes
    public void eat() {
        this.nbrAnimalEat = this.nbrHuman/1000;
        this.nbrVegetalEat = this.nbrHuman/100;
        this.nbrAnimal = this.nbrAnimal - this.nbrAnimalEat;
        this.nbrVegetal = this.nbrVegetal - this.nbrVegetalEat;
    }

    public void reproduce() {
        int born = 1;
        int totalHuman = this.nbrHuman;
        int totalAnimal = this.nbrAnimal;
        int totalVegetal = this.nbrVegetal;
        if ( totalHuman >= 2){
            totalHuman = totalHuman + born;
        } if ( totalAnimal >= 2){
            totalAnimal = totalAnimal + born;
        } if ( totalVegetal >= 2){
            totalVegetal = totalVegetal + born;
        }
        this.nbrHuman = totalHuman;
        this.nbrAnimal = totalAnimal;
        this.nbrVegetal = totalVegetal;
        System.out.println("Votre monde est maintenant composer de " + this.nbrHuman + " Humains car " + born + " Humain est né");
        System.out.println("Votre monde est maintenant composer de " + this.nbrAnimal + " Animaux car " + born + " Animal est né");
        System.out.println("Votre monde est maintenant composer de " + this.nbrVegetal + " Végetaux car " + born + " Végétal a pousser");
    }

    public void dieHuman() {
        if (this.nbrAnimal >= this.nbrHuman || this.nbrVegetal == this.nbrHuman){
            this.nbrDieHuman = 0;
        } else if (this.nbrAnimal <= this.nbrHuman || this.nbrVegetal == this.nbrHuman){
            this.nbrDieHuman = 10;
        } else if (this.nbrAnimal <= this.nbrHuman/2 || this.nbrVegetal <= this.nbrHuman){
            this.nbrDieHuman = 50;
        } else if (this.nbrAnimal <= this.nbrHuman/2 || this.nbrVegetal <= this.nbrHuman/2){
            this.nbrDieHuman = 100;
        }
        this.nbrHuman = this.nbrHuman - this.nbrDieHuman;
        System.out.println("Votre monde est maintenant composer de " + this.nbrHuman + " Humains " + this.nbrDieHuman + " sont mort");
    }

    public void dieAnimal() {
        if (this.nbrAnimal <= this.nbrVegetal){
            this.nbrDieAnimal = 0;
        } else if (this.nbrAnimal >= this.nbrVegetal){
            this.nbrDieAnimal = 10;
        } else if (this.nbrAnimal > this.nbrVegetal/2){
            this.nbrDieAnimal = 50;
        }
        this.nbrAnimal = this.nbrAnimal - this.nbrDieAnimal;
        System.out.println("Votre monde est maintenant composer de " + this.nbrAnimal + " Humains " + this.nbrDieAnimal + " sont mort");
    }

    // Getters & Setters


    public int getNbrDieHuman() {
        return nbrDieHuman;
    }

    public void setNbrDieHuman(int nbrDieHuman) {
        this.nbrDieHuman = nbrDieHuman;
    }

    public int getNbrDieAnimal() {
        return nbrDieAnimal;
    }

    public void setNbrDieAnimal(int nbrDieAnimal) {
        this.nbrDieAnimal = nbrDieAnimal;
    }

    public int getNbrAnimalEat() {
        return nbrAnimalEat;
    }

    public void setNbrAnimalEat(int nbrAnimalEat) {
        this.nbrAnimalEat = nbrAnimalEat;
    }

    public int getNbrVegetalEat() {
        return nbrVegetalEat;
    }

    public void setNbrVegetalEat(int nbrVegetalEat) {
        this.nbrVegetalEat = nbrVegetalEat;
    }
}