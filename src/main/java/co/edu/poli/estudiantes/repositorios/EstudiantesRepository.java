package co.edu.poli.estudiantes.repositorios;

import org.springframework.data.repository.CrudRepository;

import co.edu.poli.estudiantes.entidades.Estudiantes;

public interface EstudiantesRepository extends CrudRepository<Estudiantes, Long>{
	
}
