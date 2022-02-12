/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmolina_11621058;

import java.util.ArrayList;
import java.util.Scanner;

/*
 String nombre, String apellido, int edad, double vida
 */
public class Lab4P2_JuanMolina_11621058 {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<familia> familias = new ArrayList();
    
    public static void main(String[] args) {
        familia montesco = new familia("Montesco");
        montesco.getAldeanos().add(new herrero("Juan","Montesco",25,100));
        montesco.getAldeanos().add(new agronomo("Luis","Montesco",21,80));
        montesco.getAldeanos().add(new superGranjero("Romeo","Montesco",28,100));
        familias.add(montesco);
        System.out.println(montesco.toString());
        
        
        familia capuleto = new familia("Capuleto");
        capuleto.getAldeanos().add(new explosivo("Cesar","Capuleto",17,10));
        capuleto.getAldeanos().add(new normal("Pamela","Capuleto",18,69));
        capuleto.getAldeanos().add(new normal("Julieta","Capuleto",27,100));
        familias.add(capuleto);
        
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
                                Object[] datos = sol();
                                for (familia familia1 : familias) {
                                    if (familia1.getApellido().equalsIgnoreCase((String)datos[1])) {
                                        familia1.getAldeanos().add(new normal((String)datos[0],(String)datos[1],(int)datos[2],(double)datos[3]));
                                    }
                                }
                                
                                estado = false;
                                break;
                            }
                            
                            case 2: {
                                
                                Object[] datos = sol();
                                for (familia familia1 : familias) {
                                    if (familia1.getApellido().equalsIgnoreCase((String)datos[1])) {
                                        familia1.getAldeanos().add(new pacifista((String)datos[0],(String)datos[1],(int)datos[2],(double)datos[3]));
                                    }
                                }
                                
                                estado = false;
                                break;
                            }
                            
                            case 3: {
                                
                                Object[] datos = sol();
                                for (familia familia1 : familias) {
                                    if (familia1.getApellido().equalsIgnoreCase((String)datos[1])) {
                                        familia1.getAldeanos().add(new herrero((String)datos[0],(String)datos[1],(int)datos[2],(double)datos[3]));
                                    }
                                }
                                
                                estado = false;
                                break;
                            }
                            
                            case 4: {
                                
                                Object[] datos = sol();
                                for (familia familia1 : familias) {
                                    if (familia1.getApellido().equalsIgnoreCase((String)datos[1])) {
                                        familia1.getAldeanos().add(new agronomo((String)datos[0],(String)datos[1],(int)datos[2],(double)datos[3]));
                                    }
                                }
                                
                                estado = false;
                                break;
                            }
                            
                            case 5: {
                                
                                Object[] datos = sol();
                                for (familia familia1 : familias) {
                                    if (familia1.getApellido().equalsIgnoreCase((String)datos[1])) {
                                        familia1.getAldeanos().add(new explosivo((String)datos[0],(String)datos[1],(int)datos[2],(double)datos[3]));
                                    }
                                }
                                
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
                    
                    String acum = "";

                    for (familia temp : familias) {
                        acum += familias.indexOf(temp) + ". " + familias.toString() + "\n";
                    }
                    System.out.println(acum);
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
    
    public static boolean valid2(String x){
        boolean estado = false;
        
        for(int i=0;i<familias.size();i++){
            if(x!=((familia)familias.get(i)).getApellido()){
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
    
    public static Object [] sol(){
        System.out.println("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        nombre = sc.nextLine();
        
        System.out.println("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        apellido = sc.nextLine();
        
        while(!valid2(apellido)){
            System.out.println("Esta familia no existe!\n Ingrese otro apellido: ");
            apellido = sc.next();
        }
        
        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();
        
        System.out.println("Ingrese la vida: ");
        double vida = sc.nextDouble();
        
        Object[] lista = new Object[]{nombre,apellido,edad,vida};
        
        return lista;
    }
    
}
