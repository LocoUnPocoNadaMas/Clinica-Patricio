/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorPaciente;

/**
 *
 * @author patri
 */
public class MostrarPacientes {
    
    public static void listarPacientes(){
        int i;
        for(i=0; i< ControladorPaciente.getInstance().mostrarPacientes().size(); i++){
            System.out.println(ControladorPaciente.getInstance().mostrarPacientes().get(i).getApellido()
                    +" "+ControladorPaciente.getInstance().mostrarPacientes().get(i).getNombre()
                    +" "+ControladorPaciente.getInstance().mostrarPacientes().get(i).getDni());
        }
    }
}
