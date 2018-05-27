/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elementos;

import java.awt.geom.Point2D;

/**
 *
 * @author USUARIO
 */
public class Ecuacion {
    private double x1;
    private double x2;
    private String signo;
    private double b;

    public Ecuacion(double x1,double x2,String signo,double b) {
        this.x1 = x1;
        this.x2 = x2;
        this.signo = signo;
        this.b = b;
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
    
    // Calcula el punto en el eje x1 de la restriccion
    public Point2D.Double calcularPuntoX1(){
        return new Point2D.Double(b/x1,0);
    }
    // Calcula el punto en el eje x2 de la restriccion
    public Point2D.Double calcularPuntoX2(){    
        return new Point2D.Double(0,b/x2);
    }
    
    public Point2D.Double calcularInterseccion(Ecuacion r2){
        double x1 = (this.b * r2.getX2() - this.getX2() * r2.getB())/(this.getX1() * r2.getX2() - this.getX2() * r2.getX1());
        double x2 = (this.getX1() * r2.getB() - this.b * r2.getX1())/(this.getX1() * r2.getX2() - this.getX2() * r2.getX1());
        return new Point2D.Double(x1,x2);        
    }
    public double getSlack(double x1, double x2){
        return Math.abs(this.x1 * x1 + this.x2 * x2 - this.b);
    }
    
}