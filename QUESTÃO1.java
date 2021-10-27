package ATIVIDADE5;

import java.util.Scanner;

public class QUESTÃO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner entrada = new Scanner(System.in);
			
		int n = -1;
		int v = -1;
		int[] c = new int[5];
			
		for (int i=0;i<c.length;i++) {	
		if(v!=4) {
		
		v = v+1;
		System.out.println("Informe o Numero do Vetor");
		c [v]=entrada.nextInt();
		entrada.nextLine();
		
		}else {
			for(int j=0;j<=4;j++)
			System.out.printf("%5d%8d%n", n, c[n]);
				
		}
	}
			
			entrada.close();
			}

}
