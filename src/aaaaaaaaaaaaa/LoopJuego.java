/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aaaaaaaaaaaaa;

import Voiture.Voiture;
import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer{
    private GraphicsContext lapiz;
    private Voiture carro;
    public LoopJuego(GraphicsContext lapiz) {
        this.lapiz = lapiz;
        this.carro = new Voiture(30, 100, 20, 20);
    }
    @Override
    public void handle (long now){
        //Voiture
        lapiz.clearRect(0,0,300,300);
        lapiz.setFill(Color.AQUA);
        lapiz.strokeRect(this.carro.getXref(), this.carro.getYref(), this.carro.getAncho(), this.carro.getAlto());
        lapiz.fillRect(this.carro.getXref(), this.carro.getYref(), this.carro.getAncho(), this.carro.getAlto());
        lapiz.setFill(Color.BLACK);
        this.carro.mover();
        lapiz.strokeText("Puntaje: ", 200, 30);
        while (this.carro.getXref()>=280){
            this.carro.retroceder();
        }
        }
}
