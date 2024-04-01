
public class ContaPoupanca extends Conta{

	public ContaPoupanca(int numero, float saldo, Cliente cliente) {
		super(numero, saldo, cliente);
	}

	public void atualizacaoMensal() {
		depositar(consultarSaldo() * 0.01);
		System.out.println("Atualização realizada!");
	}

	@Override
	public String toString() {
		return "ContaPoupanca [cliente=" + cliente.getNome() + ", getNumero()=" + getNumero() + ", consultarSaldo()="
				+ consultarSaldo() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
