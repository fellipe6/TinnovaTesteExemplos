package lista_exercicios;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		//Entrada de dados
		try (Scanner numero = new Scanner(System.in)) {
			System.out.println("Digite o primeiro numero");
			int X = numero.nextInt(); //Inicializa variável X
			//executa o teste com chamando o método  sum
			int result = sum(3, X-1) + sum(5, X-1);

			System.out.println(result);
		}
	  }
	//Cria a formula
	  public static int sum(int n, int X) {
	      return n * (X/n) * (X/n + 1)/2;
	  }

	}

