package main;

import java.time.LocalDate;
import dominio.Aluno;
import dominio.Pessoa;
import dominio.Professor;
import dominio.Turma;

public class App {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("João", 123, "joao@gmail");
        System.out.println(pessoa);

        Aluno aluno1 = new Aluno("Luiza", "luiza@gmail", 1234, "eng software", LocalDate.of(2023, 10, 5));
        Aluno aluno2 = new Aluno("Laura", "laura@gmail", 5678, "eng software", LocalDate.of(2023, 10, 6));
        System.out.println(aluno1);
        System.out.println(aluno2);

        Aluno[] aluno = {aluno1, aluno2};

        Professor professor = new Professor("Maria", 7534, "maria@gmail", 5000.0, LocalDate.of(2020, 2, 3));

        Turma turma = new Turma(1, "PM", null, professor);
        System.out.println(turma);
    }
}
