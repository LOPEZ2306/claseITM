package claseITM;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Metodos m = new Metodos();
        int n=0;
        System.out.println("Ingrese la dimension del patio ");
        n=sc.nextInt();
        ObjVehiculo[] r = new ObjVehiculo[n];
        r= m.LlenarRegistros(r);
        r= m.CalcularNuevoPago(r);
        m.MostrarRegistros(r);
    }
    
}
