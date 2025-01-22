import java.util.Scanner;

public class TableauOperations {

    public static void main(String[] args) {

        Scanner entree = new Scanner(System.in);
        double[] tableau = new double[10];

        // Initialisation du tableau avec des valeurs saisies par l'utilisateur
        System.out.println("Entrez les 10 nombres réels :");
        for (int i = 0; i < tableau.length; i++) {
            System.out.print("Nombre " + (i + 1) + " : ");
            tableau[i] = entree.nextDouble();
        }

        //ici nous  Calculons la somme
        double somme = 0;
        for (double nombre : tableau) {
            somme += nombre;
        }

        // ici nous Calculons le produit
        double produit = 1;
        for (double nombre : tableau) {
            produit *= nombre;
        }

        // ici nous Calculons de la moyenne
        double moyenne = somme / tableau.length;

        //ici nous affichons les résultats
        System.out.println("Somme : " + somme);
        System.out.println("Produit : " + produit);
        System.out.println("Moyenne : " + moyenne);

        entree.close();
    }
}
