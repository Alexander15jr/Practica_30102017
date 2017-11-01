/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public class OperacionesBasicas {
    
    public static void sumaDosNumeros()
    {
        int x=5;
        int y=3;
        int z=x+y;
        JOptionPane.showMessageDialog(null,"La suma de dos numeros es " + z);
    }
    public static void sumaConParametros(int m,int n)
    {
        int z= m+n;
        JOptionPane.showMessageDialog(null,"La suma de dos numeros es " + z);
    }
    
    public static int sumaDevuelve(int x, int y)
    {
     return x+y;   
    }
    
   


}
    

