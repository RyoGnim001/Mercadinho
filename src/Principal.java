public class Principal {
    public static void main(String[] args) {

        Mercadinho clientesMercado = new Mercadinho();

        Cliente clienteRegular = new ClienteRegular("Mateus", 50.50);
        Cliente clienteVip = new ClienteVip("Lucas", 100, "123");
        Cliente clienteOuroVip = new ClienteOuroVip("José", 200, "567", "Nova Olinda");

        clientesMercado.adicionarClientes(clienteRegular);
        clientesMercado.adicionarClientes(clienteVip);
        clientesMercado.adicionarClientes(clienteOuroVip);

        clientesMercado.exibirTodosClientes();
        System.out.println(clientesMercado.valorTotal());

    }
}