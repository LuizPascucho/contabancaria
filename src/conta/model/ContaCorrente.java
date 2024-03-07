package conta.model;

//CONTA CORRENTE HERDA DE CONTA
public class ContaCorrente extends Conta {

	private float limite;
	
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
	
		super(numero, agencia, tipo, titular, saldo);
	
		this.limite = limite;
	}

	//MÉTODO DE ACESSO
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	//MÉTODOS ESPECÍFICOS
	
	@Override  //Override = sobrescrever
	public boolean sacar(float valor) {
		
		if(this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
		
	}
	
	public void visualizar() {
		// Super == chamada da superclasse => Conta.visualizar();
		super.visualizar();
		System.out.println("Limite de Crédito: " + this.limite);
	}
	
	
	
	
	
}
