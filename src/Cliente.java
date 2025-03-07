abstract public class Cliente {
    private String nome;
    private double valorCompra;


    public Cliente(String nome, double valorCompra) {
        this.nome = nome;
        this.valorCompra = valorCompra;
    }

    public abstract double calcularPagamento();

    @Override
    public String toString() {
        return String.format("Nome: %s | Valor da Compra: %.2f ", nome, valorCompra);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
