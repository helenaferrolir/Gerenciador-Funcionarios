package Prova;


public class Pagamentos {
	private int mes;
	private int ano;
	private double valor;
	private String descricao;

	public Pagamentos() {
		this.mes = 0;
		this.ano = 0;
	    this.valor = 0;
	    this.descricao = "-";
	}
	public Pagamentos(int mes, int ano, double valor, String descricao) {
		this.mes = mes;
		this.ano = ano;
	    this.valor = valor;
	    this.descricao = descricao;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
    
	@Override
	public String toString() {
		return "Pagamentos [mes=" + mes + ", ano=" + ano + ", valor=" + valor + ", descricao=" + descricao + "]";
	}

}
