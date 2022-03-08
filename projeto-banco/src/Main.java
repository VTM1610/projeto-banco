import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente victor = new Cliente("Victor","Moura","123.456.789-10");
		
		ContaCorrente cc= new ContaCorrente(victor);
		ContaPoupanca cp = new ContaPoupanca(victor);
		
		List<Conta> contas = new ArrayList<Conta>();
		contas.add(cc);
		contas.add(cp);
		
		Banco bradesco = new Banco("Bradesco",contas);
		bradesco.imprimirInfosClientesMesmoNome("Victor");
		
		
	}

}
