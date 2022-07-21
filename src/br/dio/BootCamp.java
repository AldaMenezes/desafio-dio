package br.dio;

import java.util.List;

public class BootCamp {

	 private String nome;
	    private List<Curso> cursos;

	    public void adicionarCurso(Curso curso) {
	        cursos.add(curso);
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public List<Curso> getCursos() {
	        return cursos;
	    }
}
