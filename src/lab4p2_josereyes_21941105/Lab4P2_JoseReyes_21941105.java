/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_josereyes_21941105;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author josec
 */
public class Lab4P2_JoseReyes_21941105 {
    static ArrayList<Familias> familia =new ArrayList();
    static Scanner lea =new Scanner(System.in);
    
    public static void main(String[] args) {
        agFamilias();
        
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
                CrearAldeano();
            break;
            
            case 3:
                System.out.println("****Imprimir Familias****");
                for(Familias fam : familia){
                    System.out.println(fam.toString());
                }
            break;
            
            case 4: 
                System.out.println("****Pelea****");
                Pelear();
            break;
        }
        
        
       
        }while(opc!=0);
        
    }
    public static void agFamilias(){
        familia.add(new Familias("Montesco"));
        familia.get(0).aldeanos.add(new SuperGranjero("Romeo","Montesco",18,1000));
        familia.get(0).aldeanos.add(new Herrero("marcelo","Montesco",25,350));
        familia.get(0).aldeanos.add(new Agronomo("Alex","Montesco",22,10));
        familia.add(new Familias("Capuleto"));
        familia.get(1).aldeanos.add(new Normales("Julieta","Capuleto",17,1000));
        familia.get(1).aldeanos.add(new Pacifistas("Pedro","Capuleto",40,150));
        familia.get(1).aldeanos.add(new Herrero("Leonardo","Capuleto",17,300));
        familia.add(new Familias("Reyes"));
        familia.get(2).aldeanos.add(new Herrero("Jose","Reyes",20,600));
        familia.get(2).aldeanos.add(new Normales("Julio","Reyes",13,400));
        familia.get(2).aldeanos.add(new Pacifistas("Juana","Reyes",50,250));
    }
    
    
    public static boolean CrearFamilia(){
        System.out.print("Ingrese apellido: ");
        String apellido = lea.next();
        for (Familias fam :familia){
            if (fam.apellido.equals(apellido)){
                System.out.println("Esta familia ya existe");
                return false;
            }
        }
        System.out.println("****************");
        familia.add(new Familias(apellido));
        return true;
    }
    public static boolean CrearAldeano(){
        System.out.print("Ingrese nombre: ");
        String nombre=lea.next();
        System.out.print("Ingrese apellido: ");
        String apellido = lea.next();
        System.out.print("Ingrese edad: ");
        int edad = lea.nextInt();
        System.out.print("Ingrese puntos de vida: ");
        int puntosVida = lea.nextInt();
        for (Familias fam :familia){
            if (fam.apellido.equals(apellido)){
                System.out.println("1 - Normal\n2 - Pacifista\n3 - Herrero\n4 - Agrónomo\n5 - Explosivo");
                System.out.print("Ingrese el tipo de aldeano: ");
                int tipo = lea.nextInt();
                
                switch(tipo){
                    case 1:
                        fam.aldeanos.add(new Normales (nombre, apellido, edad, puntosVida));
                        break;
                    case 2:
                        fam.aldeanos.add(new Pacifistas (nombre, apellido, edad, puntosVida));
                        break;
                    case 3:
                        fam.aldeanos.add(new Herrero (nombre, apellido, edad, puntosVida));
                        break;
                    case 4:
                        fam.aldeanos.add(new Agronomo (nombre, apellido, edad, puntosVida));
                        break;
                    case 5:
                        fam.aldeanos.add(new Explosivo (nombre, apellido, edad, puntosVida));
                        break;
                }
                System.out.println("***************");
                return true;
            }
        }
        System.out.println("La familia "+ apellido+" no existe");
       return false; 
    }
     public static Familias buscarFamilias(String apellido){
        for (Familias fam: familia){
            if(fam.apellido.equals(apellido)){
                return fam;
            }
            
        }
        return null;
    }
    
    public static void Pelear(){
        System.out.println("Ingrese el apellido de la familia contricante: ");
        String apellido=lea.next();
        Familias contrincante = buscarFamilias(apellido);
        Familias montesco = buscarFamilias("Montesco");
         if (contrincante!=null && contrincante.aldeanos.size()>=1){
            System.out.println("Montesco vs. "+apellido);
            Collections.shuffle(contrincante.aldeanos);
            Collections.shuffle(montesco.aldeanos);
            int x=0,y=0;
            while(contrincante.aldeanos.size()>0 && montesco.aldeanos.size()>0){
                Aldeanos Contrincante = contrincante.aldeanos.get(x);
                Aldeanos Montesco = montesco.aldeanos.get(y);
                
                
                
            }
            
        }
        
    }
    
    
}
