package ex_decorator;

public class Leite extends DecoradorCondimento {
	
	Bebida bebida;
	
	public Leite(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao(){
		return bebida.getDescricao() + ", Leite";
	}
	
	@Override
	public double custo(){
		return 0.15 + bebida.custo();
	}

}
