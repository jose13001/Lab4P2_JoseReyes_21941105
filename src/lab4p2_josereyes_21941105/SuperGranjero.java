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
        return super.toString()+", ataque: "+ ataque+"Tipo= SuperGranjero ]";
    }
    @Override
     public int Ataque(Aldeanos atacar){
        if(atacar instanceof Herrero){
            return(int)Math.round(ataque*1.1);
        }else if(atacar instanceof Explosivo){
            return(int)Math.round(ataque*1.15);
        }
        return ataque;
    }
}
