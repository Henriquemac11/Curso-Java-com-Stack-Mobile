package POO;

import POO.Heranca.Veiculo;

public class Carro extends Veiculo {


    public Carro(String cor, String modelo, String placa) {
        super(cor, modelo, placa);
    }

    public void marcha(){
        System.out.println("Marcha!");
    }
    private void seta(){
        System.out.println("Seta!");
    }
    public void ligar(){
    this.ligarVeiculo();
    }
}
