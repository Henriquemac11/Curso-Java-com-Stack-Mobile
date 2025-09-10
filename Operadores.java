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
        System.out.println("Insira o número 1:");
        Scanner first = new Scanner(System.in);
        n1 = first.nextInt();

        int n2;
        System.out.println("Insira o segundo:");
        Scanner second = new Scanner(System.in);
        n2 = second.nextInt();

        System.out.println(n1 + n2);
        System.out.println(n1 * n2);
        System.out.println(n1 / n2);
        System.out.println(n1 % n2);

          /*

        Operadores Relacionais (>, >=, <, <=)
        Operadores de igualdade (==, !=)

         */

        System.out.println(n1 == n2); //true or false
        System.out.println(n1 != n2);
        System.out.println(n1 >= n2);
        System.out.println(n1 <= n2);
    }
}
