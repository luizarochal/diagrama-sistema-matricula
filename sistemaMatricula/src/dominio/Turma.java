package dominio;

import java.util.List;

public class Turma {

    private int codTurma;
    private String nomeDisciplina;
    private List<Aluno> alunos;
    private Professor professor;

    public Turma(int codTurma, String nomeDisciplina, List<Aluno> alunos, Professor professor) {
        this.codTurma = codTurma;
        this.nomeDisciplina = nomeDisciplina;
        this.alunos = alunos;
        this.professor = professor;
    }

    public int getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(int codTurma) {
        this.codTurma = codTurma;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        return "Turma [codTurma=" + codTurma + ", nomeDisciplina=" + nomeDisciplina + ", alunos=" + alunos
                + ", professor=" + professor + "]";
    }
}
