/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmolina_11621058;


public class normal extends aldeano{
    private double ataque = 50;

    public normal() {
    }

    public normal(String nombre, String apellido, int edad, int vida) {
        super(nombre, apellido, edad, vida);
    }
    
    public normal(aldeano aldeano){
        
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "normal{" + "ataque=" + ataque + '}';
    }
    
    
}
