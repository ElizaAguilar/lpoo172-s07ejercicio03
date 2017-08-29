/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07ejercicio03;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class S07ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creando un objeto scanner
        Scanner input = new Scanner(System.in);
        //Mostrar menaaje al usuario
        System.out.println("INGRESE UN NUMERO ENTRE 0 Y 100");
        int number = input.nextInt();
        //calcular la suma de los dijitos del numero entero 
        int menorQue10 = number %10;
        number =number / 10;
        int decenas = number %10;
        number /= 10;
        int centenas = number %10;
        number /= 10;
        int suma = decenas + centenas+menorQue10;
        //mostrando resultado
        System.out.println("La suma de los numeros es:" + suma);
    }
    
}
