package org.institutoserpis.ed;

import java.math.BigDecimal;
import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		String numero1 = new BigDecimal (scanner.nextLine());
		System.out.println("Introduce el segundo: ");
		String numero2 = new BigDecimal (scanner.nextLine());
		
		BigDecimal num = numero1 + numero2;
		
		
		System.out.println("Primer Número= "+numero1);
				

	}

}
