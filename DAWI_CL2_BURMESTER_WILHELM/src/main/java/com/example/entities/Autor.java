package com.example.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_autor")
public class Autor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "id_autor")
	private int idAutor;
	
	@Column (name = "nombre")
	private String nombre;
	
	@Column (name = "Pais")
	private String pais;
	
	@OneToMany(mappedBy = "autor",cascade = CascadeType.ALL)
	private List<Libro> libros;
	
	
	//get and set
	
	
	public int getIdAutor() {
		return idAutor;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	



}
