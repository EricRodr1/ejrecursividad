
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursividad;

/**
 *
 * @author Eric Rodriguez
 */
public class Recursividad {

    public static int funcion(int a) {
        if (a <= 0) {
            return 0;
        } else {
            System.out.println(a);
            return funcion(a - 1);
        }
    }

    public static void main(String[] args) {
        funcion(10);
    }
}
 

