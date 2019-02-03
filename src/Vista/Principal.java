/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Vista.Consola.PantallaPrincipal;
import Vista.JFrame.PantallaPricipal;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Pruebas
 */
public class Principal implements Interfaz{
    
    public static void seleccion(){
        String option;
        Scanner sc1 = new Scanner(System.in);
        System.out.println(universo0);
        System.out.println(principal1);
        System.out.println(principal2);
        System.out.println(principal3);
        option = sc1.nextLine();
        switch (option){
            case "1": console();
                break;
            case "2": jFrame();
                break;
            default: seleccion();
                break;
        }
    }
    
    public static void console(){
        PantallaPrincipal.pantallaPrincipal();
    }
    
    public static void jFrame(){
        JFrame pantallaPrincipal = new PantallaPricipal();
        pantallaPrincipal.setVisible(true);
    }
}
