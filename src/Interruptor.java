public class Interruptor {

    private boolean[] interruptores = new boolean[3];
    private boolean[] lampadas = new boolean[3];
    private boolean[] aquecidas = new boolean[3];

    public void ligarInterruptor(int id) {
        interruptores[id] = true;
    }

    public void desligarInterruptor(int id) {
        interruptores[id] = false;
    }

    public void acenderLuz(int id) {
        lampadas[id] = true;
        aquecidas[id] = true;
    }

    public void apagarLuz(int id) {
        lampadas[id] = false;
        aquecidas[id] = false;
    }

    public String identificarInterruptores() {

        ligarInterruptor(0);

        desligarInterruptor(0);
        ligarInterruptor(1);


        acenderLuz(1);
        apagarLuz(2);


        String[] resultado = new String[3];
        for (int i = 0; i < 3; i++) {
            if (lampadas[i]) {
                resultado[i] = "Lâmpada " + i + " está acesa e é controlada pelo Interruptor " + (1);
            } else if (aquecidas[i]) {
                resultado[i] = "Lâmpada " + i + " está quente e é controlada pelo Interruptor " + (0);
            } else {
                resultado[i] = "Lâmpada " + i + " está fria e apagada e é controlada pelo Interruptor " + (2);
            }
        }

        return String.join(", ", resultado);
    }
}
