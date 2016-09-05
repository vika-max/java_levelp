import java.util.InputMismatchException;
import java.util.Scanner;


public class Polinom {

    public static void printPol(int n) {
        if (n >= 1) {
            System.out.printf(" + %d ", 1);
            printPol(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("Введите число для разложения на слагаемые:");
            System.out.println("Введите N(N<=100):");
            n = in.nextInt();
            if (N <= 100) {
                int j;
                for (j = 0; j < n; j++) {
                    System.out.printf("%d = %d ", n, n - j);
                    printPol(j);
                    System.out.println("\n");
                }
            } else
                System.out.println("N<=100!!!");
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не Int число");
        }
    }
}

