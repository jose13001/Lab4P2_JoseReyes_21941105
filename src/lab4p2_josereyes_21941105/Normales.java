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
public class Normales extends Aldeanos {

    public Normales() {
    }

    public Normales(String nombre, String Apellido, int Edad, int vida) {
        super(nombre, Apellido, Edad, vida);
        ataque=50;
    }
    
     @Override
    public String toString(){
        return super.toString()+", ataque: "+ ataque+"Tipo= Normal ]";
    }
    
    @Override
    public int Ataque(Aldeanos atacar){
        if(atacar instanceof Pacifistas){
            return(int)Math.round(ataque*1.05);
        }
        return ataque;
    }

    
    
    
}
