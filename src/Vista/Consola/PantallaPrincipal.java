/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Consola;

import Controlador.ControladorPaciente;
import Modelo.Paciente;
import java.util.List;
import java.util.Scanner;
import Vista.Interfaz;
/**
 *
 * @author Alumno
 */
public class PantallaPrincipal implements Interfaz{
    
    public static void pantallaPrincipal(){
        
        
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
            MenuPantallaPrincipal.menuPantallaPrincipal();
        }
        else{
            dni = Integer.parseInt(documento);
            System.out.println("Buscando...");
            System.out.println(dni);
            // Si No Existe recargamos la pantalla prncipal
            if(BusquedaPacientes.buscarPaciente(dni)==-1){
                System.out.println(pantallaPrincipalerror0);
                
                PantallaPrincipal.pantallaPrincipal();
                
            // Si Existe mostrariamos un Menu con opciones para ese paciente
            }else {
                /*
                int abm=0;
                BusquedaPacientes.BuscarPaciente(dni,abm);
                */
                System.out.println(ControladorPaciente.getInstance().mostrarPacientes().get(dni).getApellido()
                    +" "+ControladorPaciente.getInstance().mostrarPacientes().get(dni).getNombre()
                    +" "+ControladorPaciente.getInstance().mostrarPacientes().get(dni).getDni());
            }
        }
    }
}