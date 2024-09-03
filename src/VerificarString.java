public class VerificarString {

    public void verificarString(String str) {
        int cont = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A') {
                cont++;
            }
        }
        System.out.println("\nContém " + cont + " letras A");
    }

}
