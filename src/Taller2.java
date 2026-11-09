import java.util.Scanner;
public class Taller2 implements Puntos {

    @Override
    public Object Unir(String palabra1, String palabra2) {

        return palabra1 + palabra2;
    }

    @Override
    public Object Saludo(String Nombre) {

        return "hola" + Nombre;
    }

    @Override
    public int cuadrado(int numero) {

        return numero * numero;
    }

    @Override
    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    @Override
    public String operaciones(double numero1, double numero2) {
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double multiplicacion = numero1 * numero2;
        double division = numero1 / numero2;
        double residuo = numero1 % numero2;


        return "suma=" + suma + ", resta=" + resta + ", multiplicacion=" + multiplicacion + " , Division=" + division + ", residuo= " + residuo;
    }

    @Override
    public String decimayentero(double numero) {
        int entero = (int) numero;

        double decimal = numero - entero;

        return "la parte entera es " + entero + " , y la parte decimal es " + decimal;
    }

    @Override
    public double calcularpromedio(double n1, double n2, double n3, double n4, double n5) {
        double uno = n1 * 0.15;
        double dos = n2 * 0.20;
        double tres = n3 * 0.15;
        double cuatro = n4 * 0.30;
        double cinco = n5 * 0.20;

        double notafinal = uno + dos + tres + cuatro + cinco;


        return notafinal;
    }

    @Override
    public String CalcularIva(double PrecioBruto) {
        String precio = "El IVA es el 19%";
        double IVA = 0.19;
        double preciofinal = IVA * PrecioBruto;

        return "El precio bruto es" + PrecioBruto + "," + precio + ", el precio con el IVA incluido" + preciofinal;
    }

    @Override
    public String RadioyPerimetro(double radio) {
        double pi = 3.1416;
        double perimetro = 2 * radio * pi;
        double Area = pi * radio * radio;

        return "El perimetro es" + perimetro + ", el area es" + Area;
    }

    @Override
    public String AreaHexagono(double lado, double apotema) {
        double perimetro = lado * 6;
        double Areaprimerpaso = perimetro * apotema;
        double Area = Areaprimerpaso / 2;

        return "El area es" + Area;
    }

    @Override
    public double calcularPromedioN(int n) {
        if (n <= 0) {
            return 0;
        }
        Scanner numeros = new Scanner(System.in);
        double sumaTotal = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            double numeroIngresado = numeros.nextDouble();

            sumaTotal = sumaTotal + numeroIngresado;
        }
        double promedio = sumaTotal / n;
        return promedio;
    }

    @Override
    public double distancia(double x1, double y1, double x2, double y2) {
        double primerparentesis = x2 - x1;
        double segundoparentesis = y2 - y1;
        double potencia1 = primerparentesis * primerparentesis;
        double potencia12 = segundoparentesis * segundoparentesis;
        double suma = potencia1 + potencia12;
        double resultado = Math.pow(suma, 0.5);

        return resultado;
    }

    @Override
    public String generar(String n) {
        return "los valores generados son " + n + "," + n + n + "y" + n + n + n;
    }

    @Override
    public String tiempo(double n) {
// pregunta, no me deja colocar el double en una division, pq<? tengo que hacerlo con  un entero?
        double horas = n / 3600;
        double segundosRestantes = n % 3600;
        double minutos = segundosRestantes / 60;
        double segundos = segundosRestantes % 60;

        return "es " + horas + ":" + minutos + ":" + segundos;
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
    public String negativo(double n) {
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
    public String determinar(double n) {
        double descuento = 0.05;
        if (n > 150000) {
            n = n * descuento;
        }


        return "El precio es" + CalcularIva(n);
    }

    @Override
    public String resultado(double n1, double n2, double n3, double n4, double n5) {
        double notafin = calcularpromedio(n1, n2, n3, n4, n5);
        if (notafin > 4.5) {
            return "felicidades,aprobo con una nota admirable ";
        } else if (notafin >= 3.0) {
            return " aprobo";
        } else if (notafin >= 2.0) {
            return "reprobo";
        } else {
            return "reprobo, no podra habilitar";
        }

    }

    @Override
    public String ecuacion(double a, double b, double c) {
        if (a == 0) return "no es cuadratica";

        double parteenraiz = (b * b) - (4 * a * c);

        if (parteenraiz > 0) {
            double x1 = (-b + Math.sqrt(parteenraiz)) / (2 * a);
            double x2 = (-b - Math.sqrt(parteenraiz)) / (2 * a);
            return "x1 = " + x1 + "y x2 = " + x2;
        } else if (parteenraiz == 0) {
            double x = -b / (2 * a);
            return "su solucion es" + x;
        } else {
            return "No tiene raices reales";
        }
    }

    @Override
    public boolean login(String usu, String contra) {
        String uCorrecto = "lerisita";
        String cCorrecta = "1001";

        return usu.equals(uCorrecto) && contra.equals(cCorrecta);
    }

    @Override
    public String cualnumeroes(int num) {
        String[] lista = {"cero", "uno", "ddos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez"};
        if (num >= 0 && num <= 10) {
            return lista[num];
        }
        return "el numero no se encuentra";
    }

    @Override
    public int contardigitos(int num) {
        String texto = String.valueOf(num);
        if (num < 100000) {
            if (texto.startsWith("-")) {
                texto = texto.substring(1);
            }
        }
        return texto.length();

    }

    @Override
    public String revisarorden(double n1, double n2, double n3) {
        if (n1 < n2 && n2 < n3) {
            return "esta incrementando";
        } else if (n1 > n2 && n2 > n3) {
            return "esta disminuyendo";
        } else {
            return "ni se incrementa ni se disminuye";
        }
    }

    @Override
    public String diasdelasemana(int dia) {
        switch (dia) {
            case 1: return "lunes";
            case 2: return "martes";
            case 3: return "miercoles";
            case 4: return "jueves";
            case 5: return "viernes";
            case 6: return "sabado";
            case 7: return "domingo";
            default: return "ese dia de la semana no existe";
        }
    }

    @Override
    public String invertirTexto(String textooriginal) {
        if (textooriginal == null) return "";
        return new StringBuilder(textooriginal).reverse().toString(); //los string builder son para que se puedn modificar con ps algoritmos q ya esiten
    }

    @Override
    public String primeramayuscula(String texto) {
        if (texto == null || texto.isEmpty()) return "no hay texto";

        String[] palabras = texto.split(" "); //splitlousamos para limpiar
        StringBuilder resultado = new StringBuilder();

        for (String p : palabras) {
            if (!p.isEmpty()) {
                String primera = p.substring(0, 1).toUpperCase();
                String resto = p.substring(1).toLowerCase();
                resultado.append(primera).append(resto).append(" ");
            }
        }
        return resultado.toString().trim();

    }
    @Override
    public String penultimaPalabra(String texto) {
        if (texto == null) return "";

        String[] palabras = texto.trim().split(" ");
        if (palabras.length < 2) {
            return "No hay suficientes palabras";
        }

        return palabras[palabras.length - 2];
    }

    @Override
    public boolean contiene(String texto1, String locontiene) {
        if (texto1 == null || locontiene == null) return false;
        return locontiene.contains(texto1);
    }

    @Override
    public boolean espalindromo(String palabra) {
        if (palabra == null) return false;

        String limpia = palabra.replace(" ", "").toLowerCase();
        String alReves = new StringBuilder(limpia).reverse().toString();

        return limpia.equals(alReves);
    }


    @Override
    public double areaPoligono(int lado, double medida) {
        if (lado < 3 || medida <= 0) return 0;

        double area = (lado * medida * medida) / (4 * Math.tan(Math.PI / lado));
        return area;
    }

    //ultima parte


    @Override
    public void primerosNaturales() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    @Override
    public void primerosImpares() {
        int contador = 0;
        int numero = 1;
        while (contador < 10) {
            System.out.print(numero + " ");
            numero += 2;
            contador= contador+1;
        }
        System.out.println();
    }

    @Override
    public void primerosPares() {
        int contador = 0;
        int numero = 2;
        while (contador < 10) {
            System.out.print(numero + " ");
            numero += 2;
            contador++;
        }
        System.out.println();
    }

    @Override
    public void pedirNumeroPositivo() {
        Scanner teclado = new Scanner(System.in);
        int num;

        do {
            System.out.print("escribe un numero entero positivo=");
            num = teclado.nextInt();

            if (num <= 0) {
                System.out.println("ese no es un numero entero positivo, vuelve a empezar");
            }
        } while (num <= 0); // Se repite mientras sea 0 o negativo

        System.out.println("El numero valido que se ingreso es " + num);
    }

    @Override
    public String decimalABinario(int numero) {
        if (numero == 0) return "0";
//pqcuando el numero es 0 su binario es 0
        String binario = ""; //donde se van a acumulae los ceros y unos calculados
        int num = numero;

        while (num > 0) {
            int residuo = num % 2;
            binario = residuo + binario;
            num = num / 2;
        }
        return binario;
    }

    @Override
    public int binarioADecimal(String binario) {
        int decimal = 0;
        int posicion = 0;

        for (int i = binario.length() - 1; i >= 0; i--) {
            if (binario.charAt(i) == '1') {
                decimal += Math.pow(2, posicion);
            }
            posicion++;
        }
        return decimal;
    }

    @Override
    public void patronNumeros() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    @Override
    public void patronArrobas(int filas) { //triangulo del ejemplo
        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    @Override
    public void patronArrobasE(int filas) { //triangulo pedido
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (filas - i); j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }

    @Override
    public void patronEstrellas(int filas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (filas - i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



}



