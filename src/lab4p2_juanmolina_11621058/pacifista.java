/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmolina_11621058;

/**
 *
 * @author Hwan
 */
public class pacifista extends aldeano{
    private double ataque = 0;

    public pacifista() {
    }

    public pacifista(String nombre, String apellido, int edad, double vida) {
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
        return super.toString() + "pacifista{" + "ataque=" + ataque + '}';
    }
    
    public void pelea(aldeano nuevo){
        nuevo.setVida(nuevo.getVida()-ataque);
    }
    
    
}
