package Paquete01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListaPrimos {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int num;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("\nIntroduce un número '0' para terminar: ");
		num = Integer.parseInt(teclado.readLine());
		while(num!=0) {
			if(esPrimo(num))
				System.out.println("El número " + num + " ES PRIMO");
			else 
				System.out.println("El número " + num + " NO es PRIMO");
			
			System.out.print("\nIntroduce un número '0' para terminar: ");
			num = Integer.parseInt(teclado.readLine());
		}
		System.out.print("\nFin del programa que calcula números primos");
	}
		
	public static boolean esPrimo(int numero) {
			int i=2;
			boolean primo = true;
			
			while ((primo) && (i <= (numero / 2))) {
				if (numero % i == 0)
					primo = false;
				i++;
		}
		return (primo);
	}
}
