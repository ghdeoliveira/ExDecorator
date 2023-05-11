package ex_decorator;

public class HouseBlend extends Bebida {
	
	public HouseBlend(){
		descricao = "Café House Blend";
	}
	
	@Override
	public double custo(){
		return 0.89;
	}

}
