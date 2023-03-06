package Prova;

public class Gerente extends Funcionario{
    private int NumeroEquipes;
    
	public Gerente() {
		super();
		this.NumeroEquipes = 0;
	}
	public Gerente(int matricula, double ht, int tempoDeExperiencia, int NumeroEquipes) {
		super(matricula, ht, tempoDeExperiencia);
		this.NumeroEquipes = NumeroEquipes;
	}
	

	public int getNumeroEquipes() {
		return NumeroEquipes;
	}

	public void setNumeroEquipes(int numeroEquipes) {
		NumeroEquipes = numeroEquipes;
	}

	@Override
	public void realizarPagamento(int cr, int mes, int ano, String descricao) {
		
		int salarioG = (int) (cr*this.getHt()*this.NumeroEquipes);

		Pagamentos p = new Pagamentos(mes,ano,salarioG,descricao);
	      super.setPagamentoMensal(p);
		//CR*HT*NE (NumeroDeEquipes)
		
		
		
		System.out.println("Salario do gerente: "+salarioG);
		
	}
    public void imprimir() {
    	System.out.println("Eu sou o Gerente: \n Matricula: "+this.getMatricula());
    	System.out.println("Meu tempo de experiência:  "+this.getTempoDeExperiencia());
        System.out.println("Tenho o seguinte total de equipes: "+this.NumeroEquipes);
    }
    public double getSalario(double cr) {
    	int salarioG = (int) (cr*this.getHt()*this.NumeroEquipes);
    	return salarioG;
    }

	

}
