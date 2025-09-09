public class Main {
    public static void main(String[] args) {

        //Tipo de dado + Identificação + valor atribuido

        //Tipos Primitivos:

        //String: vai receber textos == palavras e frases
        String nome = "Henrique";
        System.out.println(nome);

        //char: Suporta apenas um unico caracter
        char sexo = 'M';
        System.out.println(sexo);

        // Byte: -128 a 127 (1 byte de informação ou 8bit)
        byte idade = 20;
        System.out.println(idade);

        //short: -32768 a 32767 (2 Bytes de informações ou 16Bits)
        short estoque = 3200;
        System.out.println(estoque);

        //int: -2147483648 a 2147483647 (2 Bilhões) ( 4 Bytes de informação ou 32Bits)
        int num = 2147483647;
        System.out.println(num);

        // long: -9223372036854775888 a 9223372936854775887 (8 Bytes de informação ou 64 bits)
        long contaCorrente = 1234567890;
        System.out.println(contaCorrente);

        //Números Decimais:

        //float: casas decimais (4 bytes de informação ou 32Bits)
        float real = 10.50f;
        System.out.println(real);

        //double: 15 casas decimais 12345679123456 (8 Bytes de informaçaõ ou 64 Bits)
        double dolar = 123.456;
        System.out.println(dolar);

        // boolean:  pode assumir apenas um entre dois valores: true ou false
        boolean botaoAtivado = true;
        System.out.println(botaoAtivado);
        boolean botaoDesativado = false;
        System.out.println(botaoDesativado);

        // var: você não especifica o tipo da variável, e o compilador o deduz a partir do valor atribuído a ela
        var sobrenome = "Maciel";
        System.out.println(sobrenome);
        /*
        //Classes Wrappes: São objetos, que acessam métodos e funçoes
        
        Byte idade = 120;
        Short estoque = 32767;
        Integer quantidade = 1000;
        Long contaCorrente = 500000L;
        Float saldo = 500000.0F;
        Double saldoTotal = 500000.0;
        Character sexo = 'M';
        Boolean status = true;

        System.out.println();
*/

    }
}
