package FilesF;

public class Pedido {

	private String produto;
	private String cliente;
	private String enderecoDeEntrega;
	private String notaFiscal;

	public Pedido(String produto, String cliente, String enderecoDeEntrega, String notaFiscal) {
		this.produto = produto;
		this.cliente = cliente;
		this.notaFiscal = notaFiscal;
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	public String getProduto() {
		return produto;
	}

	public String getCliente() {
		return cliente;
	}

	public String getEnderecoDeEntrega() {
		return enderecoDeEntrega;
	}

	public String getNotaFiscal() {
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(this.notaFiscal);
		buffer.append("\n");
		buffer.append(" Cliente : " + this.cliente);
		buffer.append("\n");
		buffer.append(" Produto : " + this.produto);
		buffer.append("\n");
		return buffer.toString();
		
	}
	

}
