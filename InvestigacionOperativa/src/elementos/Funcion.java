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
public class Funcion {
    private boolean maximizacion;
    private double x1;
    private double x2;

    public Funcion(double x1, double x2,boolean maximizacion) {
        this.maximizacion= maximizacion;
        this.x1 = x1;
        this.x2 = x2;
    }

    public boolean isMaximizacion() {
        return maximizacion;
    }

    public void setMaximizacion(boolean maximizacion) {
        this.maximizacion = maximizacion;
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
    
    public double evaluarEn(double x1, double x2){
        return this.x1 * x1 + this.x2 * x2;
    }
    
    public boolean solucionInfinita(Ecuacion r1,Ecuacion r2){
        Double mf,mr1,mr2;
        Point2D.Double p1r1 = r1.calcularPuntoX1();
        Point2D.Double p2r1 = r1.calcularPuntoX2();
        Point2D.Double p1r2 = r2.calcularPuntoX1();
        Point2D.Double p2r2 = r2.calcularPuntoX2();
        mr1 = ((p2r1.getY()) - (p1r1.getY()))/((p2r1.getX()) - (p1r1.getX())); //Calcula pendiente de la restriccion1
        mr2 = ((p2r2.getY()) - (p1r2.getY()))/((p2r2.getX()) - (p1r2.getX())); //Calcula pendiente de la restriccion2
        mf = -(x1/x2);// Pendiente de la funcion
        //Compruebo que sean paralelas las rectas interesadas
        if(equals(mr1,mf) || equals(mr2, mf)){
            if(p2r1.getY() > p2r2.getY()){
                if(equals(mr1,mf) && this.isMaximizacion()){
                    return true;
                }
            }else{
                if(equals(mr2, mf) && this.isMaximizacion()){
                    return true;
                }
            }
            if(p2r1.getY() < p2r2.getY()){
                if(equals(mr1,mf) && !this.isMaximizacion()){
                    return true;
                }
            }else{
                if(equals(mr2, mf) && !this.isMaximizacion()){
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean equals(double a, double b) {
        if (a == b) {
            return true;
        }
        return Math.abs(a - b) < 0.000000001;
    }
}

