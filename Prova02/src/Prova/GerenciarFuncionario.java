package Prova;

import java.util.ArrayList;

public class GerenciarFuncionario {
    ArrayList<Funcionario> lista;
    
	public GerenciarFuncionario() {
		this.lista = new ArrayList<Funcionario>();
	}
	public void addFuncionario(Funcionario funci) {
		for(Funcionario f: this.lista) {
			if(f.getMatricula()==funci.getMatricula()) {
				System.out.println("Matricula ja existe!");
				return;
			}
		}
		lista.add(funci);
		System.out.println("Funcionario cadstrado!");
	}
	public void removerFuncionario(int mat) {
		
    	for(Funcionario f: this.lista) {
    		if(f.getMatricula()==mat) {
    			this.lista.remove(f);
    			System.out.println("Removido com sucesso!");
    			return;
    		}
    	}
    	System.out.println("Matriula não encontrada!");
	}
	public void pagar(int matricula, int cr, int mes, int ano, String descricao) {
		for(Funcionario f: this.lista) {
    		if(f.getMatricula()==matricula) {
    		   f.realizarPagamento(cr, mes, ano, descricao="Salario");
    		   return;
    		}
		}
		System.out.println("Matricula não encontrada!");
	}
	public void consultarSalario(int matricula, int cr) {
		for(Funcionario f: this.lista) {
    		if(f.getMatricula()==matricula) {
    		   f.getSalario(cr);
    		}
		}
		System.out.println("Matricula não encontrada!");
	}
	public void buscarFuncionario(int matricula) {
		for(Funcionario f: this.lista) {
    		if(f.getMatricula()==matricula) {
    			imprimirFuncionario();
    		}
		}
    		   
	}
	 public void imprimirFuncionario() {
    	for(Funcionario f: this.lista) {
    		System.out.println("Lista: \n"+f);
    	}
    }
	 
	public ArrayList<Funcionario> getLista() {
		return lista;
	}
	@Override
	public String toString() {
		return "GerenciarFuncionario [lista=" + lista + "]";
	}
	
	
	 
	 
}
