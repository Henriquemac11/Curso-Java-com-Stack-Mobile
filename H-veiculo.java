package POO.Heranca;

public class Veiculo {
    String cor;
    String modelo;
    String placa;

    public Veiculo(String cor, String modelo, String placa) {
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
    }

    public void detalhesVeiculo(String veiculo){
        System.out.println("Veiculo: " + veiculo);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
    }
    public void acelerar(String veiculo){
        System.out.println("O " + veiculo + " Está Acelerando...");
    }
    public void desacelerar(String veiculo){
        System.out.println("O " + veiculo + " Está Desacelerando...");
    }
    public void abastecer(String veiculo, String combustivel){
        System.out.println("O " + veiculo + " Está Abastecendo com " + combustivel);
    }
}
