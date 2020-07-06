/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscarenarreglo;

import javax.swing.JOptionPane;

/**
 *
 * @author GALATEA
 */
public class BuscarEnArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {132, 90, 49, 11, 20, 35};
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero que quiere buscar"));
        boolean busqueda = false;
        
        //Funcion

        for (int n : numeros) {
            if (n == numero2) {
                busqueda = true;
                System.out.println("su numero se encuentra en nuestro arreglo " + n);

            }
        }

        if (!busqueda) {
            System.out.println("su numero no e encuentra en nuestro arreglo");
        } else {
            System.out.println("Su numero se encuentra en nuestra base de datos");

        }

    }

}
