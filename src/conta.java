
public abstract class conta implements iConta{
	
	protected static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected client client;
	protected double celular;

	public conta(client client) {
		this.agencia = conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.client = client;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;			
	}
	@Override
	public void transferir(double valor, iConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
	System.out.println(String.format("Titular: %s", this.client.getnome()));
	System.out.println(String.format("Agencia: %d", this.agencia));
	System.out.println(String.format("Numero: %d", this.numero));
	System.out.println(String.format("saldo: %.2f", this.saldo));
	System.out.println(String.format("Foi realizado uma transferencia seu saldo e : %.2f", this.saldo));
  }


		
	}

