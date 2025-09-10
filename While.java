public class While {
    public static void main(String[] args) {

       /*
       while(condição){
       //Codigo
       }

        int contador = 0;

        while(contador <= 10){ //true
            contador++;
            System.out.println(contador);
        }
        */
      
        int i = 0;
        String[] listaCompras = {"Banana", "Carne", "Feijão", "Arroz",};
        while(listaCompras.length <= 4) {
            System.out.println(listaCompras[i]);
            i++;

        }
    }
}
