package desafio_padrao_projeto.strategy;

public class Robo {
	
	private Comportamento comportamento;

	public void setStrategy(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void mover() {
		comportamento.mover();
	}
	

}
