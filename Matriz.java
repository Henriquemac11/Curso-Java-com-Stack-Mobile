import java.util.Scanner;

public class Matriz {
    public static void main(String[] args){
        // Declaração
        int[][] numeros;

    // Criação com tamanho definido (3 linhas e 3 colunas)
        numeros = new int[3][3];

    // Ou declaração e criação juntos:
        // int[][] matriz = new int[3][3];

        // Inicializacao direta
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(matriz[0][1]); // Imprime 2 (linha 0, coluna 1)
        System.out.println(" ");

        matriz[2][2] = 99;               // Altera último elemento para 99

        for (int i = 0; i < matriz.length; i++) {           // Percorre as linhas
            for (int j = 0; j < matriz[i].length; j++) {    // Percorre as colunas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Pula linha após cada linha da matriz
        }

        // Preenchendo Matriz
        int[][] matriz1 = new int[2][2];
        Scanner sc = new Scanner(System.in);

        // Preenchendo a matriz
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz1[i][j] = sc.nextInt();
            }
        }

        // Exibindo a matriz
        // Obs:  ( : ) indica: para cada elemento em;
        System.out.println("\nMatriz digitada:");
        for (int[] linha : matriz1) {  // linha de cada matriz
            for (int valor : linha) { // número dentro da linha
                System.out.print(valor + " ");
            }
            System.out.println(); // pular linha quando completa
        }
    }


    }

