/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author patri
 */
public class MenuTurnos {
    
    public static void menuTurnos()
    {
        
        int eleccionT=0;
        Scanner sc1 = new Scanner(System.in);
        do{
            System.out.println("Crear Nuevo(1), Modificar(2), Eliminar(3)");
            
            eleccionT = sc1.nextInt();
        }while (!(eleccionT==1 || eleccionT==2 || eleccionT==3));
        
        switch (eleccionT)
        {
            case 1: 
            break;
            case 2: 
            break;
            //case 3: Eliminar();
            //break;
        }
    }
}
