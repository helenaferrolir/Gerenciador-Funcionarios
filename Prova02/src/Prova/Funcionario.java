package Prova;

import java.util.ArrayList;


public abstract class Funcionario {
    private int matricula;
    private double ht; //valor das horas trabalhadas
    private int tempoDeExperiencia;
    private ArrayList<Pagamentos> historicoPagamentoMensal = new ArrayList<Pagamentos>();
    
    public Funcionario() {
		this.matricula = 0;
		this.ht = 0;
		this.tempoDeExperiencia = 0;
	}

	public Funcionario(int matricula, double ht, int tempoDeExperiencia) {
		this.matricula = matricula;
		this.ht = ht;
		this.tempoDeExperiencia = tempoDeExperiencia;
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getHt() {
		return ht;
	}

	public void setHt(double ht) {
		this.ht = ht;
	}

	public double getTempoDeExperiencia() {
		return tempoDeExperiencia;
	}

	public void setTempoDeExperiencia(int tempoDeExperiencia) {
		this.tempoDeExperiencia = tempoDeExperiencia;
	}
	public ArrayList<Pagamentos> getHistoricoPagamentoMensal() {
		return historicoPagamentoMensal;
	}

	public void setHistoricoPagamentoMensal(ArrayList<Pagamentos> historicoPagamentoMensal) {
		this.historicoPagamentoMensal = historicoPagamentoMensal;
	}
	public void setPagamentoMensal(Pagamentos pagamentoMensal) {
		this.historicoPagamentoMensal.add(pagamentoMensal);
	}
	//cr carga horaria
	public abstract void realizarPagamento(int cr, int mes, int ano, String descricao);
	//valor do salario do funcionario
    //cria uma instancia de pagamento e registra
    public abstract void imprimir();
    //imprime funcionario
    
    public abstract double getSalario(double cr);

	@Override
	public String toString() {
		return "Funcionario [matricula=" + matricula + ", ht=" + ht + ", tempoDeExperiencia=" + tempoDeExperiencia
				+ ", historicoPagamentoMensal=" + historicoPagamentoMensal + "]";
	}
   
	 
}
