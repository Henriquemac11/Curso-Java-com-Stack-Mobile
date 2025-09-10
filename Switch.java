import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        /*
        switch(){

        }
         */

        byte opcoesBanco;

        System.out.println("Escolha uma opção: \n" +
                " 1. Ver Fatura \n" +
                " 2. Saldo Conta Corrente  \n" +
                " 3. Poupança \n" +
                " 4. Suporte"
        );
        Scanner input = new Scanner(System.in);
        opcoesBanco = input.nextByte();

        switch(opcoesBanco){
            case 1:
                System.out.println("Ver fatura do cartão: ");
                break;
            case 2:
                System.out.println("Saldo conta corrente: ");
                break;
            case 3:
                System.out.println("Poupança: ");
                break;
            case 4:
                System.out.println("Suporte: ");
                break;

                default:
                    System.out.println("Invalido!");

        }

    }
}
