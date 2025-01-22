import java.util.Scanner;

public class nombre_precedents {

    public static void main(String[] args) {

        Scanner entree = new Scanner(System.in);

        System.out.print("Entrez un nombre de départ : ");
        int nombreDepart = entree.nextInt();

        System.out.print("Combien de nombres précédents voulez-vous afficher ? ");
        int n = entree.nextInt();

        if (n <= 0) {
            System.out.println("Le nombre de nombres précédents doit être positif.");
        } else {
            System.out.println("Les " + n + " nombres précédents sont :");
            for (int i = 1; i <= n; i++) {
                if (nombreDepart - i < 0) {
                  System.out.println("Nous avons atteint zéro. Arrêt de l'affichage.");
                  break;
                }
                System.out.print((nombreDepart - i) + " ");

            }
            System.out.println(); // Saut de ligne pour la lisibilité
        }
        entree.close();
    }
}
