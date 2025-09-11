package POO;

public class Carro {
    // Propriedades | Atributos | Campos | Variaveis de instancia

    String cor;
    String modelo;
    String placa; // var de instancia
    static String pais; // var de classe

    public Carro(String cor, String modelo, String placa) {
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
    }

    //Método - Comportameto dp objeto, ações

    public void detalhesCarro(String pais){
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
       this.pais = pais;
        System.out.println("Pais: " + pais);
    }

    public void acelerar(){
        System.out.println("Acelerando...");
    }
    public void desacelerar(){
        System.out.println("Desacelerando...");
    }
    public void abastecer(){
        System.out.println("Abastecendo...");
    }

    /*
    //Getter and Setter:

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

     */


}
