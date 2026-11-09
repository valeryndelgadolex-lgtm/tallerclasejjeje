public interface Puntos {
public Object Unir(String palabra1, String palabra2);
public Object Saludo(String Nombre);
public int cuadrado(int numero);
public int suma(int numero1, int numero2);
public String operaciones(double numero1, double numero2);
public String decimayentero(double numero);
public double calcularpromedio(double n1, double n2, double n3, double n4, double n5 );
public String CalcularIva(double PrecioBruto );
public String RadioyPerimetro(double radio);
public String AreaHexagono(double lado, double apotema);
public  double calcularPromedioN(int n);
    double distancia(double x1, double y1, double x2, double y2);
    String generar(String n);
    String tiempo(double n);

    //PARTE NUMERO 2
    String PAR(double n);
    String negativo(double n);
    String determinar(double n);
    String resultado(double n1, double n2, double n3, double n4, double n5);
    String ecuacion(double a, double b, double c);
    boolean login(String usu, String contra);

    String cualnumeroes(int num);

    int contardigitos(int num);

    String revisarorden(double n1, double n2, double n3);

    String diasdelasemana(int dia);

    String invertirTexto(String textooriginal);


    String primeramayuscula(String texto);

    String penultimaPalabra(String texto);

    boolean contiene(String txt1, String txt2);

    boolean espalindromo(String palabra);

    double areaPoligono(int lado, double medida);

    void primerosNaturales();

    void primerosImpares();

    void primerosPares();

    void pedirNumeroPositivo();

    String decimalABinario(int numero);

    int binarioADecimal(String binario);

    void patronNumeros();

    void patronArrobas(int filas);

    void patronArrobasE(int filas);

    void patronEstrellas(int filas);
}