
public class Banco {
	Conta contas[] = new Conta[4];
	
	public float valorTotal() {
		int soma = 0;
		for(Conta conta : contas) {
			soma += conta.consultarSaldo();
		}
		return soma;
	}
	
	public void depositar(int numero, int valor){
		for(Conta conta : contas) {
			if(conta.getNumero() == numero)
				conta.depositar(valor);
		}
	}
	
	public void depositar(String nome, int valor){
		for(Conta conta : contas) {
			if(conta.cliente.getNome() == nome)
				conta.depositar(valor);
		}
	}
	
	
	public void sacar(int numero, int valor){
		for(Conta conta : contas) {
			if(conta.getNumero() == numero)
				conta.sacar(valor);
		}
	}
	
	public void sacar(String nome, int valor){
		for(Conta conta : contas) {
			if(conta.cliente.getNome() == nome)
				conta.sacar(valor);
		}
	}
	
	
	public float consultarSaldo(int numero){
		for(Conta conta : contas) {
			if(conta.getNumero() == numero)
				return conta.consultarSaldo();
		}
		return (float) (0.0);
	}
	
	public float consultarSaldo(String nome){
		for(Conta conta : contas) {
			if(conta.cliente.getNome() == nome)
				return conta.consultarSaldo();
		}
		return (float) (0.0);
	}
	
	public void atualizacaoGeral() {
		for(Conta conta : contas) {
			conta.atualizacaoMensal();
		}
	}
}
