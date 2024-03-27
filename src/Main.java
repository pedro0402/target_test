public class Main {
    public static void main(String[] args) {

        //PRIMEIRA QUESTÃO
        System.out.println(resultadoSoma()); //VALOR DA SOMA = 91

        System.out.println("----------------------------------");

        int numero = 21;

        //SEGUNDA QUESTÃO
        if (pertenceASequencia(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        System.out.println("----------------------------------");

        //TERCEIRA QUESTÃO
        logicaProxElemento();

        System.out.println("----------------------------------");

        //QUARTA QUESTÃO

        interruptor();

        System.out.println("----------------------------------");

        //QUINTA QUESTÃO

        String minhaString = "Meu nome é Pedro, e sou Botafogo!!";
        System.out.println("normal(" + minhaString + ") = " + reverseInputString(minhaString));

    }


    public static int resultadoSoma(){
        int indice = 13, soma = 0, k = 0;

        while (k < indice){
            k += 1;
            soma += k;

        }

       return soma;
    }


    public static boolean pertenceASequencia(int numero) {
        int a = 0, b = 1;
        while (b <= numero) {
            if (b == numero) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }


    public static void logicaProxElemento(){
        System.out.println("1, 3, 5, 7, 9");
        System.out.println("2, 4, 8, 16, 32, 64, 128");
        System.out.println("0, 1, 4, 9, 16, 25, 36, 49");
        System.out.println("4, 16, 36, 64, 100");
        System.out.println("1, 1, 2, 3, 5, 8, 13");
        System.out.println("2, 10, 12, 16, 17, 18, 19, 20");
    }

    public static void interruptor(){
        System.out.println("Liga o primeiro interruptor. \nEspera 1 minuto e desliga.\n" +
                "após desliga-lo, liga o segundo interruptor e vai até a sala.\n" +
                "a lâmpada desligada e quente representa o primeiro interruptor, a ligada representa" +
                " o segundo, \ne desligada e fria representa o terceiro interruptor.");
    }

    public static String reverseInputString(String myString) {

        if (myString == null)
            return myString;

        String reverseString = "";

        for (int i = myString.length() - 1; i >= 0; i--) {

            reverseString = reverseString + myString.charAt(i);
        }
        return reverseString;
    }

}