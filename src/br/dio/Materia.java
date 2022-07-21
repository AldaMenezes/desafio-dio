package br.dio;

import java.time.LocalDateTime;
import java.util.List;

public class Materia {

    private String titulo;
    private String descricao;
    private LocalDateTime dataRealizacao;
    private List<Aula> aulas;

    public void adicionarAulas(Aula aula){
        aulas.add(aula);
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataRealizacao() {
        return dataRealizacao;
    }

    public void setDataRealizacao(LocalDateTime dataRealizacao) {
        this.dataRealizacao = dataRealizacao;
    }

}
