/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmolina_11621058;


public class explosivo extends aldeano{
    private double ataque = 250;

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public explosivo() {
    }

    public explosivo(String nombre, String apellido, int edad, double vida) {
        super(nombre, apellido, edad, vida);
    }

    @Override
    public String toString() {
        return "explosivo{" + "ataque=" + ataque + '}';
    }

    
    
    
}
