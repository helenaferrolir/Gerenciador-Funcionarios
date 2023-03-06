package Prova;

public class Designer extends Funcionario{

	public Designer() {
		super();
	}
	
	public Designer(int matricula, double ht, int tempoDeExperiencia) {
		super(matricula, ht, tempoDeExperiencia);
		
	}

	public void realizarPagamento(int cr, int mes, int ano, String descricao) {
		int SalarioD= (int)(cr*getHt());
		Pagamentos p = new Pagamentos(mes,ano,SalarioD,descricao);
	    super.setPagamentoMensal(p);
	}
	
	 public void imprimir() {
		 System.out.println("Eu sou o Designer: \n Matricula: "+this.getMatricula());
		 System.out.println("Meu tempo de experiência:  "+this.getTempoDeExperiencia());
	        
    }
	 public double getSalario(double cr) {
		 
		 int Salario= (int)(cr*getHt());
			return Salario;
	    	
	    }
}
