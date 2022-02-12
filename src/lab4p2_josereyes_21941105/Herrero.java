/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_josereyes_21941105;

import java.util.Random;

/**
 *
 * @author josec
 */
public class Herrero extends Aldeanos{
    Random d =new Random();

    public Herrero() {
    }

    public Herrero(String nombre, String Apellido, int Edad, int vida) {
        super(nombre, Apellido, Edad, vida);
        vida+=vida*50/100;
        ataque = d.nextInt(500-200)+200;
    }
     @Override
    public String toString(){
        return super.toString()+", ataque: "+ ataque+"Tipo= Herrero ]";
    }
    @Override
     public int Ataque(Aldeanos atacar){
        if(atacar instanceof Agronomo){
            return(int)Math.round(ataque*1.1);
        }else if(atacar instanceof Pacifistas){
            return(int)Math.round(ataque*1.05);
        }
        return ataque;
    }
     
}
