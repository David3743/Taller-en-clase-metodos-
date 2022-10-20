import java.util.Scanner;

public class mezcladorDeColores {
    static Scanner in= new Scanner(System.in);
    public static void main(String[]args){
        mezcladorDeColores();
    }
    public static void mezcladorDeColores(){
        System.out.println("""
            Elija el primer color:

            1. Amarillo
            2. Azul
            3. Rojo 
            """);
        int color1= in.nextInt(), color2=color1;
        while(color2==color1){
            System.out.println("""
                
                Elija el segundo color:
                
                1. Amarillo
                2. Azul
                3. Rojo
                """);
            color2= in.nextInt();
            if(color2==color1){
                System.out.println("No puedes elejir el mismo color, intenta con uno distinto");
            }
        }
        if(color1==1 && color2==2){
            System.out.println("La mezcla entre los colores es: Verde.");
        }
        else if(color1==1 && color2==3){
            System.out.println("La mezcla entre los colores es: Anaranjado.");
        }
        else{
            System.out.println("La mezcla entre los colores es: Morado.");
        }
    }
}

