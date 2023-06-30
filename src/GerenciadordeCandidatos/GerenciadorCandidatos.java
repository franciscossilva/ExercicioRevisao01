package GerenciadordeCandidatos;
import GerenciadordeProdutos.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class GerenciadorCandidatos {
    private List<Candidato> candidatos;
    public  GerenciadorCandidatos(){
        candidatos = new ArrayList<>();
    }
    public void AdicionarCandidato(Candidato candidato){
        candidatos.add(candidato);
    }
    public void ExibirCandidatos(){
        for (Candidato candidato : candidatos) {
            System.out.println(" Mat: " + candidato.getNumeroMatricula() + ",Nota: " + candidato.getNota());
        }
        }
    public void ExcluirCandidato(int NumeroMatricula){
        for (Candidato candidato: candidatos){
            if (candidato.getNumeroMatricula() == NumeroMatricula){
                candidatos.remove(candidato);
                break;
            }
        }
    }
public static void main( String[]args){
    GerenciadorCandidatos geranciador = new GerenciadorCandidatos();
    Scanner scanner = new Scanner(System.in);
    do {
        System.out.println("\nOpçoes:");
        System.out.println("1. Adicionar Candidato");
        System.out.println("2. Exibir Candidato Cadastrados");
        System.out.println("3. Excluir Candidato");
        System.out.println("0. Sair");
        System.out.println("Escolha a opção desejada: ");
        int opcao = scanner.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Digite o Numero de matricula do Candidato: ");
                int NumeroMatricula = scanner.nextInt();
                System.out.println("Digite a nota do canditado: ");
                double nota = scanner.nextDouble();
               geranciador.AdicionarCandidato(new Candidato(NumeroMatricula,nota));
                break;
            case 2:
                geranciador.ExibirCandidatos();
                break;
            case 3:
                System.out.println(" Digite o numero de matricula do candidato para excluir: ");
                int NumeroMatriculaExcluir = scanner.nextInt();
                geranciador.ExcluirCandidato(NumeroMatriculaExcluir);
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Opção nao valida");
                break;
        }
    }while (true);
    }
}
