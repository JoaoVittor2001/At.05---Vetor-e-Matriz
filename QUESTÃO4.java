package ATIVIDADE5;

import java.util.Scanner;

public class QUESTÃO4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
	
		float soma = 0;
		
		for (int i=1;i<=4;i++) {
			
			System.out.println("Digite a Nota");
		
			float nota = entrada.nextFloat();
			
			System.out.println(nota);
			
			soma = soma +nota;
		}
		System.out.println("A média é "+soma/4);
		
		entrada.close();
	}
}
