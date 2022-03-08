
public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirInfos() {
		System.out.println("=== Conta Corrente ===");
		this.imprimirInfosComuns();
	}


}
