package main;

import java.util.List;
import java.util.ArrayList;

import java.time.LocalDate;
import dominio.Aluno;
import dominio.Professor;
import dominio.Sala;
import dominio.TurmaEadAssincrona;
import dominio.TurmaEadSincrona;
import dominio.TurmaPresencial;

public class Main {
    public static void main(String[] args) {

        // Pessoa pessoa = new Pessoa("João", 123, "joao@gmail");
        // System.out.println(pessoa);

        Aluno aluno1 = new Aluno("Luiza", "luiza@gmail", 1234, "eng software", LocalDate.of(2023, 10, 5));
        Aluno aluno2 = new Aluno("Laura", "laura@gmail", 5678, "eng software", LocalDate.of(2023, 10, 6));

        List<Aluno> alunosTurma = new ArrayList<>();

        Professor professor = new Professor("Maria", 7534, "maria@gmail", 5000.0, LocalDate.of(2020, 2, 3));

        Sala sala = new Sala(101, 2);

        TurmaPresencial turmaPresencial = new TurmaPresencial(1, "Matemática", alunosTurma, professor, sala);

        TurmaEadAssincrona turmaEadAssincrona = new TurmaEadAssincrona(2, "Cálculo", alunosTurma, professor, "www.com.br", args);

        TurmaEadSincrona turmaEadSincrona = new TurmaEadSincrona(3, "TI", alunosTurma, professor, "www.com.br", args);

        aluno1.matricularTurma(turmaPresencial);
        aluno2.matricularTurma(turmaPresencial);
        aluno1.matricularTurma(turmaEadSincrona);
        aluno2.matricularTurma(turmaEadSincrona);
        aluno1.matricularTurma(turmaEadAssincrona);
        aluno2.matricularTurma(turmaEadAssincrona);


        aluno1.imprimirTurmasMatriculadas();
        aluno2.imprimirTurmasMatriculadas();
    }
}
