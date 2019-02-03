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
public class MenuPacientes implements Interfaz{
    
    
    public static void menuPacientes()
    {
        
        int opcion,opcion1=1;
        int abm;
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println(mPaciente0);
        System.out.println(mPaciente1);
        System.out.println(mPaciente2);
        System.out.println(mPaciente3);
        System.out.println(mPaciente4);
        //System.out.println(mPaciente5);
        System.out.println(mPaciente6);
        System.out.println();
        //System.out.println(mPaciente7);
        System.out.println(mPaciente10);
        
        opcion = sc1.nextInt();
        
        switch (opcion)
        {
            case 1: NuevoPaciente.nuevoPaciente();
            break;
            
            case 2: {
                abm=0;
                BusquedaPacientes.buscarPaciente(abm);
            }
            break;
            case 3: {
                abm=1;
                BusquedaPacientes.buscarPaciente(abm);
            }
            break;
            case 4: {
                abm=2;
                BusquedaPacientes.buscarPaciente(abm);
            }
            break;
            
            case 5: ListarPacientes.listarPacientes();
            break;
            
            default: MenuPacientes.menuPacientes();
            break;
        }
        while(opcion1!=0){
            System.out.println(mPaciente11);
            opcion1 = sc1.nextInt();
        }
        MenuPantallaPrincipal.menuPantallaPrincipal();
    }
}
