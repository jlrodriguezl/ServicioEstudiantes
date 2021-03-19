package co.edu.poli.estudiantes.servicios.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.poli.estudiantes.dto.EstudiantesDTO;
import co.edu.poli.estudiantes.entidades.Estudiantes;
import co.edu.poli.estudiantes.repositorios.EstudiantesRepository;
import co.edu.poli.estudiantes.servicios.EstudiantesService;

@Service
public class EstudiantesServiceImpl implements EstudiantesService {
	
	@Autowired
	private EstudiantesRepository repo;
	
	@Override
	public List<EstudiantesDTO> findAll() {
		List<EstudiantesDTO> lstEstudiantes = new ArrayList<EstudiantesDTO>();
		EstudiantesDTO e;
		List<Estudiantes> lstTemp = (List<Estudiantes>)repo.findAll();
		
		for(Estudiantes es : lstTemp) {
			e = new EstudiantesDTO();
			e.setIdentificacion(es.getIdentificacion());
			e.setApellidos(es.getApellidos());
			e.setNombres(es.getNombres());
			e.setCorreo(es.getCorreo());
			
			lstEstudiantes.add(e);
		}
		
		return lstEstudiantes;
	}

}
