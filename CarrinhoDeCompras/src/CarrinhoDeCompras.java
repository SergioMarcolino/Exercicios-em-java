import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //attribute
    private List<Itens> listaDeItens;
    //constructor
    public CarrinhoDeCompras() {
        listaDeItens = new ArrayList<>();
    }
    //methods
    public void adicionarItens(String name, int quantidade, int preco) {
        listaDeItens.add(new Itens (name, quantidade, preco));
    }

    public void removerItens(String Name) {
        List<Itens> listaDeItensParaRemover = new ArrayList<>();
        for (Itens e: listaDeItens) {
            if (e.getName().equalsIgnoreCase(Name)) {
                listaDeItensParaRemover.add(e);
            }
        }
        listaDeItens.removeAll(listaDeItensParaRemover);
    }
    public int CalcularValorTotal() {
        int total = 0;
        for (Itens e: listaDeItens) {
            total +=e.getPrice() * e.getQuantity();
        }
        return total;
    }
    public  String exibirItens() {
        return listaDeItens.toString();
    }
}
