//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static int factorial ( int n){
        if (n == 0) {
            return 1;
        }
        int factorialhastaelmomento = n * factorial(n - 1);
        return factorialhastaelmomento;
    }

    static int suma ( int n){
        if (n == 0) {
            return 0;
        }
        int sumahastaelmomento = n + suma(n - 1);
        return sumahastaelmomento;
    }

    static int potencia ( int exponente, int base){
        if (exponente == 0) {
            return 1;
        }
        int potenciahastaahora = base * potencia(exponente - 1, base);
        return potenciahastaahora;
    }

    static int contardigitos (String n){
        if (n.length() == 0) {
            return 0;

        }
        int longitudhastaahora = 1 + contardigitos(n.substring(1));
        return longitudhastaahora;
    }

    static String invertir (String palabra){
        if (palabra == null || palabra.isEmpty()) {
            return palabra;

        }
        return invertir(palabra.substring(1)) + palabra.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}