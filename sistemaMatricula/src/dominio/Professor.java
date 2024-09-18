package dominio;

import java.time.LocalDate;

public class Professor extends Pessoa{

    private Double salario;
    private LocalDate dataAdmissao;
    private LocalDate dataDemissao;

    
    public Professor(String nome, int matricula, String email, Double salario, LocalDate dataAdmissao) {
        super(nome, matricula, email);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    public Professor(String nome, int matricula, String email, Double salario, LocalDate dataAdmissao,
            LocalDate dataDemissao) {
        super(nome, matricula, email);
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
        this.dataDemissao = dataDemissao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getDataDemissao() {
        return dataDemissao;
    }

    public void setDataDemissao(LocalDate dataDemissao) {
        this.dataDemissao = dataDemissao;
    }

    @Override
    public String toString() {
        return "Professor [salario=" + salario + ", dataAdmissao=" + dataAdmissao + ", dataDemissao=" + dataDemissao
                + "]";
    }
}
