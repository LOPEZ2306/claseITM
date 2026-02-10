package claseITM;

import java.util.Scanner;

public class Metodos {
    
    Scanner sc = new Scanner(System.in);

    public ObjVehiculo[] LlenarRegistros(ObjVehiculo[] r){

        for (int i=0; i<r.length; i++){
            ObjVehiculo obj = new ObjVehiculo();
            System.out.println("------");
            System.out.println("Ingrese la marca: ");
            obj.setMarca(sc.next());
            System.out.println("Ingrese el tipo: ");
            obj.setTipo(sc.next());
            System.out.println("Ingrese el cilindraje: ");
            obj.setCilindraje(sc.nextInt());

            if (obj.getCilindraje() > 900 && obj.getCilindraje()<1700)
            {
                obj.setPagoAnterior(150.0000);
            }else if(obj.getCilindraje()>=1700 && obj.getCilindraje()<2000){
                obj.setPagoAnterior(200.000);
            }else {
                obj.setPagoAnterior(250.000);
            }

            obj.setNumeroCelda(i+1);
            r[i]= obj;

        }
    return r;
    }

    public ObjVehiculo[] CalcularNuevoPago(ObjVehiculo[] r){
        for (int i=0; i < r.length; i++){
            r[i].setPagoActual(r[i].getPagoAnterior()*1.23);
        }
        return r; 
    }

    public void MostrarRegistros(ObjVehiculo[] r){

        for(int i=0; i < r.length; i++){

            System.out.println("-----RESULTADO-----");
            System.out.println("Marca: "+r[i].getMarca());
            System.out.println("Tipo de vehiculo: "+r[i].getTipo());
            System.out.println("Cilindraje: "+r[i].getCilindraje());
            System.out.println("¨Pago Anterior: "+r[i].getPagoAnterior());
            System.out.println("Pago Actual: "+r[i].getPagoActual());
            System.out.println("Numero de celda: "+r[i].getNumeroCelda());

        }
    }
    
}
