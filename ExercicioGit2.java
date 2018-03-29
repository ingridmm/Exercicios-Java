package exercicios;

import java.util.Scanner;

public class ExercicioGit2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double altura;
		altura = scanner.nextDouble();
		double peso = ((72.7d * altura) - 58);
		System.out.println("Peso ideal é: "+peso);
	}
}
