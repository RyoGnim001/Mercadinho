public class ClienteVip extends Cliente {
    private String numeroCartao;

    public ClienteVip(String nome, double ValorCompra, String numeroCartao) {
        super(nome, ValorCompra);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public double calcularPagamento() {
        return getValorCompra() * 0.90;
    }
    @Override
    public String toString() {
        return super.toString() + "| NumeroCartao: | " + getNumeroCartao() + " Valor total dessa compra: " + calcularPagamento();
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }
}
