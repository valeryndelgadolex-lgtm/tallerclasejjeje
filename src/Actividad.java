import java.util.Scanner;
public class Actividad {


    public static void main(String[] args) {
        double CapacidadMaxima = 18000;
        double CapacidadHastaahora = 0;
        int Numerodebultosingresados=0;
        double Bultomaspesado = 0;
        double Bultomasliviano = 501;
        double pesosingresados = 0;

        Scanner teclado = new Scanner(System.in);
        while (CapacidadHastaahora != CapacidadMaxima){
            System.out.println("para detener el algoritmo digite 0");
            System.out.println("ingrese el peso dle bulto");
            double pesoBulto = teclado.nextDouble();

            if (pesoBulto ==0){
                break;
            }

            if (pesoBulto <= 0 || pesoBulto > 500) {
                System.out.println("ese no es un peso valido, porfavor vuelva a inciar");
                continue;
            }

            if ( CapacidadHastaahora + pesoBulto > CapacidadMaxima) {
                System.out.println("el bulto excede la capacidad del avion");
                continue;
            }

            Numerodebultosingresados= Numerodebultosingresados+1;
            CapacidadHastaahora = CapacidadHastaahora + pesoBulto;

            if (pesoBulto > Bultomaspesado) {
                Bultomaspesado = pesoBulto;
            }
            if (pesoBulto < Bultomasliviano) {
                Bultomasliviano = pesoBulto;
            }

            double precioindividual = 0;
            if (pesoBulto >= 0 && pesoBulto <= 25) {
                precioindividual = 0;
            } else if (pesoBulto <= 300) {
                precioindividual = pesoBulto * 1500;
            } else {
                precioindividual = pesoBulto * 2500;
            }

            pesosingresados= precioindividual+ pesosingresados;

            System.out.println("[Bulto " + Numerodebultosingresados + "][Precio en pesos: $" + precioindividual + "][Precio en dolares: $" + (precioindividual / 3237) + "]");


       }
            System.out.println("a. numero de bultos ingresados"+ Numerodebultosingresados);
            System.out.println("b. bulto mas pesado: "+ Bultomaspesado+ " y bulto mas liviano: " + Bultomasliviano) ;
            System.out.println("c. promedio de pesos: "+ CapacidadHastaahora/Numerodebultosingresados) ;
            System.out.println("d. ingreso en pesos: "+ pesosingresados+ " ingreso en dolares: " + pesosingresados*3237);

    }

    }
