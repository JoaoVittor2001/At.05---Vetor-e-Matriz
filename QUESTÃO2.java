package ATIVIDADE5;

import java.util.Random;

public class QUEST�O2 {

	public static void main(String[] args) {
		
     Random generator =  new Random();
		
	 final int TAM = 10;
	 
	 final int LIMIT = 10;
		
	 float [] vet = new float[TAM];
		
	 for(int i=0;i<TAM;i++) {
		vet[i]=generator.nextInt(LIMIT);
			
	 }  
	    System.out.print(vet[0]+"|");
		
	    System.out.print(vet[1]+"|");
		
		System.out.print(vet[2]+"|");
		
		System.out.print(vet[3]+"|");
		
		System.out.print(vet[4]+"|");
		
		System.out.print(vet[5]+"|");
		
		System.out.print(vet[6]+"|");
		
		System.out.print(vet[7]+"|");
		
		System.out.print(vet[8]+"|");
		
		System.out.print(vet[9]+"|");
	}

}
