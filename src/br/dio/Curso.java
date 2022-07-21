package br.dio;

import java.util.List;

public class Curso {

    private String titulo;
    private String descricao;
    private Integer cargaHoraria;
    private List<Materia> materias;

    public void adicionarMaterias(Materia materia){
        materias.add(materia);
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer calcularXp() {
        return null;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
