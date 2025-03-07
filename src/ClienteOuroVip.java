public class ClienteOuroVip extends ClienteVip {
    private String endereco;
    public ClienteOuroVip(String nome,double valorCompra, String numeroCartao,String endereco) {
        super(nome, valorCompra, numeroCartao);
        this.endereco = endereco;
    }

    @Override
    public double calcularPagamento() {
        return getValorCompra() * 0.85;
    }

    @Override
    public String toString() {
        return super.toString() + "| Endereço: " + getEndereco();
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
