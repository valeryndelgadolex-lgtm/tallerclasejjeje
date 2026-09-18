
import java.util.Iterator;

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

    }


}
