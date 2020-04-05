import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factotriel {


    public static void facto() {
        int x = 0;
        int a = 0;
        int scanner1 = new Scanner(System.in).nextInt();
        int count = 0;
        int n = 0;
        int factori = 1;
        int y = scanner1;
        List<Integer> factor = new ArrayList<>();
        List<Integer> fac = new ArrayList<>();

        for (int i = 0; i < y; i++) {
            count = i;
            factor.add(i);
            a = factor.get(count) + 1;
            factori=factori*a;
            n=factori;
            fac.add(n);
        }

        System.out.println(fac.toString());
    }

    public static void main(String[] args) {
        Factotriel.facto();
    }
}
