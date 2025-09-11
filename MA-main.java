import POO.Carro;

public class Main {
    public static void main(String[] args) {
      /*
        Modificadores de acesso

        public -> todos as classes terao acesso
        private -> Só pode ser acessado de dentro da classe
        protected -> Visivel somente em subclasses
     */

    Carro carro = new Carro("Vemelho", "Ferrari", "YUI876");
    carro.marcha();
    carro.ligar();
    }
}
