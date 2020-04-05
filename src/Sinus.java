import java.io.IOException;
import java.util.Scanner;

public class Sinus {

    public static void main(String[] args) throws IOException {
        double a; // il existe un réel à lire sur l’entrée standard
        double b;
        int i=0;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();

        // un réel a été lu sur l’entrée standard,
        // placé en mémoire centrale et
        // l’identificateur de variable x permet de le désigner
        a = Math.sin(a);
        b = Math.sin(b);
       double fact =(Math.min(a, b));
        // la valeur du sinus de x est écrite sur la sortie standard } } // fin classe Sinus


        i = i + 1;
        fact= fact*i;
        System.out.println(fact);
    }
}
