
public class contaPoupanca extends conta {	
	
	public contaPoupanca(client client) {
		super(client);
		
	}
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato conta Poupanca ===");
		super.imprimirInfosComuns();
	
	}
		
	}
