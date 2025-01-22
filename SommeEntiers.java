import java.util.Scanner;

public class SommeEntiers {

    public static void main(String[] args) {

        Scanner entree = new Scanner(System.in);

        System.out.print("Entrez un nombre entier positif : ");
        int nombre = entree.nextInt();

        if (nombre <= 0) {
            System.out.println("Veuillez entrer un nombre entier positif.");
            return; // Termine le programme si le nombre n'est pas positif
        }

        int somme = 0;
        int i = 0;

        while (somme < nombre) {
            somme += i;
            i++;
        }

        System.out.println("La somme est : " + somme);

        entree.close();
    }
}
