package ex_decorator;

public class Espresso extends Bebida {
	
	public Espresso() {
		descricao = "Espresso";
	}
	
	@Override
	public double custo() {
		return 1.99;
	}

}
