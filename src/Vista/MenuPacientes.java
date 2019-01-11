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
public class MenuPacientes implements Literales{
    
    
    public static void EleccionPacientes()
    {
        
        int opcion;
        int abm;
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println(mPaciente0);
        System.out.println(mPaciente1);
        System.out.println(mPaciente2);
        System.out.println(mPaciente3);
        System.out.println(mPaciente4);
        //System.out.println(mPaciente5);
        System.out.println(mPaciente6);
        System.out.println(mPaciente10);
        
        opcion = sc1.nextInt();
        
        switch (opcion)
        {
            case 1: NuevoPaciente.AgregarNuevoPaciente();
            break;
            
            case 2: {
                abm=0;
                BusquedaPacientes.BuscarPaciente(abm);
            }
            break;
            case 3: {
                abm=1;
                BusquedaPacientes.BuscarPaciente(abm);
            }
            break;
            case 4: {
                abm=2;
                BusquedaPacientes.BuscarPaciente(abm);
            }
            break;
            
            case 5: MostrarPacientes.listarPacientes();
            break;
            
            default: MenuPacientes.EleccionPacientes();
            break;
        }
    }
}
