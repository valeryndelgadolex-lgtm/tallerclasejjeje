public class Taller2 implements Puntos {

    @Override
    public Object Unir(String palabra1, String palabra2) {

        return  palabra1 + palabra2 ;
    }

    @Override
    public Object Saludo(String Nombre) {

        return  "hola" + Nombre ;
    }

    @Override
    public int cuadrado(int numero) {

        return numero * numero ;
    }

    @Override
    public int suma(int numero1, int numero2){
        return numero1 + numero2;
    }

    @Override
    public String operaciones(double numero1, double numero2){
        double suma = numero1 + numero2;
        double resta= numero1 - numero2;
        double multiplicacion = numero1* numero2;
        double division = numero1/numero2;
        double residuo= numero1%numero2;


        return "suma=" + suma + ", resta=" + resta + ", multiplicacion=" + multiplicacion + " , Division=" + division + ", residuo= " + residuo;
    }

    @Override
    public String decimayentero(double numero){
        int entero = (int) numero;

        double decimal = numero - entero;

        return "la parte entera es " + entero + " , y la parte decimal es " + decimal ;
    }

    @Override
    public double calcularpromedio(double n1, double n2, double n3, double n4, double n5 ){
        double uno = n1 * 0.15;
        double dos = n2 * 0.20;
        double tres = n3 * 0.15;
        double cuatro = n4 * 0.30;
        double cinco = n5 * 0.20;

        double notafinal= uno + dos + tres + cuatro + cinco;


        return notafinal;
    }

    @Override
    public String CalcularIva(double PrecioBruto ){
        String precio = "El IVA es el 19%";
        double IVA= 0.19;
        double preciofinal= IVA * PrecioBruto;

        return "El precio bruto es" + PrecioBruto +"," + precio + ", el precio con el IVA incluido" + preciofinal ;
    }

    @Override
    public String RadioyPerimetro(double radio ){
        double pi= 3.1416;
        double perimetro= 2*radio*pi;
        double Area= pi * radio* radio;

        return "El perimetro es" + perimetro + ", el area es" + Area;
    }

    @Override
    public String AreaHexagono(double lado, double apotema){
        double perimetro= lado*6;
        double Areaprimerpaso= perimetro * apotema;
        double Area= Areaprimerpaso/2;

        return "El area es" +  Area;
    }

    @Override
    public double calcularPromedioN(int n) {
//notngo idea de como hacer este
    }

    @Override
    public double distancia(double x1, double y1, double x2, double y2){
        double primerparentesis = x2-x1;
        double segundoparentesis= y2-y1;
        double potencia1= primerparentesis * primerparentesis;
        double potencia12= segundoparentesis * segundoparentesis;
        double suma= potencia1+potencia12;
        double resultado= Math.pow(suma, 0.5);

        return resultado;
    }

    @Override
    public String generar(String n) {
        return "los valores generados son " + n + "," + n + n + "y" + n + n + n;
    }

    @Override
    public double tiempo(double n) {
// pregunta, no me deja colocar el double en una division, pq<? tengo que hacerlo con  un entero?
        int horas = n / 3600;
        int segundosRestantes = n % 3600;
        int minutos = segundosRestantes / 60;
        int segundos = segundosRestantes % 60;

        return horas + ":" + minutos + ":" + segundos;
    }

//PARTE NUMERO 2
@Override
public String PAR(double n) {
    double numero = n % 2;

    if (numero == 0) {
        return "es par";
    } else {
        return "es impar";
    }
}

    @Override
    public String negativo(double n){
        if (n > 0) {
            return "es positivo";
        }
        if (n == 0) {
            return "es cero";
        } else {
            return "es impar";
        }

    }

    @Override
    public String determinar(double n){
        double descuento = 0.05;
        if (n > 150000){
            n = n*descuento;
        }


        return "El precio es" + CalcularIva(n);
    }

    @Override
    public String resultado(double n1, double n2, double n3, double n4, double n5 ){
        double notafin = calcularpromedio(n1, n2, n3, n4, n5);
        if (notafin< 2) {
            return " reprobo, no podra habilitar";
        }

    }

}
