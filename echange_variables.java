import java.util.Scanner;

public class echange_variables {

    public static void main(String[] args) {

        Scanner entree = new Scanner(System.in);

        System.out.print("Entrez la première variable (a): ");
        int a = entree.nextInt();

        System.out.print("Entrez la deuxième variable (b): ");
        int b = entree.nextInt();

        if (a * b < 0) {
            // Ici nous echangeons les valeurs si le produit est négatif
            int a2 = a;
            a = b;
            b = a2;
        } else {
            // ici nous mettons le produit dans a et la somme dans b si le produit est positif ou nul
            int a2 = a;
            a = a * b;
            b = a2 + b; 
        }

        System.out.println("Nouvelle valeur de a: " + a);
        System.out.println("Nouvelle valeur de b: " + b);

        entree.close();
    }
}
