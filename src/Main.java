import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fibonacci fibonacci = new Fibonacci();

        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (fibonacci.pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }

        VerificarString verificarString = new VerificarString();
        verificarString.verificarString("alan");

        CalcularSoma calcularSoma = new CalcularSoma();
        calcularSoma.calculaSoma();


        System.out.println("\nPróximo elemento da sequência a: " + Sequencia.proximoElementoSequenciaA());
        System.out.println("\nPróximo elemento da sequência b: " + Sequencia.proximoElementoSequenciaB());
        System.out.println("\nPróximo elemento da sequência c: " + Sequencia.proximoElementoSequenciaC());
        System.out.println("\nPróximo elemento da sequência d: " + Sequencia.proximoElementoSequenciaD());
        System.out.println("\nPróximo elemento da sequência e: " + Sequencia.proximoElementoSequenciaE());
        System.out.println("\nPróximo elemento da sequência f: " + Sequencia.proximoElementoSequenciaF());

        Interruptor interruptor = new Interruptor();
        System.out.println(interruptor.identificarInterruptores());
    }
}