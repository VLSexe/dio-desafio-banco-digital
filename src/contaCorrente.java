
public class contaCorrente extends conta {

	public contaCorrente(client client) {
		super(client);
		
	}
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta corrente ===");
		super.imprimirInfosComuns();

	}
	
	}
	

