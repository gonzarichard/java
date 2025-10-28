package com.coderhouse;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "alumno")
public class alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "apellido", nullable = false)
	private String apellido;
	
	@Column(name = "dni", nullable = false, unique = true)
	private int dni;
	@Column(name = "legajo", nullable = false, unique = true)
	private String legajo;
	
	@Column(name = edad)
	private int edad;
	
	@ManyToMany(mappedBy = "alumno" , fetch = FetchType.EAGER)
	private List<curso> curso = new ArrayList<>();
	
	private LocalDateTime createdat;

	public alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public alumno(String nombre, String apellido, int dni, String legajo, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.legajo = legajo;
		this.edad = edad;
	}



	public alumno(String nombre, String apellido, int dni, String legajo, int edad, LocalDateTime createdat) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.legajo = legajo;
		this.edad = edad;
		this.createdat = createdat;
	}



	public alumno(long id, String nombre, String apellido, int dni, String legajo, int edad,
			List<com.coderhouse.curso> curso, LocalDateTime createdat) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.legajo = legajo;
		this.edad = edad;
		this.curso = curso;
		this.createdat = createdat;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getLegajo() {
		return legajo;
	}

	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public List<curso> getCurso() {
		return curso;
	}

	public void setCurso(List<curso> curso) {
		this.curso = curso;
	}

	public LocalDateTime getCreatedat() {
		return createdat;
	}

	public void setCreatedat(LocalDateTime createdat) {
		this.createdat = createdat;
	}

	@Override
	public String toString() {
		return "alumno [id=" + id + ", dni=" + dni + ", edad=" + edad +" , createdat=" + createdat
				+ "]";
	}
	
	
	
}
