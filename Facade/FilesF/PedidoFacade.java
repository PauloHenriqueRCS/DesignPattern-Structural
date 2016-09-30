package FilesF;

public class PedidoFacade {

	private Estoque estoque;
	private Financeiro financeiro;
	private PosVenda posVenda;

	public PedidoFacade(Estoque estoque, Financeiro financeiro, PosVenda posVenda) {
		this.estoque = estoque;
		this.financeiro = financeiro;
		this.posVenda = posVenda;
	}

	public void registraPedido(Pedido p) {
		this.estoque.enviaProduto(p.getProduto(), p.getEnderecoDeEntrega(), p.getNotaFiscal());
		this.financeiro.fatura(p.getCliente(), p.getNotaFiscal());
		this.posVenda.agendaContato(p.getCliente(), p.getProduto());
	}
}