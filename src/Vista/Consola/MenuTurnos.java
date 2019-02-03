/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Consola;

import java.util.Scanner;
import Vista.Interfaz;
/**
 *
 * @author patri
 */
public class MenuTurnos implements Interfaz{
    
    public static void menuTurnos()
    {
        int eleccionT=0;
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println(mTurno0);
        System.out.println(mTurno1);
        System.out.println(mTurno2);
        System.out.println(mTurno3);
        System.out.println(mTurno4);
        System.out.println(mTurno5);
        //System.out.println(mTurno6);
        System.out.println();
        System.out.println(mTurno10);
        eleccionT = sc1.nextInt();
        switch (eleccionT)
        {
            case 1: NuevoTurno.nuevoTurno();
            break;
            case 2: //
            break;
            case 3: //
            break;
            case 4: //
            break;
            case 5: //
            break;
            case 0: MenuPantallaPrincipal.menuPantallaPrincipal();
            break;
            default: MenuPantallaPrincipal.menuPantallaPrincipal();
            break;
        }
    }
}
