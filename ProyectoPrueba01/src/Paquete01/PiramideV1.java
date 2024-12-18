package Paquete01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PiramideV1 {

	public static void main(String[] args) throws NumberFormatException, IOException{
		int num,cont,cant;
		cont=1;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nIntroduce un número de niveles de la piramide: ");
		num = Integer.parseInt(teclado.readLine());
		cant=1;
		while(cont<=num){
		for (cont=1;cont<=cant;cont++) {
			System.out.print(cont);
		}
		System.out.println();
		cant=cant+1;
		}
		System.out.print("\nFin del programa que hace piramides");
	}

}
