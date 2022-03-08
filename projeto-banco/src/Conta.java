
public abstract class Conta implements iConta {

	protected int agencia;
	protected int conta;
	protected double valor;
	protected Cliente cliente;
	
	private static final int AGENCIA_PADRAO=1;
	private static int SEQUENCIAL=1;
	
	public Conta(Cliente cliente) {
		this.agencia=AGENCIA_PADRAO;
		this.conta=SEQUENCIAL++;
		this.cliente=cliente;
	}
	
	public void sacar(double valor) {
		this.valor-=valor;
	}
	
	public void depositar(double valor) {
		this.valor+=valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public double getValor() {
		return valor;
	}

	protected Cliente getCliente() {
		return cliente;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Cliente: %s", this.getCliente().getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.conta));
		System.out.println(String.format("Valor: %.2f", this.valor));
	}
}
