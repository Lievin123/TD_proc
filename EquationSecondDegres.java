import java.util.Scanner;

public class EquationSecondDegres {

    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        System.out.print("Entrez le coefficient a : ");
        double a = entree.nextDouble();

        System.out.print("Entrez le coefficient b : ");
        double b = entree.nextDouble();

        System.out.print("Entrez le coefficient c : ");
        double c = entree.nextDouble();

        // ici nous afficons  l'équation
        System.out.println("Résolution de l'équation : " + a + "x² + " + b + "x + " + c + " = 0");

        // Calcul du discriminant
        double delta = calculerDelta(a, b, c);

        // Affichage des solutions
        afficherSolutions(a, b, delta);

        entree.close();
    }

    // ici nous definissons la Fonction pour calculer le delta
    public static double calculerDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    // ici nous definissons la Procédure pour afficher les solutions
    public static void afficherSolutions(double a, double b, double delta) {
        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("Deux solutions réelles : x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Une solution réelle double : x = " + x);
        } else {
            System.out.println("Pas de solution réelle.");
        }
    }
}
