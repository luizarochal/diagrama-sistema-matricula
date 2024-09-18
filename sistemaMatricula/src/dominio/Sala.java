package dominio;

import java.util.List;

public class Sala {
    
    private int numeroSala;
    private int capacidade;
    private List<TurmaPresencial> turmasPresenciais;

    public Sala(int numeroSala, int capacidade, List<TurmaPresencial> turmasPresenciais) {
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;
        this.turmasPresenciais = turmasPresenciais;
    }

    public int getCapacidade() {
        return capacidade;
    }

}
