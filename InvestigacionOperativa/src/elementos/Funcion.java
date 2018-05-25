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
}
