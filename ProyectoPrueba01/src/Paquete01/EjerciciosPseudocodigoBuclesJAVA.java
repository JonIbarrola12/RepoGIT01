package Paquete01;
import java.util.Scanner;

public class EjerciciosPseudocodigoBuclesJAVA {
    public static void main(String[] args) throws Exception {
        ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        //ejercicio6();
    }

    private static void ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        int cont=0,sum=0;
        while(cont<10){
            System.out.println("Dame un numero: ");
            int num1 = scanner.nextInt();
            sum=sum+num1;
            cont=cont+1;
        }
        System.out.println("La suma es: "+sum);
        scanner.close();
    }
}