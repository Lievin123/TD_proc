import java.util.Scanner;

public class convertisseur_temps {

    public static void main(String[] args) {

        Scanner entree = new Scanner(System.in);

        System.out.print("Entrez un temps en secondes : ");
        int totalSeconds = entree.nextInt();


        int heure = totalSeconds / 3600;

        int minute = (totalSeconds % 3600) / 60;
        int seconde = totalSeconds % 60;
        

        System.out.println("Votre temps est " + heure + " heures, " + minute + " minutes et " + seconde + " secondes.");

        entree.close(); 
    }
}
