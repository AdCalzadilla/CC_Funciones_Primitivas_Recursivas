package es.ull.cc.fpr;

import java.util.Scanner;

public class Main {
	
	public static void menu(){
		System.out.println("\n  -- Función potencia(x,y) --");
		System.out.println(" [c] Calcular");
		System.out.println(" [s] Salir");
		System.out.print(" - Opción: ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x;
		int y;
		char option;
		Scanner sc = new Scanner(System.in);
		FPR p = new FPR();
		
		System.out.println(" PRÁCTICA 3: Implementación de Funciones Primitivas Recursivas");
		System.out.println(" -------------------------------------------------------------");
		menu();
		option = sc.next().charAt(0);
		
		while(option != 's'){
			System.out.print("\n - Introduzca el valor de la 'x': ");
			x = sc.nextInt();
			System.out.print(" - Introduzca el valor de la 'y': ");
			y = sc.nextInt();
			System.out.println(" Resultado de x^y = " + p.potencia(x, y));
			menu();
			option = sc.next().charAt(0);
		}
		sc.close();
	}

}
