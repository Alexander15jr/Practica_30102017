package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Expression Alexander is undefined on line 12, column 14 in Templates/Classes/Class.java.
 */
public class ControlFlujo 
{
    public static void ifAnidado()
    {
        int a=3;
        if (a>3) 
        {
            System.out.println("Es mayor");    
        } 
        else if(a<3)
        {
            System.out.println("Es menor");
        }
        else   
        {
            System.out.println("Es igual");
        }
    }
    
    public static void stwich ()
    {
        int a=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opcion: "));
        switch(a)
        {
            case 1:
                OperacionesBasicas.sumaDosNumeros();
                ControlFlujo.stwich();
                break;
            case 2:
                int m=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer numero: "));
                int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segundo  numero: "));
                OperacionesBasicas.sumaConParametros(m, n);
                ControlFlujo.stwich();
                break;
            case 3:
                int x=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese primer numero: "));
                int y=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese segundo  numero: "));
                OperacionesBasicas.sumaDevuelve(x, y);
                ControlFlujo.stwich();
                break;
            default:
                System.out.println("Opcion incorrecta");
        }

    }
}
