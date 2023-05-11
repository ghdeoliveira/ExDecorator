package ex_decorator;

public class LeiteSoja extends DecoradorCondimento {
	
	Bebida bebida;
	
	public LeiteSoja(Bebida bebida) {
		this.bebida = bebida;
	}
	
	@Override
	public String getDescricao(){
		return bebida.getDescricao() + ", Leite de Soja";
	}
	
	@Override
	public double custo(){
		return 0.25 + bebida.custo();
	}

}
