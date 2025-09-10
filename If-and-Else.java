import java.util.Scanner;

public class IfAndElse {
    public static void main(String[] args) {
    /*
        if(condição){ true
        //Código
        }else{ false
        //Código
        }
    */

       byte idade;
       System.out.print("Qual é sua idade? ");
       Scanner ler = new Scanner(System.in);
       idade = ler.nextByte();

       if(idade <= 10){
           System.out.println("Criança");
       }else if(idade <= 17){
           System.out.println("Adolescente");
       }else{
           System.out.println("Adulto");
       }
    }
}
