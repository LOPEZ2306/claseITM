package claseITM;

public class ObjVehiculo {

    private String marca; 
    private String tipo;
    private int cilindraje;
    private Double pagoAnterior;
    private Double pagoActual;
    private int numeroCelda;

    //Constructor vacio
    public ObjVehiculo() {
    }

    //Constructor 
    public ObjVehiculo(String marca, String tipo, int cilindraje, Double pagoAnterior, Double pagoActual,
            int numeroCelda) {
        this.marca = marca;
        this.tipo = tipo;
        this.cilindraje = cilindraje;
        this.pagoAnterior = pagoAnterior;
        this.pagoActual = pagoActual;
        this.numeroCelda = numeroCelda;
    }

    //Getters and setters 
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public Double getPagoAnterior() {
        return pagoAnterior;
    }
    public void setPagoAnterior(Double pagoAnterior) {
        this.pagoAnterior = pagoAnterior;
    }
    public Double getPagoActual() {
        return pagoActual;
    }
    public void setPagoActual(Double pagoActual) {
        this.pagoActual = pagoActual;
    }
    public int getNumeroCelda() {
        return numeroCelda;
    }
    public void setNumeroCelda(int numeroCelda) {
        this.numeroCelda = numeroCelda;
    }
    

}
