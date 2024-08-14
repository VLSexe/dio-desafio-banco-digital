
public class Main {

	//@SuppressWarnings("null")
	public static void main(String[] args) {
	
		client venilton = new client();
		venilton.setNome("venilton");
		
		
		conta cc = new contaCorrente(venilton);
		contaPoupanca poupanca = new contaPoupanca(venilton);
		

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();		
		
	}

}
