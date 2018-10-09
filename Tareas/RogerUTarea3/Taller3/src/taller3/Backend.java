/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import javax.swing.*;

/**
 *
 * @author rogerjoseulaterivera
 */
public class Backend {
 
    public void menu() {
        
        double result;
        int cantidadFlores = convertirNumero(JOptionPane.showInputDialog("Cuantas flores desea comprar?"));
        
        result = precioTotal(cantidadFlores);
        
        JOptionPane.showMessageDialog(null, "Pidio " + cantidadFlores + ", para un total de: ¢" + result);
    
    }

    public int convertirNumero(String num) {
        
        int numero = 0;
        
        try {
            numero = Integer.parseInt(num);
        } catch (Exception e) {
            System.out.println("Excepcion ocurrio.");
        }
            
        return numero;
    }
    
    public double precioTotal(int cantidadFlores) {
        
        int precioTotal = cantidadFlores * 250;
        double result = precioTotal - (precioTotal * 0.10);
        
        if(cantidadFlores > 10) {
            result = precioTotal - (precioTotal * 0.10);
        }else{
            result = precioTotal;
        }
        
        return result;
        
    }
    
}
