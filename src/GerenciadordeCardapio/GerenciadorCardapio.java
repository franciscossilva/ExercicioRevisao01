import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorCardapio {
    private List<Prato> cardapio;

    public GerenciadorCardapio() {
        cardapio = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        cardapio.add(prato);
    }

    public void exibirPratos() {
        for (Prato prato : cardapio) {
            System.out.println("Nome: " + prato.getNome());
            System.out.println("Ingredientes:");
            for (String ingrediente : prato.getIngredientes()) {
                System.out.println("- " + ingrediente);
            }
            System.out.println();
        }
    }

    public void excluirPrato(String nome) {
        for (Prato prato : cardapio) {
            if (prato.getNome().equalsIgnoreCase(nome)) {
                cardapio.remove(prato);
                break;
            }
        }
    }

    public static void main(String[] args) {
        GerenciadorCardapio gerenciador = new GerenciadorCardapio();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nOpções:");
            System.out.println("1. Adicionar prato");
            System.out.println("2. Exibir pratos cadastrados");
            System.out.println("3. Excluir prato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do prato: ");
                    String nome = scanner.next();
                    Prato prato = new Prato(nome);

                    do {
                        System.out.print("Digite o ingrediente do prato (ou digite '0' para parar): ");
                        String ingrediente = scanner.next();

                        if (ingrediente.equals("0")) {
                            break;
                        }

                        prato.adicionarIngrediente(ingrediente);
                    } while (true);

                    gerenciador.adicionarPrato(prato);
                    break;
                case 2:
                    gerenciador.exibirPratos();
                    break;
                case 3:
                    System.out.print("Digite o nome do prato para ser excluído: ");
                    String nomeExcluir = scanner.next();
                    gerenciador.excluirPrato(nomeExcluir);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (true);
    }
}