package com.example.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.Interfaces.AutorRepository;
import com.example.entities.Autor;
import com.example.entities.Libro;

@RestController
public class AutorController {
	
	
	@Autowired
	private AutorRepository autorRepository;
	
	@GetMapping("/autores")
	public List<Autor> listarAutores(){
		return autorRepository.findAll();	
	}
	

	@GetMapping("/autores/{id}/libros")
	public List<Libro> listaLibrosorAutor(@PathVariable("id") int idAutor){
		Optional<Autor> autorOptional = autorRepository.findById(idAutor);
		
		if(autorOptional.isPresent()) {
			Autor autor = autorOptional.get();
			return autor.getLibros();
		}else {
			throw new RuntimeException("Autor no Encontrado: "+ idAutor);
		}
		
	}



}
	
	

	


