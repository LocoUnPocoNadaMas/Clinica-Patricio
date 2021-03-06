/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorPaciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class CrudPacientes {
    
    // Privados, solo accesibles desde la instancia
    private static CrudPacientes instance;
    private List<Paciente> listaPaciente;
    
    //constructor
    private CrudPacientes(){
        this.listaPaciente = new ArrayList();        
    }
    
    //Singleton
    public static CrudPacientes getInstance(){
        if (instance == null){
            instance = new CrudPacientes();
        }
        return instance;
    }
     
     /**
     * addPacientes(Paciente p)
     * Parametro: p es un objeto del tipo Paciente
     */
    public boolean agregarPaciente(Paciente p){
        this.listaPaciente.add(p);
        return true;
    }
    
    public List<Paciente> buscarPaciente(){
        return this.listaPaciente;
    }
    
    public int buscarPaciente(int DNI){
        int i=0;
        int result = -1;
        for(i=0;i<this.listaPaciente.size();i++){
            if (this.listaPaciente.get(i).getDni() == DNI){               
                result = this.listaPaciente.indexOf(this.listaPaciente.get(i));                
            }           
        }        
        return result;
    }
    
    public List<Paciente> buscarPaciente(String apellido){        
        List<Paciente> listaEncontrados = new ArrayList(); 
        int i;        
        
        for(i=0;i<=this.listaPaciente.size();i++){            
             
            
            if (this.listaPaciente.get(i).getApellido() == apellido){                
               listaEncontrados.add(this.listaPaciente.get(i));
            }           
        }        
        return listaEncontrados;
    }
    
    public Paciente BuscarPaciente(int dni){
        Paciente encontrado = null;
        int i;
        //this.listaPaciente = new ArrayList();
        
        for (i = 0; i < listaPaciente.size() - 1; i++) {
            if(dni == ControladorPaciente.getInstance().mostrarPacientes().get(i).getDni()){
                encontrado = ControladorPaciente.getInstance().mostrarPacientes().get(i);
            }
        }
        return encontrado;
        
    }
}
