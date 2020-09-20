
public class Principal {

	public static void main(String[] args) {
		Funcionario f = new Funcionario ("Fulano");             // pedido normal
		
		f.receberPedido();
		f.receberPagamento();
		f.entregarPedido();
		
		System.out.println("---------------");
		
		Funcionario f1 = new Funcionario ("Ciclano");          // Erro de quando o pedido não foi feito
		f.receberPagamento();
		
		
		

	}

}
