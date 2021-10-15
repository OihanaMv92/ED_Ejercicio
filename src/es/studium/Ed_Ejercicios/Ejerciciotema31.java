package es.studium.Ed_Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejerciciotema31
{
	public static void main(String[] args) throws IOException {
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		int base, exp, i;
		int resultado=1;
		System.out.println("Indicar el valor de la base:");
		base = Integer.parseInt(lectura.readLine());
		System.out.println("Indicar el valor del exponente:");
		exp = Integer.parseInt(lectura.readLine());
		for (i=1; i<=exp; i++) {
			resultado=resultado*base;
		}
		System.out.println("El número " + base + " elevado a " + exp + " es igual a " + resultado);
	}
}
