package POO;

import POO.Heranca.Interfaces.Veiculo;

public class Moto implements Veiculo {

    @Override
    public void acelerar(String texto) {
        System.out.println("Moto acelerando...");
    }

    @Override
    public void desacelerar(String texto) {
        System.out.println("Moto desacelerando...");
    }
}
