package lista_exercicios;

public class Fatorial {

	public static void main(String[] args) {
		int numero = 6;//numero de entrada
		long fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			//fotorial vai ser igual a fotorial vezes a quantidade de repetiçoes no for
			fatorial = fatorial * i;

		}
		//impressão do resultado
		System.out.println("fatorial dé " + numero + " é " + fatorial);
	}

}
