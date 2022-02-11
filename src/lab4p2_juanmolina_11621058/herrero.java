/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmolina_11621058;

import java.util.Random;

public class herrero extends aldeano{
    static Random r = new Random();
    
    private double ataque = 200+r.nextInt(300);

    public herrero() {
    }

    public herrero(String nombre, String apellido, int edad, double vida) {
        super(nombre, apellido, edad, vida);
        super.setVida(super.getVida()*1.5);
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "herrero{" + "ataque=" + ataque + '}';
    }
    
    
    
    
    
}
