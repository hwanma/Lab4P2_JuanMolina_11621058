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
        montesco.getAldeanos().add(herrero1);
        montesco.getAldeanos().add(agronomo1);
        montesco.getAldeanos().add(romeo);
        
        familia capuleto = new familia("Capuleto");
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
    
}
