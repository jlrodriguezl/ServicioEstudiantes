package co.edu.poli.estudiantes.servicios;

import java.util.List;

import co.edu.poli.estudiantes.dto.EstudiantesDTO;

public interface EstudiantesService {
	public List<EstudiantesDTO> findAll();
}
