import java.util.ArrayList;
import java.util.List;

public class Prato {
    private String nome;
    private List<String> ingredientes;


    public Prato(String nome) {
        this.nome = nome;
        ingredientes = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void adicionarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void removerIngrediente(String ingrediente) {
        ingredientes.remove(ingrediente);
    }
}