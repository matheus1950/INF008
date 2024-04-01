
public class Conta {
	private int numero;
	private float saldo;
	Cliente cliente;
	
	public Conta(int numero, float saldo, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public void atualizacaoMensal() {
		
	}

	public int getNumero() {
		return this.numero;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(float valor) { 
		if((saldo - valor) >= 0) 
			saldo -= valor;
		else
			System.out.println("Saldo insuficiente!");
	}

	public float consultarSaldo() {
		return saldo;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
