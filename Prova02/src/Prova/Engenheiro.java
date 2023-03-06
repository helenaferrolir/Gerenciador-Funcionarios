package Prova;

public class Engenheiro extends Funcionario{
	
    private String nivel;
    
    public Engenheiro() {
    	super();
    	this.nivel = "--";
    }
    
	public Engenheiro(int matricula, double ht, int tempoDeExperiencia,String nivel) {
		super(matricula,ht,tempoDeExperiencia);
		
		if(this.nivel=="Junior") {
			this.setTempoDeExperiencia(3);
          }else {
          if(this.nivel=="Pleno01") {
  			this.setTempoDeExperiencia(6);
  		  }else {
          if(this.nivel=="Pleno02") {
  			 this.setTempoDeExperiencia(9);
  		}else {
          if(this.nivel=="Senior") {
  			 this.setTempoDeExperiencia(12);    
         }
  		}
  	   }
     }
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
    
	public void realizarPagamento(int cr, int mes, int ano, String descricao) {
		int valorAdicional = 0;
		if(getTempoDeExperiencia()==3) {
			valorAdicional=500;
		}else {
			if(getTempoDeExperiencia()==6) {
				valorAdicional=1000;
			}else {
				if(getTempoDeExperiencia()==9) {
					valorAdicional=2000;
			}else {
				if(getTempoDeExperiencia()==12) {
					valorAdicional=3000;
			}
			
			 }
	  		}
	  	   }
	      int salarioH = (int) (cr*this.getHt()+valorAdicional);
	      
	      Pagamentos p = new Pagamentos(mes,ano,salarioH,descricao);
	      super.setPagamentoMensal(p);
	      
	      System.out.println("Salario do gerente: "+salarioH);
	     }
		
		

	
	public double getSalario(double cr) {
		int valorAdd = 0;
		if(getTempoDeExperiencia()==3) {
			valorAdd=500;
		}else {
			if(getTempoDeExperiencia()==6) {
				valorAdd=1000;
			}else {
				if(getTempoDeExperiencia()==9) {
					valorAdd=2000;
			}else {
				if(getTempoDeExperiencia()==12) {
					valorAdd=3000;
			}
			
			 }
	  		}
	  	   }

	      int salarioH = (int) (cr*this.getHt()+valorAdd);
	     
		
        return salarioH;

       }
	public void imprimir() {
    	System.out.println("Eu sou o Engenheiro de Software: \n Matricula: "+this.getMatricula());
    	System.out.println("Meu tempo de experiência:  "+this.getTempoDeExperiencia());
        System.out.println("Meu nível é: "+this.getNivel());
    }
}
