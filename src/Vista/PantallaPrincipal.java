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
        int dni;
        int menuOpcion = 0;
        int existePaciente;
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println(universo0);
        System.out.println(pantallaPrincipal1);
        System.out.println(pantallaPrincipal2);
        documento = sc1.nextLine();
        if(documento.isEmpty()){
            System.out.println(pantallaPrincipal0);
            MenuPantallaPrincipal.EleccionPantallaPrincipal();
        }
        else{
            dni = Integer.parseInt(documento);
            System.out.println("Buscando...");
            
            // Si No Existe recargamos la pantalla prncipal
            if(BusquedaPacientes.getInstance().BuscarPaciente(dni)==false){
                System.out.println(pantallaPrincipalerror0);
                PantallaPrincipal.MenuPrincipal();
                
            // Si Existe mostrariamos un Menu con opciones para ese paciente
            }else {
                int abm=0;
                BusquedaPacientes.BuscarPaciente(dni,abm);
            }
        }
    }
}