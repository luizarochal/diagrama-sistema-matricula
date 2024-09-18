package dominio;

import java.time.LocalDate;
import java.util.List;

public class Aluno extends Pessoa{

    private String curso;
    private LocalDate dataMatricula;
    private LocalDate dataFormatura;
    private List<Turma> turmasMatriculadas;

    public Aluno(String nome, String email, int matricula, String curso, LocalDate dataMatricula){
        super(nome, matricula, email);
        this.curso = curso;
        this.dataMatricula = dataMatricula;
    }

    public Aluno(String nome, int matricula, String email, String curso, LocalDate dataMatricula, LocalDate dataFormatura) {
        super(nome, matricula, email);
        this.curso = curso;
        this.dataMatricula = dataMatricula;
        this.dataFormatura = dataFormatura;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public LocalDate getDataFormatura() {
        return dataFormatura;
    }

    public void setDataFormatura(LocalDate dataFormatura) {
        this.dataFormatura = dataFormatura;
    }

    public boolean matricularTurma(Turma turma) {
        if (turma instanceof TurmaPresencial) {
            TurmaPresencial turmaPresencial = (TurmaPresencial) turma;
            if (turmaPresencial.getSala().getCapacidade() > turmaPresencial.getAlunosMatriculados()) {
                turmasMatriculadas.add(turma);
                turmaPresencial.incrementarMatriculados();
                return true;
            } else {
                System.out.println("Capacidade da turma presencial excedida.");
                return false;
            }
        } else {
            turmasMatriculadas.add(turma);
            return true;
        }
    }

    public void imprimirTurmasMatriculadas() {
        System.out.println("Turmas matriculadas para o aluno " + getNome() + ":");
        for (Turma turma : turmasMatriculadas) {
            System.out.println("Código da turma: " + turma.getCodTurma());
        }
    }

    @Override
    public String toString() {
        return "Aluno [curso=" + curso + ", dataMatricula=" + dataMatricula + ", dataFormatura=" + dataFormatura
                + ", turmasMatriculadas=" + turmasMatriculadas + "]";
    }

    
}
