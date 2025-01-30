import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("Quel temps souhaitez-vous ?");
        String weather = scanner.nextLine();
        System.out.println("Quel jour souhaitez-vous commencez ?");
        int day = parseInt(scanner.nextLine());
        int oui = 36;
        LivingEntity World = new LivingEntity(nbrHuman,nbrHumanSpe,nbrAnimal,nbrVegetal,weather,day);
        World.describeWorld();

    }
}