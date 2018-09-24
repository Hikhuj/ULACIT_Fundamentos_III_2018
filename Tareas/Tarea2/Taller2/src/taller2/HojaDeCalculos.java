/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller2;

/**
 *
 * @author roger
 */
public class HojaDeCalculos {
    
    public void Calcula(float cantidad){
        
        float resultado = 0.0f;
        float interesGanado = 0.0f;
        float porcentajeInteres = 0.08f;
        
        interesGanado = cantidad * porcentajeInteres;
        resultado = cantidad + interesGanado;
        
        System.out.print("");
        
        
    }
    
}
