import javax.swing.*;

public class conversorDeMoneda {
    //para este ejercicio se tuvo en cuenta el valor que tenian las monedas el día 19/10/2022

    public static void main(String[] args) {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de pesos colombianos"));
        int s = Integer.parseInt(JOptionPane.showInputDialog("Ingrese a que moneda desea convertir:\n1 Dolar\n2 Euro\n3 Libra\n4 Peso Mexicano"));

        switch(s) {


            case 1 : {
                double R=	Dolar(p);
                System.out.println(R+" USD");
                break;
            }
            case 2 : {
                double R=	Euro(p);
                System.out.println(R+" €");

                break;
            }
            case 3 : {

                double R=	Libra(p);
                System.out.println(R+" ₤");
                break;
            }
            case 4 : {

                double R=	PesoMexicano(p);
                System.out.println(R+" MXN");
                break;
            }

        }


    }
    public static double Dolar(int p) {

        return p*0.00021;
    }
    public static double Euro(int p) {
        return p*0.00021;
    }
    public static double Libra(int p) {
        return p*0.00019;
    }
    public static double PesoMexicano(int p) {
        return p*0.0042;
    }

}

