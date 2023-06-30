package GerenciadordeProdutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GerenciadordeProdutos {
    private List<Produto> produtos;
    public GerenciadordeProdutos(){produtos = new ArrayList<>();}
    public void AdicionarProdutos(Produto produto){ produtos.add(produto);}
    public void ExibirProdutos(){
        for (Produto produto : produtos){
            System.out.println("Nome: "+produto.getNome()+"Preço:R$ "+produto.getPreco());
        }
    }
    public void ExcluirProdutos(String nome){
        for (Produto produto : produtos){
            if (produto.getNome().equalsIgnoreCase(nome)){
                produtos.remove(produto);
                break;
            }
        }
    }
public static void main (String[]args){
    GerenciadordeProdutos gerenciador = new GerenciadordeProdutos();
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("\nOpçoes:");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Exibir Produtos Cadastrados");
        System.out.println("3. Excluir Produto");
        System.out.println("0. Sair");
        System.out.println("Escolha a opção desejada: ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Digite o nome do produto: ");
                String nome = scanner.next();
                System.out.println("Digite o preco do produto: ");
                double preco = scanner.nextDouble();
                gerenciador.AdicionarProdutos( new Produto(nome, preco));
                break;
            case 2:
                gerenciador.ExibirProdutos();;
                break;
            case 3:
                System.out.println("Digite o nome do produto pra excluir: ");
                String nomeExcluir = scanner.next();
                gerenciador.ExcluirProdutos(nomeExcluir);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opção Invalida");
                break;
        }
    }while (true);
}
}
