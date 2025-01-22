import java.util.Scanner;

public class calculatrice {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        System.out.print("Entrez le premier nombre: ");
        double nombre1 = entree.nextDouble();

        System.out.print("Entrez le deuxième nombre: ");
        double nombre2 = entree.nextDouble();

        System.out.print("Entrez l'opérateur (+, -, *, /): ");

        char operateur = entree.next().charAt(0);

        double resultat = 0;
        
        switch (operateur) {
            case '+':
                resultat = nombre1 + nombre2;
                break;
            case '-':
                resultat = nombre1 - nombre2;
                break;
            case '*':
                resultat = nombre1 * nombre2;
                break;
            case '/':
                if (nombre2 != 0) {
                    resultat = nombre1 / nombre2;
                } else {
                    System.out.println("Erreur : division par zéro.");
                    return ; // Termine le programme en cas de division par zéro
                }
                break;
            default:
                System.out.println("Opérateur invalide.");
                return; // Termine le programme si l'opérateur est invalide
        }

        double doubleResultat = 2 * resultat;
        System.out.println("Le double du résultat est : " + doubleResultat);

        entree.close();
    }
}
