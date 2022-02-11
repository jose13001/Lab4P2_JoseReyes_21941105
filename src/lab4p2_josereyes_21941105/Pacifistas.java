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
public class Pacifistas extends Aldeanos{
    String discurso;

    public Pacifistas() {
    }

    public Pacifistas(String nombre, String Apellido, int Edad, int vida) {
        super(nombre, Apellido, Edad, vida);
        ataque=0;
        discurso = "Pelear es malo >:( ";
    }
    
    
}
