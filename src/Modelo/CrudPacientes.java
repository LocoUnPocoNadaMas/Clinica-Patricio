/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class CrudPacientes {
    
    private List<Paciente> listaPaciente;
    private static CrudPacientes instance;
    
    //constructor
    public CrudPacientes(){
        this.listaPaciente = new ArrayList();        
    }
    
    /*
    * No se que hace
    *
    */
    
     public static CrudPacientes getInstance(){
        if (instance == null){
            instance = new CrudPacientes();
        }else{
            System.out.println("El objeto ya existe");
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
    
    public int SearchClient(int DNI){
        int i=0;
        int result = -1;
        for(i=0;i<=this.listaPaciente.size();i++){
            if (this.listaPaciente.get(i).getDni() == DNI){               
                result = this.listaPaciente.indexOf(this.listaPaciente.get(i));                
            }           
        }        
        return result;
    }
    
    public List<Paciente> buscarPaciente(String apellido){        
        List<Paciente> listaEncontrados = new ArrayList(); 
        int i=0;        
        
        for(i=0;i<=this.listaPaciente.size();i++){            
             
            
            if (this.listaPaciente.get(i).getApellido() == apellido){                
               listaEncontrados.add(this.listaPaciente.get(i));
            }           
        }        
        return listaEncontrados;
    }
}
