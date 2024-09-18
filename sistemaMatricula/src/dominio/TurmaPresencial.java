package dominio;

import java.util.List;

public class TurmaPresencial extends Turma{
    
    private Sala sala;
    private int alunosMatriculados;

    public TurmaPresencial(int codTurma, String nomeDisciplina, List<Aluno> alunos, Professor professor, Sala sala) {
        super(codTurma, nomeDisciplina, alunos, professor);
        this.sala = sala;
    }

    public TurmaPresencial(int codTurma, String nomeDisciplina, List<Aluno> alunos, Professor professor, Sala sala, int alunosMatriculados) {
        super(codTurma, nomeDisciplina, alunos, professor);
        this.sala = sala;
        this.alunosMatriculados = alunosMatriculados;
    }

    public Sala getSala() {
        return sala;
    }

    public int getAlunosMatriculados(){
        return alunosMatriculados;
    }

    public void incrementarMatriculados(){
        this.alunosMatriculados++;
    }

    @Override
    public String toString() {
        return "TurmaPresencial [sala=" + sala + ", alunosMatriculados=" + alunosMatriculados + "]";
    }
}
