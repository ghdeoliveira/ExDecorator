package ex_decorator;

public class Descafeinado extends Bebida {
	
	public Descafeinado() {
		descricao = "Descafeinado";
	}
	
	@Override
	public double custo() {
		return 1.29;
	}

}
