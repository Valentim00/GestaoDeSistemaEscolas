package models;

public class Aluno {

    private String nomeAluno;
    private int idadeAluno;
    private String matriculaAluno;

    public Aluno(String nomeAluno, String matriculaAluno, int idadeAluno) {
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
        this.idadeAluno = idadeAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public int getIdadeAluno() {
        return idadeAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nomeAluno='" + nomeAluno + '\'' +
                ", idadeAluno=" + idadeAluno +
                ", matriculaAluno='" + matriculaAluno + '\'' +
                '}';
    }
}





