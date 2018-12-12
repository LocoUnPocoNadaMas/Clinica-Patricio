/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author patri
 */
public class MenuPacientes {
    
    
    public static void EleccionPacientes()
    {
        
        int opcionDP=0;
        Scanner sc1 = new Scanner(System.in);
        do{
            System.out.println("Crear Nuevo(1), Modificar(2), Eliminar(3)");
            opcionDP = sc1.nextInt();
        }while (!(opcionDP==1 || opcionDP==2 || opcionDP==3));
        
        switch (opcionDP)
        {
            case 1: NuevoPaciente.AgregarNuevoPaciente();
            break;
            case 2: ModificarPaciente.MenuModificarPaciente();
            break;
            //case 3: BusquedaPacientes.BuscarPaciente(dni);
                //case 3: Eliminar();
            //break;
        }
    }
}
