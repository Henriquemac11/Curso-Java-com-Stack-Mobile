package POO;

import POO.Heranca.Interfaces.Veiculo;

public class Carro implements Veiculo {


    @Override
    public void acelerar(String texto) {
        System.out.println(texto);
    }

    @Override
    public void desacelerar(String texto) {
        System.out.println(texto);
    }
}
