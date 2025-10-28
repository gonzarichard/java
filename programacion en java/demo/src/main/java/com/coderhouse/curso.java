package com.coderhouse;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "curso")

public class curso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "curso_alumno" ,
			joinColumns = @joinColumns(name = "curso_id"),
			inverseJoinColumns =@JoinColumn( name ="alumno_id")
			)
	private List<alumno> alumno = new ArrayList<>();
	public curso() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public curso(String nombre) {
		super();
		this.nombre = nombre;
	}


	public curso(long id, String nombre, List<com.coderhouse.alumno> alumno) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.alumno = alumno;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<alumno> getAlumno() {
		return alumno;
	}
	public void setAlumno(List<alumno> alumno) {
		this.alumno = alumno;
	}
	@Override
	public String toString() {
		return "curso [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
