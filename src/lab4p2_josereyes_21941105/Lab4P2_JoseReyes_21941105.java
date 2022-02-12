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
        System.out.print("Ingrese la vida: ");
        int vida = lea.nextInt();
        for (Familias fam :familia){
            if (fam.apellido.equals(apellido)){
                System.out.println("1 - Normal\n2 - Pacifista\n3 - Herrero\n4 - Agrónomo\n5 - Explosivo");
                System.out.print("Ingrese el tipo de aldeano: ");
                int tipo = lea.nextInt();
                
                switch(tipo){
                    case 1:
                        fam.aldeanos.add(new Normales (nombre, apellido, edad, vida));
                        break;
                    case 2:
                        fam.aldeanos.add(new Pacifistas (nombre, apellido, edad, vida));
                        break;
                    case 3:
                        fam.aldeanos.add(new Herrero (nombre, apellido, edad, vida));
                        break;
                    case 4:
                        fam.aldeanos.add(new Agronomo (nombre, apellido, edad, vida));
                        break;
                    case 5:
                        fam.aldeanos.add(new Explosivo (nombre, apellido, edad, vida));
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
        System.out.println("Ingrese el apellido de la familia Rival: ");
        String apellido=lea.next();
        Familias rival = buscarFamilias(apellido);
        Familias montesco = buscarFamilias("Montesco");
         if (rival!=null && rival.aldeanos.size()>=1){
            System.out.println("Montesco vs. "+apellido);
            Collections.shuffle(rival.aldeanos);
            Collections.shuffle(montesco.aldeanos);
            int x=0,y=0;
            while(rival.aldeanos.size()>0 && montesco.aldeanos.size()>0){
                Aldeanos Rival = rival.aldeanos.get(x);
                Aldeanos Montesco = montesco.aldeanos.get(y);
                
                while(Rival.vida>0 && Montesco.vida>0){
                    int ataque=Montesco.Ataque(Rival);
                    if(ataque !=0){
                        Rival.vida-=ataque;
                        System.out.println(Montesco.nombre+" ha atacado a "+Rival.nombre+" haciendole "
                        + ataque+ " de damage dejandolo con "+Rival.vida+"de vida.");
                    }
                    ataque = Rival.Ataque(Montesco);
                    if(ataque !=0){
                        Montesco.vida-=ataque;
                        System.out.println(Rival.nombre+" ha atacado a "+Montesco.nombre+" haciendole "
                        + ataque+ " de damage dejandolo con "+Montesco.vida+" de vida.");
                        
                    }
                }
                if(Rival.vida<0){
                    System.out.println(Montesco.nombre+" !HA GANADO LA PELEA! ");
                    rival.aldeanos.remove((rival.aldeanos.indexOf(Rival)));
                    x++;
                }
                else if (Montesco.vida<0){
                    System.out.println(Rival.nombre+" Ha ganado la pelea :( ");
                    montesco.aldeanos.remove((montesco.aldeanos.indexOf(Montesco)));
                }
                
                
            }
            
        }
        
    }
    
    
}
