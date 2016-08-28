/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad221;
import java.util.Scanner;
/**
 *
 * @author Enrique A. Martínez Agudelo;
 */
public class Actividad221 {

    /**
     * 
     * @param C argumento necesario para calcular el valor en Fahrenheit
     * @return valor punto flotante
     */
    
    // Declaración de función calculadora de grados Fahrenheit 
    public static float fahrenheit(int C)
    {
        // Declaración e inicialización de variable local
        float F = (float) ((1.8)*C + 32);
        // Retorno del valor punto flotante
        return F;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 1er mensaje
        System.out.println("Digite el valor de grados celsius °C a comvertir");
        
        // Declaración de objeto Scanner
        Scanner msn = new Scanner(System.in);
        
        // 2do mensaje mostrando la conversión partiendo de una llamada a la
        // función fahrenheit()
        System.out.println(fahrenheit(msn.nextInt())+"°F");
    }
    
}
