/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmolina_11621058;

import java.util.Random;


public class agronomo extends aldeano{
    static Random r = new Random();
    private double ataque = 100;

    public agronomo() {
    }

    public agronomo(String nombre, String apellido, int edad, double vida) {
        super(nombre, apellido, edad, vida);
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return super.toString() + "agronomo{" + "ataque=" + ataque + '}';
    }

    public void pelea(aldeano nuevo) {
        int random = 1 + r.nextInt(100);
        if (random >= 6) {
            if (nuevo instanceof pacifista) {
                nuevo.setVida(nuevo.getVida() - (ataque * 1.05));
            } else if (nuevo instanceof normal) {
                nuevo.setVida(nuevo.getVida() - (ataque * 1.10));
            } else {
                nuevo.setVida(nuevo.getVida() - (ataque));
            }
        }
    }
    
    
    
}
