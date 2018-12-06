/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.Scanner;


/**
 *
 * @author Patri
 */
public class NuevoPaciente implements Literales {
    
    public static void MenuNuevoPaciente(){
        
        //protected int id_paciente;
        int dni;
        String nombre;
        String apellido;
        String genero;
        
        String direccion;
        String telefono;
        String celular;
        
        int dia;
        int mes;
        int anio;
        
        String cobertura;
        String plan;
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println(universo0);
        System.out.println(mNuevoP0);
        
        
        
        System.out.println(mNuevoP1);
        dni = sc1.nextInt();
        
        
        
        System.out.println(mNuevoP2);
        nombre = sc1.next();
        
        
        System.out.println(mNuevoP3);
        apellido = sc1.next();
        
        /*
        
        Genero M o F
        
        */
        
        System.out.println(mNuevoP4);
        genero = sc1.next();
        
        System.out.println(mNuevoP5);
        direccion = sc1.next();
        
        System.out.println(mNuevoP6);
        telefono = sc1.next();
        
        System.out.println(mNuevoP7);
        celular = sc1.next();
        
        /*
        
        Dia Mes Anio
        
        */
        
        System.out.println(mNuevoP8);
        dia = sc1.nextInt();
        mes = sc1.nextInt();
        anio = sc1.nextInt();
        
        System.out.println(mNuevoP9);
        cobertura = sc1.next();
        
        System.out.println(mNuevoP10);
        plan = sc1.next();
        
        /// llamar al controlador y grabar el paciente
        //verificar el resultado de la operación y volver a ingresar todo los datos
        // si va bien volver al menu de paciente
    }
}

