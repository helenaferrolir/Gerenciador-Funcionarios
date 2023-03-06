package Prova;

public class Principal {

	public static void main(String[] args) {
		
		Engenheiro engenheiro = new Engenheiro(1254,24,3,"Junior");

		GerenciarFuncionario g = new GerenciarFuncionario();
		
		g.addFuncionario(engenheiro);
		
		g.pagar(1254, 24,9, 2022,"--");
		
		g.addFuncionario(engenheiro);
		
		System.out.println("HISTÓRICO DE PAGAMENTO: "+engenheiro.getHistoricoPagamentoMensal());
		
	}

}
