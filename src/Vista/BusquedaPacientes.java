/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patri
 */
public class BusquedaPacientes {
    
    private List<Paciente> listaPaciente;
    
    public void BuscarPaciente(String dni){
        
        this.listaPaciente = new ArrayList();
        for (int i = 0; i <= listaPaciente.size() - 1; i++) {
            System.out.println(listaPaciente.get(i).getDni());
        }
        
    }
           
}
