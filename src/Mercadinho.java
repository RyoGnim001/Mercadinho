import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;

public class Mercadinho {

    private List<Cliente> todosClientes = new LinkedList<Cliente>();

    public void adicionarClientes(Cliente cliente){
        todosClientes.add(cliente);
    }

    public void exibirTodosClientes(){
        for( Cliente cliente : todosClientes){
            System.out.println(cliente.toString());
            System.out.println("-----------------");
        }
    }

    public String valorTotal(){
        double total = 0;
        for(Cliente cliente: todosClientes){
            total += cliente.calcularPagamento();
        }
        DecimalFormat df = new DecimalFormat("#.00");
        return "Valor total de todas as compras: " + df.format(total);

    }
}
