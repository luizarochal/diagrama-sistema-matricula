package dominio;

import java.util.List;

public class TurmaEadAssincrona extends TurmaEad {
    
    private String linkVideoAulas[];

    public TurmaEadAssincrona(int codTurma, String nomeDisciplina, List<Aluno> alunos, Professor professor, String linkTeams, String linkVideoAulas[]) {
        super(codTurma, nomeDisciplina, alunos, professor, linkTeams);
        this.linkVideoAulas = linkVideoAulas;
    }

    public String[] getLinkVideoAulas() {
        return linkVideoAulas;
    }

    public void setLinkVideoAulas(String linkVideoAulas[]){
        this.linkVideoAulas = linkVideoAulas;
    }
}
