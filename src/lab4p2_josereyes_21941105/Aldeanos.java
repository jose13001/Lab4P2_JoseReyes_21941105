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
public class Aldeanos {
    public String nombre;
    public String Apellido;
    public int Edad;
    public int vida;
    public int ataque;
    
    public Aldeanos(){}

    public Aldeanos(String nombre, String Apellido,int Edad,int vida) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    

    @Override
    public String toString() {
        return "Aldeanos{" + "nombre=" + nombre + ", Apellido=" + Apellido +", Edad=" + Edad + ", vida=" + vida+ '}';
    }
    
}
