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
public class Explosivo extends Aldeanos{

    public Explosivo() {
    }

    public Explosivo(String nombre, String Apellido, int Edad, int vida) {
        super(nombre, Apellido, Edad, vida);
        ataque=250;
    }
     @Override
    public String toString(){
        return super.toString()+", ataque: "+ ataque+"Tipo= Explosivo ]";
    }
    @Override
     public int Ataque(Aldeanos atacar){
        if(atacar instanceof Herrero){
            return(int)Math.round(ataque*1.05);
        }else if(atacar instanceof Agronomo){
            return(int)Math.round(ataque*1.1);
        }
        return ataque;
    }
    
}
