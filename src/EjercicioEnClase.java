import javax.swing.*;
import java.util.jar.JarOutputStream;

public class EjercicioEnClase {
    public static void main (String[]args){
         int input = Integer.parseInt(JOptionPane.showInputDialog("Inegrese la figura a la cual le quiere sacar el area \n 1-triangulo\n" +
                "2-circulo\n" +
                "3-cuadrado\n" +
                "4-rectangulo"));

switch (input){
    case 1->{
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo numero"));
        areaTriangulo(a,b);
        break;
    }
    case 2->{
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        areaCirculo(a);
        break;
    }
    case 3->{
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        areaCuadrado(a);
        break;
    }
    case 4->{
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un segundo numero"));
        areaRectangulo(a,b);
        break;
    }
}
    }
    public static void  areaTriangulo (int a, int b){
         int area = 0;
         area = (a*b)/2;
        JOptionPane.showMessageDialog(null,"El area del triangulo es igual a: " + area);
    }
    public static void areaCirculo (int a){
        double area = 0;
        area = Math.PI*(a*a);
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);
    }
    public static void areaCuadrado(int a){
        int area = 0;
        area = a*a;
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + area);
    }
    public static void areaRectangulo(int a, int b){
        int area = 0;
        area = a*b;
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + area);
    }
}
