/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4p2_juanmolina_11621058;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/*
 String nombre, String apellido, int edad, double vida
 */
public class Lab4P2_JuanMolina_11621058 {
    static Scanner sc = new Scanner(System.in);
    static Random r = new Random();
    public static ArrayList<familia> familias = new ArrayList();
    
    public static void main(String[] args) {
        familia montesco = new familia("Montesco");
        montesco.getAldeanos().add(new herrero("Juan","Montesco",25,100));
        montesco.getAldeanos().add(new agronomo("Luis","Montesco",21,80));
        montesco.getAldeanos().add(new superGranjero("Romeo","Montesco",28,100));
        familias.add(montesco);
        
        familia capuleto = new familia("Capuleto");
        capuleto.getAldeanos().add(new explosivo("Cesar","Capuleto",17,10));
        capuleto.getAldeanos().add(new normal("Pamela","Capuleto",18,69));
        capuleto.getAldeanos().add(new normal("Julieta","Capuleto",27,100));
        familias.add(capuleto);
        
        familia molina = new familia("Molina");
        molina.getAldeanos().add(new agronomo("Diego","Molina",24,105));
        molina.getAldeanos().add(new herrero("Javier","Molina",42,75));
        molina.getAldeanos().add(new pacifista("Fernando","Molina",27,100));
        familias.add(molina);
        
        char resp = 's';
        while (resp == 's' || resp == 'S') {
            switch(menu()){
                case 0:{
                    System.out.println("Gracias por utilizar este programa!");
                    resp = 'n';
                    break;
                }
                
                case 1:{
                    System.out.println("******************************");
                    System.out.println("Crear una Familia");
                    System.out.println("Ingrese el APELLIDO de la familia: ");
                    String apellido = sc.nextLine();
                    apellido = sc.nextLine();
                    
                    while(valid(apellido)){
                        System.out.println("Ingrese el APELLIDO de la familia: ");
                        apellido = sc.next();
                    }
                    
                    familias.add(new familia(apellido));
                    System.out.println("******************************");
                    break;
                }
                
                case 2:{
                    System.out.println("******************************");
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
                    System.out.println("******************************");
                    break;
                }
                
                case 3:{
                    System.out.println("******************************");
                    System.out.println("Imprimir Familias");
                    String acum = "";

                    for (familia temp : familias) {
                        acum += familias.indexOf(temp) + ". " + familias.toString() + "\n";
                    }
                    System.out.println(acum);
                    System.out.println("******************************");
                    break;
                }
                
                case 4:{
                    System.out.println("******************************");
                    
                    if(familias.size()>2){
                        System.out.println("Ingrese el apellido de la familia que desea que pelee: ");
                        String apellidoFamilia = sc.nextLine();
                        apellidoFamilia = sc.nextLine();
                        while(apellidoFamilia == "Capuleto"){
                            System.out.println("Aun no puede pelear la familia Capuleto: ");
                            apellidoFamilia = sc.nextLine();
                        }
                        for (familia enemigo : familias) {
                            if(enemigo.getApellido().equalsIgnoreCase(apellidoFamilia)){
                                Collections.shuffle(montesco.getAldeanos(), r);
                                Collections.shuffle(enemigo.getAldeanos(), r);
                                
                                
                            }
                        }
                    }
                    
                    
                    System.out.println("******************************");
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
        System.out.println("**************MENU************");
        System.out.println("******************************");
        System.out.println("0. Salir\n"
                + "1. Crear Familia\n"
                + "2. Crear Aldeano\n"
                + "3. Imprimir Familias\n"
                + "4. Pelear\n"
                + "Ingrese la opcion: ");
        System.out.println("******************************");
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
    
    public void duelo(familia aliado, familia enemigo){
        aldeano aliadoP = aliado.getAldeanos().get(0);
        enemigo.getAldeanos().get(0);
        
        if(aliado.getAldeanos() instanceo)
    }
    
}
