package ex_decorator;

public class Ex_Decorator {

	public static void main(String[] args) {
		
		Bebida bebida1 = new Espresso();
		System.out.println(bebida1.getDescricao() + " = R$" + bebida1.custo());
		
		Bebida bebida2 = new HouseBlend();
		bebida2 = new LeiteSoja(bebida2);
		bebida2 = new Mocha(bebida2);
		bebida2 = new Espuma(bebida2);
		System.out.println(bebida2.getDescricao() + " = R$" + bebida2.custo());
		
	}

}
