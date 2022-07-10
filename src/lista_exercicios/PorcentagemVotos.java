package lista_exercicios;

public class PorcentagemVotos {

	private int total =  1000;
	private int validos = 800;
	private int brancos = 150;
	private double nulos = 50;

	
	public double getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public double getValidos() {
		return validos;
	}


	public void setValidos(int validos) {
		this.validos = validos;
	}


	public double getBrancos() {
		return brancos;
	}


	public double getNulos() {
		return nulos;
	}


	public void setNulos(double nulos) {
		this.nulos = nulos;
	}

	public void setBrancos(int brancos) {
		this.brancos = brancos;
	}
	
	public void votosValidos() {
		System.out.println((getValidos() / getTotal())*100 + "%");
	}
	public void votosBrancos() {
		System.out.println((getBrancos() / getTotal())*100 + "%");
	}
	public void votosNulos() {
		System.out.println((getNulos() / getTotal())*100 + "%");
	}


}
