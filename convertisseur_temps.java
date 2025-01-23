import java.util.Scanner;

public class convertisseur_temps {

    public static void main(String[] args) {

        Scanner entree = new Scanner(System.in);

        System.out.print("Entrez un temps en secondes : ");
        int total_Secondes = entree.nextInt();


        int heure = total_Secondes / 3600;

        int minute = (total_Secondes % 3600) / 60;
        int seconde = total_Secondes % 60;
        

        System.out.println("Votre temps est " + heure + " heures, " + minute + " minutes et " + seconde + " secondes.");

        entree.close(); 
    }
}
