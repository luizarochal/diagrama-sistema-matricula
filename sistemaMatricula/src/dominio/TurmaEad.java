package dominio;

import java.util.List;

public class TurmaEad extends Turma {

    private String linkTeams;

    public TurmaEad(int codTurma, String nomeDisciplina, List<Aluno> alunos, Professor professor, String linkTeams) {
        super(codTurma, nomeDisciplina, alunos, professor);
        this.linkTeams = linkTeams;
    }

    public String getLinkTeams() {
        return linkTeams;
    }

    public void setLinkTeams(String linkTeams){
        this.linkTeams = linkTeams;
    }
}
