/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmolina_11621058;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 String nombre, String apellido, int edad, double vida
 */
public class Lab4P2_JuanMolina_11621058 {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<familia> familias;
    
    public static void main(String[] args) {
        familia montesco = new familia("Montesco");
        herrero herrero1 = new herrero("Juan","Montesco",25,100);
        agronomo agronomo1 = new agronomo("Luis","Montesco",21,80);
        superGranjero romeo = new superGranjero("Romeo","Montesco",28,100);
        familias.add(montesco);
        montesco.getAldeanos().add(herrero1);
        montesco.getAldeanos().add(agronomo1);
        montesco.getAldeanos().add(romeo);
        
        familia capuleto = new familia("Capuleto");
        familias.add(capuleto);
        explosivo explosivo1 = new explosivo("Cesar","Capuleto",17,10);
        normal normal1 = new normal("Pamela","Capuleto",18,69);
        normal julieta = new normal("Julieta","Capuleto",27,100);
        capuleto.getAldeanos().add(explosivo1);
        capuleto.getAldeanos().add(normal1);
        capuleto.getAldeanos().add(julieta);
        
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            switch(menu()){
                case 0:{
                    System.out.println("Gracias por utilizar este programa!");
                    resp = 'n';
                    break;
                }
                
                case 1:{
                    System.out.println("Crear una Familia");
                    System.out.println("Ingrese el APELLIDO de la familia: ");
                    String apellido = sc.nextLine();
                    apellido = sc.nextLine();
                    
                    while(valid(apellido)){
                        System.out.println("Ingrese el APELLIDO de la familia: ");
                        apellido = sc.next();
                    }
                    
                    familias.add(new familia(apellido));
                    break;
                }
                
                case 2:{
                    System.out.println("Crear un Aldeano");
                    
                    boolean estado = true;
                    while(estado){
                        switch (profesion()) {
                            case 1: {
                                
                                normal nuevo = (normal)sol();
                                estado = false;
                                break;
                            }
                            
                            case 2: {
                                
                                pacifista nuevo = (pacifista)sol();
                                estado = false;
                                break;
                            }
                            
                            case 3: {
                                
                                herrero nuevo = (herrero)sol();
                                estado = false;
                                break;
                            }
                            
                            case 4: {
                                
                                agronomo nuevo = (agronomo)sol();
                                estado = false;
                                break;
                            }
                            
                            case 5: {
                                
                                explosivo nuevo = (explosivo)sol();
                                estado = false;
                                break;
                            }

                            default: {
                                System.out.println("!!");
                                System.out.println("Error, por favor introduzca un valor del menu.");
                                System.out.println("!!");
                                System.out.println(" ");
                                break;
                            }
                        }
                    }
                    
                    break;
                }
                
                case 3:{
                    break;
                }
                
                case 4:{
                    break;
                }
                
                default:{
                    System.out.println("!!");
                    System.out.println("Error, por favor introduzca un valor del menu.");
                    System.out.println("!!");
                    System.out.println(" ");
                    break;
                }
            }
        }
        
    }
    
    public static int menu(){
        System.out.println("");
        System.out.println("********ROMEO Y JULIETA*******");
        System.out.println("************MENU***********");
        System.out.println("0. Salir\n"
                + "1. Crear Familia\n"
                + "2. Crear Aldeano\n"
                + "3. Imprimir Familias\n"
                + "4. Pelear\n"
                + "Ingrese la opcion: ");
        return sc.nextInt();
    }
    
    public static boolean valid(String x){
        boolean estado = false;
        
        for(int i=0;i<familias.size();i++){
            if(x==((familia)familias.get(i)).getApellido()){
                System.out.println("Esta familia ya existe!");
                estado = true;
                break;
            }
        }
        
        return estado;
    }
    
    public static int profesion(){
        System.out.println("");
        System.out.println("********PROFESIONES*******");
        System.out.println("1. Normal\n"
                + "2. Pacifista\n"
                + "3. Herrero\n"
                + "4. Agronomo\n"
                + "5. Explosivo\n"
                + "Ingrese la opcion: ");
        return sc.nextInt();
    }
    
    public static aldeano sol(){
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        nombre = sc.nextLine();
        
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        apellido = sc.nextLine();
        
        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        
        System.out.println("Ingrese la vida: ");
        double vida = sc.nextDouble();
        
        aldeano aldeano = new aldeano(nombre,apellido,edad,vida);
        
        return aldeano;
    }
    
}
