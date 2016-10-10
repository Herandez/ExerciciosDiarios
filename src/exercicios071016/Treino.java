package exercicios071016;

import java.util.Random;
import java.util.Scanner;

public class Treino {
	public Treino(){
		
		compara2();
		
		compara3();
		
		adivinha();
		
	}
	
	private void compara2(){
		System.out.println("Introduza 2 numeros !");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 < num2){
			System.out.println("O numero " + num2 + " é maior");
		}
		else{
			System.out.println("O numero " + num1 + "é maior");
		}
		
	}
	private void compara3(){
		System.out.println("Introduza 3 numeros");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduza o 1º numero:");
		int num1= sc.nextInt();
		System.out.println("Introduza o 2º numero:");
		int num2= sc.nextInt();
		System.out.println("Introduza o 3º numero:");
		int num3= sc.nextInt();
		
		if (num1 > num2 && num1 > num3){
			System.out.println("O 1º numero é o maior");
		}
		else if (num2 > num1 && num2 > num3){
			System.out.println("O 2º numero é o maior");	
		}
		else{
			System.out.println("O 3º numero é o maior");
		}
		
		
	}
	
	private void adivinha(){
		Scanner sc = new Scanner(System.in);
		int numrand = (new Random()).nextInt(100);
		
		System.out.println("O numero secreto entre 0 e 100 foi gerado, tem 5 tentativas para o adivinhar !!");
		
		for(int i=0; i<5; i++){
			System.out.println((i + 1) + "ª tentativa: ");
			int numuser = sc.nextInt();
			
			if (numuser == numrand){
				System.out.println("Parabéns !! adivinhou o numero");
				break;
			}
		}
		System.out.println("Esgotou as 5 tentativas, fim do jogo.");
	}

}
