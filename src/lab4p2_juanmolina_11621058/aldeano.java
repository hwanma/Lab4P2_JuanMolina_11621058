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
public class aldeano extends familias{
    private String nombre;
    private String apellido;
    private int edad;
    private double vida;

    public aldeano() {
    }

    public aldeano(String nombre, String apellido, int edad, double vida) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "aldeanos{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", vida=" + vida + '}';
    }
    
    
}
