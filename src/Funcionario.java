
public class Funcionario implements DriveTrhu {
	
	private String nome;
	private boolean cozinhando;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isCozinhando() {
		return cozinhando;
	}
	public void setCozinhando(boolean cozinhando) {
		this.cozinhando = cozinhando;
	}
	
	// Construtor para definir nome do funcionario 
	public Funcionario(String nome) { 
		this.nome = nome;
	}
	
	// Construtor para sempre começar false
	public Funcionario() {
		this.cozinhando = false;
	}
	
	
	public void receberPedido() {
		System.out.println("Pedido recebido!");		
		this.setCozinhando(true);
	}
	
	public void receberPagamento() {
		if(this.isCozinhando()) {
			System.out.println("Pagamento recebido!");
		}else {
			System.out.println("Nenhum Pedido feito!");
		}
		
	}
	
	
	public void entregarPedido() {
		System.out.println("Pedido entregue!");
		this.setCozinhando(false);
		
	}
	
	
	
	
	
	
	
	

}
