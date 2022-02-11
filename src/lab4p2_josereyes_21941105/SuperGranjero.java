/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_josereyes_21941105;

/**
 *
 * @author josec
 */
public class SuperGranjero extends Aldeanos{

    public SuperGranjero() {
    }

    public SuperGranjero(String nombre, String Apellido, int Edad, int vida) {
        super(nombre, Apellido, Edad, 1000);        
        ataque=1000;
    }
    
    @Override
    public String toString(){
        return super.toString()+", ataque: "+ ataque;
    }
    
}
