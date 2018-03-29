package exercicios;

import java.util.Scanner;

public class exercicioGit1 {
	  public static void main (String[] args){
		  Scanner scanner = new Scanner(System.in);
		  float fahr; float celsius;
		  
		  fahr = scanner.nextFloat();
		  celsius = 5*(fahr-32)/9;
		  System.out.println("Temp em celsius = "+celsius);
	  }

}
