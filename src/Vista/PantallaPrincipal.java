/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Paciente;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class PantallaPrincipal implements Literales{
    
    public static void MenuPrincipal(){
        
        
        String documento;
        int menuOpcion = 0;
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println(universo0);
        System.out.println(mPantallaPrincipal0);
        System.out.println(mPantallaPrincipal1);
        documento = sc1.nextLine();
        if(documento.isEmpty()) 
            MenuPantallaPrincipal.EleccionPantallaPrincipal();
        else {
            System.out.println("Buscando...");
            new BusquedaPacientes().BuscarPaciente(documento);
            //DatosPaciente.MostrarDatosPaciente();
        }
        
        //menuOpcion = sc1.nextInt();
        
        seleccionMenuPrincipal(menuOpcion);
        
    }
    private static void seleccionMenuPrincipal(int menuOpcion) {
        
        switch (menuOpcion)
        {
            case 0: System.out.println("");
            break;
            
            default:
            break;
        }
    }
}