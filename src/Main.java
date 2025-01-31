import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voulez-vous jouez ?(oui ou non)");
        String jouez = scanner.nextLine();
        while (jouez.equals("oui")) {
            System.out.println("----------------------------");
            System.out.println("------Le jeu de la vie------");
            System.out.println("----------------------------");
            System.out.println("Combien d'humains souhaitez-vous ?");
            int nbrHuman = parseInt(scanner.nextLine());
            System.out.println("Combien d'humains spéciaux souhaitez-vous ?");
            int nbrHumanSpe = parseInt(scanner.nextLine());
            System.out.println("Combien d'animaux souhaitez-vous ?");
            int nbrAnimal = parseInt(scanner.nextLine());
            System.out.println("Combien de végétaux souhaitez-vous ?");
            int nbrVegetal = parseInt(scanner.nextLine());
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
            System.out.println("Le temps de votre monde est maintenant définie sur " + typeWeather);
            System.out.println("Quel jour souhaitez-vous commencez ?");
            int day = parseInt(scanner.nextLine());
            Environment world = new Environment(nbrHuman, nbrHumanSpe, nbrAnimal, nbrVegetal, typeWeather, day);
            LivingEntity living = new LivingEntity(nbrHuman, nbrHumanSpe, nbrAnimal, nbrVegetal, typeWeather, day);
            Animal animal = new Animal();
            Plant plant = new Plant();
            world.describeWorld();
            world.dayStartSelected(day);
            System.out.println("Voulez vous entrez dans le menu de modification du monde ?(oui ou non)");
            String settings = scanner.nextLine();
            if (settings.equals("oui")) {
                System.out.println("Quel entités voulez vous ajouter ? (Tapez 1 pour des Humains, 2 pour des Végétaux, 3 pour des Animaux, par défaut des Humains seront ajouter)");
                int typeOfEntities = parseInt(scanner.nextLine());
                String entityName;
                switch (typeOfEntities) {
                    case 1:
                        entityName = "Humains";
                        break;
                    case 2:
                        entityName = "Végétaux";
                        break;
                    case 3:
                        entityName = "Animaux";
                        break;
                    default:
                        entityName = "Humains";
                        break;
                }
                System.out.println("Vous avez choisi : " + entityName);
                System.out.println("Combien voulez vous en ajouter ?");
                int nbrOfEntitiesAdd = parseInt(scanner.nextLine());
                System.out.println("Combien voulez vous en supprimer ?");
                int nbrOfEntitiesDel = parseInt(scanner.nextLine());
                System.out.println("Vous avez ajouter : " + nbrOfEntitiesAdd + " " + entityName);
                System.out.println("Vous avez supprimer : " + nbrOfEntitiesDel + " " + entityName);
                if (typeOfEntities == 1) {
                    world.addHuman(nbrOfEntitiesAdd);
                    world.removeHuman(nbrOfEntitiesDel);
                }
                if (typeOfEntities == 2) {
                    world.addVegetal(nbrOfEntitiesAdd);
                    world.removeVegetal(nbrOfEntitiesDel);
                }
                if (typeOfEntities == 3) {
                    world.addAnimal(nbrOfEntitiesAdd);
                    world.removeAnimal(nbrOfEntitiesDel);
                } else {
                    world.addHuman(nbrOfEntitiesAdd);
                    world.removeHuman(nbrOfEntitiesDel);
                }
            }

           // A mettre avec un if dans un menu apres sélection de l'acces au menu du monde
            // world.weatherChange();



            world.describeWorld();
            living.eat();
            living.reproduce();
            living.dieHuman();
            living.dieAnimal();
            world.describeWorld();
            animal.hunter();
            animal.escape();
            plant.fruit();
            plant.expiredFruit();
            world.dayPast(day);
        }
    }
}