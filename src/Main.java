import java.time.LocalDateTime;

import br.dio.Aula;
import br.dio.Curso;
import br.dio.Materia;

public class Main {

	public static void main(String[] args) {
		Aula primeiraAula = new Aula(1, "apresentação da professora de merda", LocalDateTime.now());

		Materia primeiraMateria = new Materia();
		primeiraMateria.setDescricao("materia básica iniciantes");
		primeiraMateria.setTitulo("Lógica de programação");

		Curso primeiro = new Curso();
		primeiro.setDescricao("descrição básica iniciantes");
		primeiro.setTitulo("dominando o java");
		primeiro.setCargaHoraria(60);
	}

}
