/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControladorPaciente;
import java.util.Scanner;

/**
 *
 * @author Patri
 */
public class NuevoPaciente implements Literales {
    
    public static void AgregarNuevoPaciente(){
        
        int id_paciente=0;
        int i;
        
        int dni;
        String nombre;
        String apellido;
        boolean genero=true;
        
        String direccion;
        String telefono;
        String celular;
        
        int dia;
        int mes;
        int anio;
        
        String cobertura;
        String plan;
        
        char respuesta0;
        char respuesta1;
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println(universo0);
        System.out.println(nuevoP0);
        
        
        System.out.println(nuevoP1);
        dni = sc1.nextInt();
        
        
        
        System.out.println(nuevoP2);
        nombre = sc1.next();
        
        
        System.out.println(nuevoP3);
        apellido = sc1.next();
        
        /*
        
        Genero M o F
        
        */
        
        System.out.println(nuevoP4);
        //genero = sc1.next();
        
        System.out.println(nuevoP5);
        direccion = sc1.next();
        
        System.out.println(nuevoP6);
        telefono = sc1.next();
        
        System.out.println(nuevoP7);
        celular = sc1.next();
        
        /*
        
        Dia Mes Anio
        
        */
        
        System.out.println(nuevoP8);
        dia = sc1.nextInt();
        mes = sc1.nextInt();
        anio = sc1.nextInt();
        
        System.out.println(nuevoP9);
        cobertura = sc1.next();
        
        System.out.println(nuevoP10);
        plan = sc1.next();
        
        // llamar al controlador y grabar el paciente
        // verificar el resultado de la operación y volver a ingresar todo los datos
        // si va bien volver al menu de paciente
        
        System.out.println(nuevoP11);
        
        respuesta0 = sc1.next().toLowerCase().charAt(0);
        
        if (respuesta0 == 's') {
            ControladorPaciente.getInstance().guardarPaciente(id_paciente, dni, nombre, apellido, genero, direccion, telefono, celular, dia, mes, anio, cobertura, plan);
            
        }else if (respuesta0 == 'n') {
            System.out.println("Descartando...");
            PantallaPrincipal.MenuPrincipal();
        }else {
            System.out.println("Tarado eh");
            PantallaPrincipal.MenuPrincipal();
        }
        
        
        System.out.println(nuevoP12);
        respuesta1 = sc1.next().toLowerCase().charAt(0);
        
        if (respuesta1 == 's') {
            NuevoPaciente.AgregarNuevoPaciente();
        }else if (respuesta1 == 'n') {
            System.out.println("Saliendo...");
            PantallaPrincipal.MenuPrincipal();
        }else {
            System.out.println("Tarado eh");
            PantallaPrincipal.MenuPrincipal();
        }
    }
}

