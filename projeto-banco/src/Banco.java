import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome, List<Conta> contas) {
		this.nome=nome;
		this.contas=contas;
	}

	public String getNome() {
		return nome;
	}

	public List<Conta> getContas() {
		return contas;
	}
	
	public void adicionarConta(Conta conta) {
		if(this.contas.contains(conta))
			System.out.println("Conta ja cadastrada");
		else
			this.contas.add(conta);
	}
	
	public void removerConta(Conta conta) {
		if(this.contas.contains(conta))
			this.contas.remove(this.contas.indexOf(conta));
		else
			System.out.println("Conta inexistente");
	}
	
	public void imprimirClientes() {
		for(int i=0;i<this.contas.size();i++)
		{
			System.out.println(this.contas.get(i).getCliente().getNome());
		}
	}
	
	public void imprimirInfosCliente(Cliente cliente) {
		for(int i=0;i<this.contas.size();i++)
		{
			if(this.contas.get(i).getCliente().equals(cliente))
			{
				this.contas.get(i).imprimirInfos();
				break;
			}	
		}
		System.out.println("Cliente nao encontrado");
	}
	
	public void imprimirInfosCliente(int conta) {
		for(int i=0;i<this.contas.size();i++)
		{
			if(this.contas.get(i).getConta()==conta)
			{
				this.contas.get(i).imprimirInfos();
				break;
			}
		}
		System.out.println("Cliente nao encontrado");
	}
	
	public void imprimirInfosCliente(String cpf) {
		for(int i=0;i<this.contas.size();i++)
		{
			if(this.contas.get(i).getCliente().getCpf()==cpf)
			{
				this.contas.get(i).imprimirInfos();
				break;
			}	
		}
		System.out.println("Cliente nao encontrado");
	}
	
	public void imprimirInfosClientesMesmoNome(String nome) {
		for(int i=0;i<this.contas.size();i++)
		{
			if(this.contas.get(i).getCliente().getNome()==nome)
			{
				this.contas.get(i).imprimirInfos();
			}	
		}
		System.out.println("Cliente nao encontrado");
	}
}
