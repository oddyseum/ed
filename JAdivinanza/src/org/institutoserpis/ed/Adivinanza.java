package org.institutoserpis.ed;
import java.util.Random;
import java.util.Scanner;
public class Adivinanza {

		public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	random.nextInt(1000);
	int numeroAleatorio = random.nextInt(1000) + 1;
	System.out.print("Adivina un numero entre 1 y 1000");
	int numeroIntroducido = Integer.parseInt(scanner.nextLine());
	while (numeroIntroducido != numeroAleatorio) {
		if(numeroIntroducido < numeroAleatorio)
		System.out.println("Es mayor que ese");
		else System.out.println("es menor que ese");
	System.out.println("di un numero");
	numeroIntroducido = Integer.parseInt(scanner.nextLine());
	}
	if (numeroIntroducido==numeroAleatorio)System.out.println("has acertado");


		}
}
