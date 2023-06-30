import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigoISO;
    private String nome;
    private double populacao;
    private double dimensao;
    private List<Pais> fronteiras;

    public Pais(String codigoISO, String nome, double populacao, double dimensao) {
        this.codigoISO = codigoISO;
        this.nome = nome;
        this.populacao = populacao;
        this.dimensao = dimensao;
        this.fronteiras = new ArrayList<>();
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public List<Pais> getFronteiras() {
        return fronteiras;
    }

    public void setFronteiras(List<Pais> fronteiras) {
        this.fronteiras = fronteiras;
    }

    public boolean Vizinho(Pais outroPais) {
        return fronteiras.contains(outroPais);
    }

    public double calcularDensidadePopulacional() {
        return populacao / dimensao;
    }
}