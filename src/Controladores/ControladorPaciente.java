/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.CrudPacientes;
import Modelo.Paciente;

/**
 *
 * @author MATIAS
 */
public class ControladorPaciente {
    
    public boolean savePacientes(int dni, String nombre, String apellido, String genero, String direccion, String telefono, 
                                   String celular, int dia, int mes, int anio, String cobertura, String plan){
        
        boolean bandera = false; 
        CrudPacientes listaPacienteCrud = new CrudPacientes();
        Paciente p = new Paciente(dni, nombre, apellido, genero, direccion, telefono, 
                                    celular, dia, mes, anio,  cobertura,  plan);
        
        if (listaPacienteCrud.addPaciente(p) == true) {
            bandera = true;
        }
        return bandera;
        
        
        
    }
}
