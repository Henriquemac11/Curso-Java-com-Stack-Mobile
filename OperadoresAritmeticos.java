import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        /*
        Operadores Aritmeticos

         + soma
         - subtração
         * Multiplicação
         / Divisão
         % resto da divisão

        */

        int n1;
        Scanner first = new Scanner(System.in);
        n1 = first.nextInt();

        int n2;
        Scanner second = new Scanner(System.in);
        n2 = second.nextInt();

        System.out.println(n1 + n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);
        System.out.println(n1 % n2);


    }
}
