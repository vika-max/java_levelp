import java.util.InputMismatchException;
import java.util.Scanner;
public class Bracket {
    public static void lex_bracket(int n, int c_out, int c_close, String out) {
        if (c_out + c_close == 2*n) {
            System.out.printf("%s\n", out);
        }
        if (c_out < n)
            lex_bracket(n, c_out+1, c_close, out + '(');
        if (c_out > c_close)
            lex_bracket(n, c_out, c_close + 1, out + ')' );
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("Введите число для разложения на множители:");
            System.out.println("Введите N:");
            n = in.nextInt();
            String out = new String("");
            lex_bracket(n, 0, 0, out);
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не Int число");
        }
    }
}
