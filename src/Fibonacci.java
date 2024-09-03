public class Fibonacci {

    public int fibonacci(int numero) {
        if (numero < 2) {
            return numero;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }

    public boolean pertenceFibonacci(int numero) {
        if (numero < 0) {
            return false;
        }

        int a = 0;
        int b = 1;
        if (numero == a || numero == b) {
            return true;
        }

        while (b <= numero) {
            int temp = a;
            a = b;
            b = temp + b;

            if (b == numero) {
                return true;
            }
        }

        return false;
    }
}

