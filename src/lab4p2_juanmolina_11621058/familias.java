/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmolina_11621058;

import java.util.ArrayList;

/**
 *
 * @author Hwan
 */
public class familias {
    private String apellido;
    private ArrayList<aldeano> aldeanos;

    public familias() {
    }

    public familias(String apellido, ArrayList<aldeano> aldeanos) {
        this.apellido = apellido;
        this.aldeanos = aldeanos;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<aldeano> getAldeanos() {
        return aldeanos;
    }

    public void setAldeanos(ArrayList<aldeano> aldeanos) {
        this.aldeanos = aldeanos;
    }

    @Override
    public String toString() {
        return "familias{" + "apellido=" + apellido + ", aldeanos=" + aldeanos + '}';
    }
    
    
}
