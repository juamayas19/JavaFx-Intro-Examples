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
public class Voiture {
    private int xref;
    private int yref;
    private int ancho;
    private int alto;
    private Roue roues[] = new Roue[2];
    private Chassis chassis;

    public Voiture(int xref, int yref, int ancho, int alto) {
        this.xref = xref;
        this.yref = yref;
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getXref() {
        return xref;
    }

    public int getYref() {
        return yref;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public Roue[] getRoues() {
        return roues;
    }

    public Chassis getChassis() {
        return chassis;
    }
    
    public void mover(){
        this.xref++;
    }
    public void retroceder(){
        this.xref=this.xref-1;
    }
    
}
