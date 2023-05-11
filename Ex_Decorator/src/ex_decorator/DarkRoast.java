package ex_decorator;

public class DarkRoast extends Bebida {
	
	public DarkRoast(){
		descricao = "Café Extra Torrado";
	}
	
	@Override
	public double custo(){
		return 1.19;
	}

}
