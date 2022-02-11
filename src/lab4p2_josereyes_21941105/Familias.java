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
    ArrayList<Aldeanos>aldeanos;
    String apellido;

    public Familias(String apellido) {
        this.apellido = apellido;
        aldeanos =new ArrayList <Aldeanos>();
    }

    @Override
    public String toString() {
        return "Familias{" + "aldeanos=" + aldeanos + ", apellido=" + apellido + '}';
    }
    
    

    
    
    
}
