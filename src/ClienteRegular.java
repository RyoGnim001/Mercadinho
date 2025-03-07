public class ClienteRegular extends Cliente{
    public ClienteRegular(String nome, double ValorCompra) {
        super(nome, ValorCompra);
    }

    @Override
    public double calcularPagamento(){
        return getValorCompra();
    }

    @Override
    public String toString() {
        return super.toString() + "|Valor total dessa compra: " + calcularPagamento();
    }
}