public class CalcularSoma {

    public void calculaSoma(){
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("\nO valor de SOMA é: " + SOMA);
    }

}
