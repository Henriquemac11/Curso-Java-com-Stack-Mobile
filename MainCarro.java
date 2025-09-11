package POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Constructor
        Carro carro1 = new Carro("Azul", "Fiat", "ABC123");
        carro1.detalhesCarro("Brasil");
        carro1.acelerar();

        Carro carro2 = new Carro("Rosa", "BYD", "DEF456");
        carro2.detalhesCarro("Brasil");
        carro2.abastecer();


       /* // Getter and Setter
        Carro carro = new Carro();
        carro.setCor("Vermelho");
        carro.setModelo("Fiat");
        carro.setPlaca("AJH890");
        carro.acelerar();

        Scanner input = new Scanner(System.in);
        System.out.println(carro.getPlaca() + "\n" + carro.getCor() + "\n" + carro.getModelo() );
        */



    }
}
