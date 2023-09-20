package List.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> carrinhoDeCompras;
    
    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item =new Item(nome, preco, quantidade);
        this.carrinhoDeCompras.add(item);
    }

    public void removerItem(String nome)
    {
        List<Item> itensParaRemover = new ArrayList<>();
        
        if (!carrinhoDeCompras.isEmpty()) 
        {
            for (Item i : carrinhoDeCompras) 
            {
              if (i.getNome().equalsIgnoreCase(nome)) 
              {
                itensParaRemover.add(i);
              }
            }
            carrinhoDeCompras.removeAll(itensParaRemover);
        }else {
            System.out.println("A lista de itens está vazia!");
        }
    }

    public double calcularValorTotal() 
    {
        double valorTotal = 0d;
        
        if (!carrinhoDeCompras.isEmpty()) 
        {
            for (Item item : carrinhoDeCompras) 
            {
              double valorItem = item.getPreco() * item.getQuant();
              valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() 
    {
        if (!carrinhoDeCompras.isEmpty()) 
        {
          System.out.println(this.carrinhoDeCompras);
        } else {
          System.out.println("A lista está vazia!");
        }
    }

    public String toString() {
        return "CarrinhoDeCompras{" +
            "itens=" + carrinhoDeCompras +
            '}';
    }

    public static void main(String[] args) 
    {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
    
        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);
    
        // Exibindo os itens no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");
    
        // Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();
    
        // Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }

}
