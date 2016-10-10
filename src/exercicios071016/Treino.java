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
			System.out.println("O numero " + num2 + " � maior");
		}
		else{
			System.out.println("O numero " + num1 + "� maior");
		}
		
	}
	private void compara3(){
		System.out.println("Introduza 3 numeros");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduza o 1� numero:");
		int num1= sc.nextInt();
		System.out.println("Introduza o 2� numero:");
		int num2= sc.nextInt();
		System.out.println("Introduza o 3� numero:");
		int num3= sc.nextInt();
		
		if (num1 > num2 && num1 > num3){
			System.out.println("O 1� numero � o maior");
		}
		else if (num2 > num1 && num2 > num3){
			System.out.println("O 2� numero � o maior");	
		}
		else{
			System.out.println("O 3� numero � o maior");
		}
		
		
	}
	
	private void adivinha(){
		Scanner sc = new Scanner(System.in);
		int numrand = (new Random()).nextInt(100);
		
		System.out.println("O numero secreto entre 0 e 100 foi gerado, tem 5 tentativas para o adivinhar !!");
		
		for(int i=0; i<5; i++){
			System.out.println((i + 1) + "� tentativa: ");
			int numuser = sc.nextInt();
			
			if (numuser == numrand){
				System.out.println("Parab�ns !! adivinhou o numero");
				break;
			}
		}
		System.out.println("Esgotou as 5 tentativas, fim do jogo.");
	}

}
