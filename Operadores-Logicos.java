import java.util.Scanner;

public class OpLogico {
    public static void main(String[] args) {

        //Operadores lógicos: ( || e && )

        int n1,n2,n3,n4;
        System.out.println("Insira os números: ");
        Scanner num = new Scanner(System.in);
        n1 = num.nextInt();
        n2 = num.nextInt();
        n3 = num.nextInt();
        n4 = num.nextInt();

        if(n1 == n2 || n3 == n4){ //
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
        // || (ou)
        // F + F = F
        // F + V = V
        // V + F = V

        if(n1 == n2 && n3 == n4){ //
            System.out.println("Verdadeiro");
        }else{
            System.out.println("Falso");
        }
        // && (e)
        // F + F = F
    }   // F + V = F
        // V + F = F
        // V + V = V
}
