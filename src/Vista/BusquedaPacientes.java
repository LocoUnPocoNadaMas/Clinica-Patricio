/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorPaciente;
import Modelo.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author patri
 */
public class BusquedaPacientes {
    
    private static BusquedaPacientes instance;
    
    public static BusquedaPacientes getInstance(){
        if (instance == null){
            instance = new BusquedaPacientes();
        }
        return instance;
    }
    
    private static List<Paciente> listaPaciente;
    
    public static int buscarPaciente(int dni){
        int posicion=-1;
        if(listaPaciente!=null){
            for (int i = 0; i <= listaPaciente.size() - 1; i++){
                if(dni == ControladorPaciente.getInstance().mostrarPacientes().get(i).getDni()) posicion=i;
            }
        }
        return posicion;
    }
    
    public static Paciente BuscarPaciente(int dni, int abm){
        Paciente encontrado = null;
        
        switch (abm){
            case 0:{
                
            }
                break;
                
            case 1:{
                
            }
                break;
                
            case 2:{
                
            }
                break;
        }
        for (int i = 0; i <= listaPaciente.size() - 1; i++) {
            if(abm == ControladorPaciente.getInstance().mostrarPacientes().get(i).getDni()){
                encontrado = ControladorPaciente.getInstance().mostrarPacientes().get(i);
            }
        }
        return encontrado;
    }
    /*
    public static List<Paciente> BuscarPaciente(Boolean abm){
        List<Paciente> listaEncontrados = new ArrayList();
        
        
        
        
        return listaEncontrados;
    }*/
}
