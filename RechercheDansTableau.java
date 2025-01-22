import java.util.Scanner;

public class RechercheDansTableau {

    public static void main(String[] args) {

        Scanner entree = new Scanner(System.in);

        // Initialisation du tableau 2D 4x5
        int[][] tableau = new int[4][5];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                tableau[i][j] = (int) (Math.random() * 100); // Génère des nombres aléatoires entre 0 et 99
            }
        }


        // Affichage du tableau sous forme de matrice
        System.out.println("Tableau :");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tableau[i][j] + "\t"); // \t pour l'espacement
            }
            System.out.println(); // Nouvelle ligne pour chaque rangée
        }

        // Demande à l'utilisateur de saisir un nombre à rechercher
        System.out.print("Entrez un nombre à rechercher : ");
        int n = entree.nextInt();

        // Recherche du nombre dans le tableau
        boolean trouve = false;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                if (tableau[i][j] == n) {
                    trouve = true;
                    break; // Sort de la boucle interne si le nombre est trouvé
                }
            }
            if (trouve) {
                break; // Sort de la boucle externe si le nombre est trouvé
            }
        }

        // Affichage du résultat
        if (trouve) {
            System.out.println("Le nombre " + n + " se trouve dans le tableau.");
        } else {
            System.out.println("Le nombre " + n + " ne se trouve pas dans le tableau.");
        }

        entree.close();
    }
}
