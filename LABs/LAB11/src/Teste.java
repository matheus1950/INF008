
public class Teste {

	public static void main(String[] args) {
		
		int numero = 0;
		int contador = 0;
		
		System.out.println("Teste!");
		
		Banco banco = new Banco();
		
		Cliente clienteP1 = new Cliente("Zé");
		ContaPoupanca contaP1 = new ContaPoupanca(numero++, 100, clienteP1);
		banco.contas[contador++] = contaP1;
	
		Cliente clienteP2 = new Cliente("Maria");
		ContaPoupanca contaP2 = new ContaPoupanca(numero++, 100, clienteP2);
		banco.contas[contador++] = contaP2;
		
		Cliente clienteP3 = new Cliente("Lucas");
		ContaPoupanca contaP3 = new ContaPoupanca(numero++, 100, clienteP3);
		banco.contas[contador++] = contaP3;
		
		Cliente clienteP4 = new Cliente("Joana");
		ContaCorrente contaP4 = new ContaCorrente(numero++, 100, clienteP4);
		banco.contas[contador++] = contaP4;
		
		System.out.println("Contas cadastradas:");
		System.out.println(contaP1);
		System.out.println(contaP2);
		System.out.println(contaP3);
		System.out.println(contaP4);
		
		banco.sacar(0, 30);
		System.out.println("Saque de P1:");
		System.out.println(contaP1);
		
		System.out.println("Deposito de P1:");
		banco.depositar("Zé", 34);
		System.out.println(contaP1);
		
		banco.atualizacaoGeral();
		System.out.println(contaP1);
		System.out.println(contaP2);
		System.out.println(contaP3);
		System.out.println(contaP4);
		
		System.out.println("Saldo da 1ª conta corrente(P4):");
		System.out.println(banco.consultarSaldo(3));
		
		System.out.println("Valor Total:");
		System.out.println(banco.valorTotal());
	
	}	
}



