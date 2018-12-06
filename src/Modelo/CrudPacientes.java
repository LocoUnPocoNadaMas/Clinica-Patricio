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
 * @author MATIAS
 */
public class CrudPacientes {
    
    private List<Paciente> listaPaciente;
    
    //constructor
    public CrudPacientes(){
        this.listaPaciente = new ArrayList();        
    }
    
    /**
     * addPacientes(Paciente p)
     * Parametro: p es un objeto del tipo Paciente
     */
    public boolean addPaciente(Paciente p){
        this.listaPaciente.add(p);
        return true;
    }
    
}
