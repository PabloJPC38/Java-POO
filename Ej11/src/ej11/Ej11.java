/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej11;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int num1, num2;
        char op1=' ';
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresar número 1:");
        num1 = leer.nextInt();
        System.out.println("Ingresar número 2:");
        num2 = leer.nextInt();


        while (op1 != 'S') {
            
            
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");
            System.out.println("");

            System.out.println("Elegir opción:");
            op1 = leer.next().charAt(0);

            switch (op1) {
                case '1':
                    System.out.println("Suma:" + (num1 + num2));
                    break;
                case '2':
                    System.out.println("Resta:" + (num1 - num2));
                    break;
                case '3':
                    System.out.println("Multiplicación:" + (num1 * num2));
                    break;
                case '4':
                    System.out.println("División:" + (float) (num1 / num2));
                    break;
                case '5':
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    op1 = leer.next().charAt(0);
                    break;

                default:
                    throw new AssertionError();
            }         
            
        }

    }

}
