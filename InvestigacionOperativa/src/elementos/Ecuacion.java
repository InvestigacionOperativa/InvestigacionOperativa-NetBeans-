/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementos;

/**
 *
 * @author USUARIO
 */
public class Ecuacion {
    private double x1;
    private double x2;
    private double x3;
    private double x4;
    private String signo;
    private double b;

    public Ecuacion(double x1,double x2,String signo,double b) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = 0;
        this.x4 = 0;
        this.signo = signo;
        this.b = b;
    }
    // Calcula el punto en el eje x1 de la restriccion
    public String[] calcularPuntoX1(Funcion fun){
        String[] fila = new String[4];  //Devuelvo {"vacio", "x.xx", "x.xx", "x.xx"}
        double puntox1 = b/x1;
        double z = (puntox1 *(fun.getX1()));
        fila[1] = String.valueOf(puntox1);
        fila[2] = "0.00";
        fila[3] = String.valueOf(z);
        return fila;
    }
    // Calcula el punto en el eje x2 de la restriccion
    public String[]  calcularPuntoX2(Funcion fun){
        
        String[] fila = new String[4];
        double puntox2 = b/x2;
        double z = (puntox2 *(fun.getX2()));
        fila[2] = String.valueOf(puntox2);
        fila[1] = "0.00";
        fila[3] = String.valueOf(z);
        return fila;
    }
    
    public String[] calcularInterseccion(Funcion fun, Ecuacion r2){
        String[] fila = new String[4];
        double puntox2 = (r2.getB()-((r2.getX1()*this.b)/this.x1))*(1/(r2.getX1()* this.x2)+r2.getX2());
        double puntox1 = (b - (x2 * puntox2))/x1;
        double z = (puntox1 *(fun.getX1()))+(puntox2*(fun.getX2()));
        fila[1] = String.valueOf(puntox1);
        fila[2] = String.valueOf(puntox2);
        fila[3] = String.valueOf(z);
        return fila;
    }
    
    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }
}
