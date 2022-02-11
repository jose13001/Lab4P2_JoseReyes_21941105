/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_josereyes_21941105;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josec
 */
public class Lab4P2_JoseReyes_21941105 {
    static ArrayList<Familias> Familia =new ArrayList();
    static Scanner lea =new Scanner(System.in);
    
    public static void main(String[] args) {
        
        
        int opc;
        
        do{
        System.out.println("******MENU******");
        System.out.println("0. Salir");
        System.out.println("1. Crear Familia");
        System.out.println("2. Crear Aldeano");
        System.out.println("3. Imprimir Familias");
        System.out.println("4. Pelear");
        System.out.println("Ingrese una opcion: ");
        opc=lea.nextInt();
        switch(opc){
            case 0:
                System.out.println("Gracias Por Participar en la beta Abierta de juego"
                        + "Romeo Y julieta The Game saldra el proximo 30 de Febrero");
            break;
            
            case 1:
                System.out.println("****Crear Familia****");
                CrearFamilia(); 
            break;
            
            case 2:
                System.out.println("****Crear Aldeano****");
            break;
            
            case 3:
            break;
            
            case 4: 
            break;
        }
        
        
       
        }while(opc!=0);
        
    }
    public static boolean CrearFamilia(){
        System.out.print("Ingrese apellido: ");
        String apellido = lea.nextLine();
        for (Familias fam :Familia){
            if (fam.apellido.equals(apellido)){
                System.out.println("Esta familia ya existe");
                return false;
            }
        }
        Familia.add(new Familias(apellido));
        return true;
    }
    
}
