package org.migu.learning.Logica_Cliente;

import org.migu.learning.Logica_Negocio.Herramienta;
import org.migu.learning.Logica_Negocio.Obrero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Obrero obrero = new Obrero();
        Herramienta herramienta = new Herramienta();
        Scanner sc = new Scanner(System.in);

        String nombre;
        String apellido;
        String identificacion;

        String idHerra;
        String nombreHerra;

        System.out.println("Ingrese el nombre de la herramienta");
        nombreHerra = sc.next();
        System.out.println("Ingrese el Id de la herramienta");
        idHerra = sc.next();

        herramienta = new Herramienta(idHerra, nombreHerra);
        //Registrar Empleados
        System.out.println("Ingrese el nombre del Empleado");
        nombre = sc.next();
        System.out.println("Ingrese el apellido del empleado");
        apellido = sc.next();
        System.out.println("Ingrese la identificacion del empleado");
        identificacion = sc.next();

        obrero = new Obrero(nombre, apellido, identificacion, herramienta);


        //impresion de datos
        System.out.println("+-----------------------------------+");
        System.out.println("Herramienta: " + obrero.getHerramienta().getNombreHerra());
        System.out.println("Id herramienta: " + obrero.getHerramienta().getIdHerra());
        System.out.println("Nombre del empleado a cargo de la herramienta: " + obrero.getNombre() + " " + obrero.getApellido());
        System.out.println("identificacion del empleado: " + obrero.getIdentificacion());
    }
}