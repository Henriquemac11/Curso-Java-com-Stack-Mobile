package POO;

public class Main {
    public static void main(String[] args) {


        Carro carro1 = new Carro("Azul", "Fiat", "ABC123");
        carro1.detalhesVeiculo("Carro");
        carro1.abastecer("Carro", "Álcool");

        System.out.println("\n");

        Moto moto1 = new Moto("Preto", "R15", "POI098");
        moto1.detalhesVeiculo("Moto");
        moto1.acelerar("Moto");



    }
}
