package prueba;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prueba {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double  a = ingreseValor();
        double  b = ingreseValor();
        double  c = ingreseValor();
        
        if (((Math.pow(b, 2))-(4*a*c))>=0) {
            double x1 = (-b + Math.sqrt((Math.pow(b, 2))-(4*a*c)))/(2*a);
            double x2 = (-b - Math.sqrt((Math.pow(b, 2))-(4*a*c)))/(2*a);
            System.out.println(x1);
            System.out.println(x2);
        }else{
            System.out.println("no tiene una solucion real");
        }
    }
    private static double ingreseValor(){
        double valor = Double.parseDouble(JOptionPane.showInputDialog("ingrese valor"));
        return valor;
    }
}
