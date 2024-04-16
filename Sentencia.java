import java.util.Scanner;
public class Sentencia {

    public static void main (String [] args){
        Scanner sc= new Scanner (System.in);
        byte numero;
        System.out.println("Ingresa un valor entre el uno al 10");
        numero = sc.nextByte();
        if(numero % 2 == 0){
            System.out.println("El numero es Par");

        } else{
            System.out.println("El numero es impar");
        }       
    }
    
}
