package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ar.edu.unju.edm.model.Estudiante;

@Controller
public class EstudianteControlador {
	
	//get
	@GetMapping({"/","/index","/gustavo"})
	public ModelAndView cargarEstudiante() {
		Estudiante nuevoEstudiante = new Estudiante();
		
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("estudiante", nuevoEstudiante);
		
		return modelAndView;
	}
	
	//post
	@PostMapping("/guardarEstudiante")
	public ModelAndView guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudianteGuardar) {
		
		System.out.println(estudianteGuardar.getNombre());
		estudianteGuardar.setNombre("Sebastian");
		
		ModelAndView modelAndView = new ModelAndView("listaDeEstudiantes");
		modelAndView.addObject("estudiante", estudianteGuardar);
		
		return modelAndView;
	}

}
