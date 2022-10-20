import javax.swing.*;

public class calculadoraVelocidad {
    public static void main (String[]args){
        int abc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de dato que desea: \n 1-velocidad \n 2-distancia \n 3-tiempo"));
        switch (abc){
            case 1->{
                 double desplazamieto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el despazamiento"));
                double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo"));
                velocidad(desplazamieto,tiempo);
                break;
            }
            case 2->{
                double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad"));
                double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo"));
                distancia(velocidad,tiempo);
                break;
            }
            case 3->{
                double distancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la distancia"));
                double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo"));
                tiempo(distancia,velocidad);
                break;
            }
        }
    }
    public static void velocidad ( double desplazamiento, double tiempo){
        double a = desplazamiento/tiempo;
        JOptionPane.showMessageDialog(null, "Su velocidad es de: " + a);
    }
    public static void distancia ( double  velocidad, double tiempo){
        double a = velocidad*tiempo;
        JOptionPane.showMessageDialog(null, "La distancia que recorrio es de: " + a);
    }
    public static void tiempo (double distancia, double velocidad){
        double a = distancia/velocidad;
        JOptionPane.showMessageDialog(null, "El tiempo que transcurrio fue de: " + a);
    }
}
