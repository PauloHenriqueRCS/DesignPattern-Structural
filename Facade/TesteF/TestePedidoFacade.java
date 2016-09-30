package TesteF;

import FilesF.*;

public class TestePedidoFacade {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		Financeiro financeiro = new Financeiro();
		PosVenda posVenda = new PosVenda();
		PedidoFacade facade = new PedidoFacade(estoque, financeiro, posVenda);
		Pedido pedido = new Pedido("Notebook ASUS", "Paulo Henrique Rodrigues", "Av.Afonso Pena, 1571, Belo Horizonte, MG", "0001");
		facade.registraPedido(pedido);
	}

}
