package br.dio;

import java.time.LocalDateTime;

public class Aula {
	
	private Integer ordem;
    private String conteudo;
    private LocalDateTime horaRealizacao;

    public Aula(Integer ordem, String conteudo, LocalDateTime horaRealizacao) {
        this.ordem = ordem;
        this.conteudo = conteudo;
        this.horaRealizacao = horaRealizacao;
    }

    public Aula() {
    }

    public Integer getOrdem() {
        return ordem;
    }

    public String getConteudo() {
        return conteudo;
    }

    public LocalDateTime getHoraRealizacao() {
        return horaRealizacao;
    }

}
