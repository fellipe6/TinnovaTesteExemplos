package lista_exercicios;

public class BubleSort {

	private int vetor[] = {5, 2, 3, 4, 7, 1, 0, 6};
	
	public void bubleSort() {
		//posição atual
		int pos;
		//variavel para troca
		int aux;
		boolean controlador;
		for(int i = 0; i<vetor.length - 1; i++) {
			controlador =  true;
			//compara o elemento da posição com seu proximo
			for(pos = 0; pos<vetor.length -1;pos++) {
				// verifica se o elemento atual é maior que o atual.
				if(vetor[pos] > vetor[pos + 1]) {
					//Realiza a troca
					aux = vetor[pos];
					vetor[pos] = vetor[pos + 1];
					vetor[pos + 1] = aux;
					controlador  = false;
				}
				
				}
			if(controlador) {
				break;
			}
			System.out.println("----Final da iteração" + i);
			mostraVetor();
		}
	}
	public void mostraVetor() {
		for(int i =0; i <vetor.length; i++) {
			System.out.println(vetor[i]+"  ");
		}
		
	}
	public static void main(String[] args) {
		BubleSort bubleSort = new BubleSort();
		bubleSort.bubleSort();
	}
}