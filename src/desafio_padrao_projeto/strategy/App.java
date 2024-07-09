package desafio_padrao_projeto.strategy;

public class App {

	public static void main(String[] args) {

		Comportamento normal = new ComportamentoNormal();
		Comportamento denfensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setStrategy(normal);
		robo.mover();
		
		robo.setStrategy(denfensivo);
		robo.mover();
		robo.mover();
		
		robo.setStrategy(agressivo);
		robo.mover();
		
	}

}
