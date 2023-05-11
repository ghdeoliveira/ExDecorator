package ex_decorator;

public class Mocha extends DecoradorCondimento {
	
	Bebida bebida;
	
	public Mocha(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao(){
		return bebida.getDescricao() + ", Mocha";
	}
	
	@Override
	public double custo(){
		return 0.20 + bebida.custo();
	}

}
