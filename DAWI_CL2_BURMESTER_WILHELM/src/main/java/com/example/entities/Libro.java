package com.example.entities;
import java.time.LocalDateTime;

import jakarta.persistence.*;



@Entity
@Table(name = "tb_libros")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_libro")
	private int idLibro;
	
	@Column (name = "tit_libro")
	private String titulo_libro;
	
	
	@Column (name = "fch_public")
	private LocalDateTime fecha_libro;
	
	@Column (name = "genero_libro")
	private int genero_libro;
	
	@Column (name = "autor_libro")
	private int autor_libro;

	
	
	
	
	
	
	
	
	

	// getter and setters

	
	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getTitulo_libro() {
		return titulo_libro;
	}

	public void setTitulo_libro(String titulo_libro) {
		this.titulo_libro = titulo_libro;
	}

	public LocalDateTime getFecha_libro() {
		return fecha_libro;
	}

	public void setFecha_libro(LocalDateTime fecha_libro) {
		this.fecha_libro = fecha_libro;
	}

	public int getGenero_libro() {
		return genero_libro;
	}

	public void setGenero_libro(int genero_libro) {
		this.genero_libro = genero_libro;
	}

	public int getAutor_libro() {
		return autor_libro;
	}

	public void setAutor_libro(int autor_libro) {
		this.autor_libro = autor_libro;
	}

	
	
	
	
	
	
	
}
