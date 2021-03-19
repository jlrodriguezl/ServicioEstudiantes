package co.edu.poli.estudiantes.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.poli.estudiantes.dto.EstudiantesDTO;
import co.edu.poli.estudiantes.servicios.EstudiantesService;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class EstudiantesRestController {
	
	@Autowired
	private EstudiantesService service;
	
	@GetMapping("/estudiantes")
	public List<EstudiantesDTO> getEstudiantes(){
		return service.findAll();
	}
}
