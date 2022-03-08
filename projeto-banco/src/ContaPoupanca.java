
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirInfos() {
		System.out.println("=== Conta Poupanca ====");
		this.imprimirInfosComuns();
	}

}
