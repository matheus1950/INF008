
public class ContaCorrente extends Conta{
	
	public ContaCorrente(int numero, float saldo, Cliente cliente) {
		super(numero, saldo, cliente);
	}

	public void atualizacaoMensal() {
		sacar(1);
		System.out.println("Atualização realizada!");
	}

	@Override
	public String toString() {
		return "ContaCorrente [cliente=" + cliente.getNome() + ", getNumero()=" + getNumero() + ", consultarSaldo()="
				+ consultarSaldo() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
}
