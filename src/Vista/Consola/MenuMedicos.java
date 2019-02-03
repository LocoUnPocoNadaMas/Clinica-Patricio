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
 * @author Pruebas
 */
public class MenuMedicos implements Interfaz{
    
    private static void menuMedicos(){
        
        int opcion,opcion1=1;
        int abm;
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println();
        System.out.println(mMedico0);
        System.out.println(mMedico1);
        System.out.println(mMedico2);
        System.out.println(mMedico3);
        System.out.println(mMedico4);
        System.out.println(mMedico5);
        System.out.println(mMedico6);
        System.out.println(mMedico7);
        System.out.println(mMedico11);
        
        opcion = sc1.nextInt();
        
        switch (opcion)
        {
            case 1: //NuevoPaciente.nuevoPaciente();
            break;
            
            case 2: {
                abm=0;
                //BusquedaPacientes.buscarPaciente(abm);
            }
            break;
            case 3: {
                abm=1;
                //BusquedaPacientes.buscarPaciente(abm);
            }
            break;
            case 4: {
                abm=2;
                //BusquedaPacientes.buscarPaciente(abm);
            }
            break;
            
            case 5: //ListarPacientes.listarPacientes();
            break;
            
            default: MenuMedicos.menuMedicos();
            break;
        }
        while(opcion1!=0){
            System.out.println(mMedico10);
            opcion1 = sc1.nextInt();
        }
        MenuPantallaPrincipal.menuPantallaPrincipal();
    }
}
