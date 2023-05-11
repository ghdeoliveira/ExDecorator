package ex_decorator;

public class Espuma extends DecoradorCondimento {
	
	Bebida bebida;
	
	public Espuma(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao(){
		return bebida.getDescricao() + ", Espuma";
	}
	
	@Override
	public double custo(){
		return 0.35 + bebida.custo();
	}

}
