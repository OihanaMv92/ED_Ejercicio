package es.studium.Ed_Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EJERCICIO2
{
	public static void main(String[] args) throws IOException {
		BufferedReader lectura = new BufferedReader(new
				InputStreamReader(System.in));
		int num1,num2;
		System.out.println("Indicar un n�mero:");
		num1 = Integer.parseInt(lectura.readLine());
		System.out.println("Indicar otro n�mero:");
		num2 = Integer.parseInt(lectura.readLine());
		System.out.println("La suma de los dos n�meros es:" + 
		suma(num1,num2));
	}

	public static int suma (int a,int b) {
		return a + b;
	}
}
