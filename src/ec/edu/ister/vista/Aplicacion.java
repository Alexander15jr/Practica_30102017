/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.vista;

import ec.edu.ister.modelo.ControlFlujo;
import ec.edu.ister.modelo.OperacionesBasicas;
import javax.swing.JOptionPane;

/**
 *
 * @author Expression Alexander is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class Aplicacion {
    public static void main(String[] args) 
    {
        /*int m=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero: "));
        int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero: "));
        OperacionesBasicas.sumaDosNumeros();
        OperacionesBasicas.sumaConParametros(m,n);
        JOptionPane.showMessageDialog(null,OperacionesBasicas.sumaDevuelve(6,7));   
        ControlFlujo.ifAnidado();*/
        ControlFlujo.stwich();
    }

}
