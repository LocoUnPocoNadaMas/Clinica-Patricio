/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.AWTException;
import java.util.Scanner;

/**
 *
 * @author patri
 */
public class MenuPantallaPrincipal implements Literales{
    
    public static void menuPantallaPrincipal()// throws AWTException
    {
        int menuOpcion=0;
        Scanner sc1 = new Scanner(System.in);
        //System.out.print("\033[H\033[2J");
        //System.out.flush();
        System.out.println(mPantallaPrincipal2);
        System.out.println(mPantallaPrincipal3);
        System.out.println(mPantallaPrincipal4);
        System.out.println(mPantallaPrincipal5);
        System.out.println(mPantallaPrincipal6);
            //System.out.println(mPantallaPrincipal7);
        System.out.println(mPantallaPrincipal10);
        menuOpcion = sc1.nextInt();
        
        switch(menuOpcion){
            /*****************************************
             * Si no sabemos el dni no podemos
             * Modificar o Eliminar por lo tanto solo
             * damos la opcion de crear nuevo Paciente
             */
            case 1: NuevoPaciente.nuevoPaciente();
            break;
            /****************************************/
            case 2: MenuTurnos.menuTurnos();
            break;
            /****************************************/
            case 3: //MenuMedicos
            break;
            /****************************************/
            case 4: MenuPacientes.menuPacientes();
            break;
            /****************************************/
            case 0: PantallaPrincipal.pantallaPrincipal();
            break;
            /****************************************/
            default: PantallaPrincipal.pantallaPrincipal();
            break;
        }
    }
}
