package GerenciadordeCandidatos;

public class Candidato {
    private int NumeroMatricula;
    private  double nota;

    public Candidato(int NumeroMatricula, double nota) {
        this.NumeroMatricula = NumeroMatricula;
        this.nota = nota;
    }

    public  int getNumeroMatricula() {
        return NumeroMatricula;
    }
    public void setNumeroMatricula(int NumeroMatricula) {
        this.NumeroMatricula = NumeroMatricula;
    }
    public  double getNota() {
        return nota;
    }
    public  void setNota(double nota) {
        this.nota = nota;
    }

    }
