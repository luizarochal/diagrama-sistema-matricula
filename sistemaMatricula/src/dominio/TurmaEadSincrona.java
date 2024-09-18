package dominio;

import java.util.Arrays;
import java.util.List;

public class TurmaEadSincrona extends TurmaEad {
    
    private String horarios[];

    public TurmaEadSincrona(int codTurma, String nomeDisciplina, List<Aluno> alunos, Professor professor, String linkTeams, String horarios[]) {
        super(codTurma, nomeDisciplina, alunos, professor, linkTeams);
        this.horarios = horarios;
    }

    public String[] getHorarios() {
        return horarios;
    }

    @Override
    public String toString() {
        return "TurmaEadSincrona [horarios=" + Arrays.toString(horarios) + "]";
    }
}
