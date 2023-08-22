import java.util.Scanner;

public class Eingabe {

    public static void main(String[] args) {
        // Wir brauchen einen Scanner, der die Konsoleneingabe liest
        // um Eingaben zu verarbeiten
        Scanner scan=new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Zahl ein: ");
        int number=scan.nextInt();
        System.out.println("Sie haben die Zahl " + number + " eingegeben");




    }
}
