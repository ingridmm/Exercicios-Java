package exercicios;

import java.util.Scanner;

public class ExercicioGit7 {
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int num = s.nextInt();
		
		if (num >=1 && num <=10){
			System.out.println("Tabuada de: "+num);
			
			for (int i = 1; i <= 10; i++) {
				int r = i*num;
				System.out.println(num+"X"+i+" = "+r);
			}
		} else {
			System.out.println("Numero Inválido");
		}
		
	}
}
