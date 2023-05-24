package com.example.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import com.example.Interfaces.LibroRepository;
import com.example.entities.Libro;


@Controller
public class LibrosController {

	@Autowired
	private LibroRepository libroRepository;
	
	
	
	@GetMapping("/libros")
	public List<Libro> listarLibros(){
		return libroRepository.findAll();
		
	}
	
}
