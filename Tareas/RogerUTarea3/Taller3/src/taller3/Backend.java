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
        
        int opc = demeNumero("Que desea hacer:\n1. Cantidad de Flores\n2. Tipo de triangulo");
        
        switch(opc) {
            case 1:
                cantidadFlores();
                break;
            case 2:
                llamarTipoTriangulo();
                break;
            default:
                System.exit(1);
        }
        
    }
    
    public int demeNumero(String msj) {
        String texto = JOptionPane.showInputDialog(msj);
        int numero = Integer.parseInt(texto);
        return numero;
    }
    
    public void cantidadFlores() {
        
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
        
        double result = cantidadFlores * 250;
        double precioDescuento = result - (result * 0.10);
        
        if(cantidadFlores > 10) {
            result = precioDescuento;
        }
        
        return result;
        
    }
    
    public void llamarTipoTriangulo() {
        
        int lado1 = demeNumero("Deme lado 1");
        int lado2 = demeNumero("Deme lado 2");
        int lado3 = demeNumero("Deme lado 3");
        
        tipoTriangulo(lado1, lado2, lado3);
        
    }
    
    public void tipoTriangulo(int lado1, int lado2, int lado3) {
        
        if(lado1 == lado2 && lado1 == lado3 && lado2 == lado3){
            System.out.println("Tiangulo Equilatero");
        }else{
            if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
                System.out.println("Triangulo Escaleno");
            }else{
                System.out.println("Triangulo Isoceles");
            }
        }
        
    }
    
}
