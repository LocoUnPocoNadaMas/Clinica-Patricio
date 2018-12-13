/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.CrudPacientes;
import Modelo.Paciente;
import java.util.List;

/**
 *
 * @author 
 */
public class ControladorPaciente {
    
    private static ControladorPaciente instance;
    
    public static ControladorPaciente getInstance(){
        if (instance == null){
            instance = new ControladorPaciente();
        }
        return instance;
    }
    
    public boolean guardarPaciente(int id_paciente, int dni, String nombre, String apellido, boolean genero, String direccion, String telefono, 
                                   String celular, int dia, int mes, int anio, String cobertura, String plan){
        
        boolean bandera = false;
        
        CrudPacientes listaPacienteCrud =  CrudPacientes.getInstance();
        
        Paciente p = new Paciente(id_paciente,  dni,  nombre,  apellido,  genero,  direccion,  telefono,  celular,  cobertura,  plan);
        
        if (listaPacienteCrud.agregarPaciente(p) == true) {
            bandera = true;
        }
        return bandera;
    }
    
    public  List<Paciente> mostrarPacientes(){
        return CrudPacientes.getInstance().buscarPaciente();        
    }
    
}
