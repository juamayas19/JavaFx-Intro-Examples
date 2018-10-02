/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Voiture;

/**
 *
 * @author Estudiante
 */
public class Chassis {
    private int xref;
    private int yref;
    private int ancho;
    private int alto;

    public Chassis(int xref, int yref, int ancho, int alto) {
        this.xref = xref;
        this.yref = yref;
        this.ancho = ancho;
        this.alto = alto;
    }
    public void mover(int x, int y){
        this.xref=x;
        this.yref=y;
    }
}


