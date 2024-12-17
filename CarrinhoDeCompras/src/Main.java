public class Main {
    public static void main(String[] args) {

    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
    carrinho.adicionarItens("Milho",1  ,1);
    carrinho.adicionarItens("Milho1",2  ,2);
        System.out.println(carrinho.CalcularValorTotal());
    carrinho.removerItens("Milho1");

    }
}