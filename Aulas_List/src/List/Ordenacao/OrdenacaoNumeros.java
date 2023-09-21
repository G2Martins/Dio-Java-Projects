package List.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros 
{
    //Atributo
    private List<Integer> numerosList;

    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumeros(int numero)
    {
        this.numerosList.add(numero); 
    }

    public List<Integer> ordenarAscendente() 
    {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        
        if (!numerosList.isEmpty()) 
        {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() 
    {
        List<Integer> numerosAscendente = new ArrayList<>(this.numerosList);
        
        if (!numerosList.isEmpty()) 
        {
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }

    public void exibirNumeros() 
    {
        if (!numerosList.isEmpty()) 
        {
          System.out.println(this.numerosList);
        } else {
          System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();
    
        // Adicionando números à lista
        numeros.adicionarNumeros(2);
        numeros.adicionarNumeros(5);
        numeros.adicionarNumeros(4);
        numeros.adicionarNumeros(1);
        numeros.adicionarNumeros(99);
    
        // Exibindo a lista de números adicionados
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
    
        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());
    
        // Exibindo a lista
        numeros.exibirNumeros();
    }








}
