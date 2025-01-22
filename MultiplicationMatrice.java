import java.util.Arrays;

public class MultiplicationMatrice {

    public static void main(String[] args) {

        // Initialisation des deux matrices 4x4
        int[][] matrice1 = new int[4][4];
        int[][] matrice2 = new int[4][4];

        // Remplissage des matrices avec des valeurs aléatoires (pour l'exemple)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrice1[i][j] = (int) (Math.random() * 10); // Nombres entre 0 et 9
                matrice2[i][j] = (int) (Math.random() * 10);
            }
        }

        // Affichage des matrices
        System.out.println("Matrice 1:");
        afficherMatrice(matrice1);

        System.out.println("\nMatrice 2:");
        afficherMatrice(matrice2);


        // Calcul de la transposée de la matrice2
        int[][] transposeeMatrice2 = transposee(matrice2);

        System.out.println("\nTransposée de Matrice 2:");
        afficherMatrice(transposeeMatrice2);

        // Multiplication de matrice1 par la transposée de matrice2
        int[][] resultat = multiplierMatrices(matrice1, transposeeMatrice2);

        // Affichage du résultat
        System.out.println("\nRésultat de la multiplication:");
        afficherMatrice(resultat);
    }


    // Fonction pour afficher une matrice
    public static void afficherMatrice(int[][] matrice) {
        for (int[] ligne : matrice) {
            System.out.println(Arrays.toString(ligne));
        }
    }


    // Fonction pour calculer la transposée d'une matrice
    public static int[][] transposee(int[][] matrice) {
        int[][] transposee = new int[matrice[0].length][matrice.length];
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                transposee[j][i] = matrice[i][j];
            }
        }
        return transposee;
    }

    // Fonction pour multiplier deux matrices
    public static int[][] multiplierMatrices(int[][] matrice1, int[][] matrice2) {
        int lignes1 = matrice1.length;
        int colonnes1 = matrice1[0].length;
        int lignes2 = matrice2.length;
        int colonnes2 = matrice2[0].length;

        if (colonnes1 != lignes2) {
            throw new IllegalArgumentException("Dimensions des matrices incompatibles pour la multiplication.");
        }

        int[][] resultat = new int[lignes1][colonnes2];

        for (int i = 0; i < lignes1; i++) {
            for (int j = 0; j < colonnes2; j++) {
                for (int k = 0; k < colonnes1; k++) {
                    resultat[i][j] += matrice1[i][k] * matrice2[k][j];
                }
            }
        }

        return resultat;
    }
}




