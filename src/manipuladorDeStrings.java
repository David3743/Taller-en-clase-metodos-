import java.util.Scanner;

public class manipuladorDeStrings {
    static Scanner in= new Scanner(System.in);
    public static void main(String[]args) {
        manipuladorDeStrings();
    }
    public static void manipuladorDeStrings(){
        System.out.print("Ingrese la frase: ");
        String palabra= in.next();
        System.out.print("""
            
            ¿Qué desea hacer?
            
            1. Cambiar a mayúsculas.
            2. Contar el número de letras con y sin espacios.
            3. Cambiar a minúsculas.
            """);
        int opc= in.nextInt();
        switch(opc){
            case 1 -> System.out.println("Resultado : "+palabra.toUpperCase());
            case 2 ->{
                System.out.println("Número de letras contando los espacios: "+ palabra.length());
                System.out.println("Número de letras sin contar los espacios: "+(palabra.replace(" ","")).length());
            }
            case 3 ->{
                System.out.println("Resultado: "+palabra.toLowerCase());
            }
        }
    }

}
