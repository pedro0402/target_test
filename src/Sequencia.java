public class Sequencia {


    public static int proximoElementoSequenciaA() {
        int[] seq = {1, 3, 5, 7};
        return seq[seq.length - 1] + 2;
    }

    public static int proximoElementoSequenciaB() {
        int[] seq = {2, 4, 8, 16, 32, 64};
        return seq[seq.length - 1] * 2;
    }

    public static int proximoElementoSequenciaC() {
        int n = 7; // Posição na sequência (começa em 0)
        return n * n;
    }

    public static int proximoElementoSequenciaD() {
        int[] seq = {4, 16, 36, 64};
        int ultimoElemento = seq[seq.length - 1];
        int raizQuadrada = (int) Math.sqrt(ultimoElemento);
        return (raizQuadrada + 1) * (raizQuadrada + 1);
    }

    public static int proximoElementoSequenciaE() {
        int[] seq = {1, 1, 2, 3, 5, 8};
        return seq[seq.length - 1] + seq[seq.length - 2];
    }

    public static int proximoElementoSequenciaF() {
        int[] seq = {2, 10, 12, 16, 17, 18, 19};
        return seq[seq.length - 1] + 1;
    }
}



