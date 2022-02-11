/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_josereyes_21941105;

import java.util.ArrayList;

/**
 *
 * @author josec
 */
public class Familias {
    ArrayList<Aldeanos>Aldeanos = new ArrayList();
    String apellido;
    
    public Familias(){}

    public Familias(String apellido) {
        this.apellido = apellido;
    }

    public ArrayList<Aldeanos> getAldeanos() {
        return Aldeanos;
    }

    public void setAldeanos(Aldeanos agg) {
        this.Aldeanos.add(agg);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Familias{" + "Aldeanos=" + Aldeanos + ", apellido=" + apellido + '}';
    }
    
    
}
