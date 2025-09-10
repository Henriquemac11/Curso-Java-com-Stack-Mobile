import java.util.Scanner;

public class Concatenacao {
    public static void main(String[] args) {

        //Concatenacao

        String nome;
        Byte idade;
        String profissao;


        System.out.println("Qual o seu nome?");
        Scanner entradaUsuario = new Scanner(System.in);
        nome = entradaUsuario.nextLine();

        System.out.println("Qual o seu profissao?");
        profissao = entradaUsuario.nextLine();

        System.out.println("Qual o seu idade?");
        idade = entradaUsuario.nextByte();


        System.out.println("Meu nome é " + nome + " e eu tenho " + idade + " e sou " + profissao);

    }
}
