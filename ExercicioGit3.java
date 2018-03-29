package exercicios;

import java.util.Scanner;

public class ExercicioGit3 {
	  public static void main (String[] args){
		  Scanner scanner = new Scanner(System.in);
		  int n1 = scanner.nextInt();
		  int n2 = scanner.nextInt();
		  int n3 = scanner.nextInt();
		  int maior; int menor;
		  
		  if (n1>n2){
			  maior = n1;
			  menor = n2;
		  } else {
			maior = n2;
			menor = n1;
		  }
		  
		  if (n3 > maior) {
			maior = n3;
		}else if (n3<maior){
		 	menor = n3;
		}
		  /*n1 = 5
		   * n2 = 3
		   * n3 = 4*/
		  
		  System.out.println("O maior nº é: " +maior);
		  System.out.println("O menor nº é: " +menor);
	  }
}
