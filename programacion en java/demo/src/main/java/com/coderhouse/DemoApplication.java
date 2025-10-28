package com.coderhouse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.coderhouse.dao.daofactory;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{

	@Autowired
	private daofactory dao;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		
		try {
			
			curso curso1 =new curso ("SQL");
			curso curso2 =new curso ("JAVA");
			curso curso3 =new curso ("ANGULAR");
			curso curso4 =new curso ("REACT");
			curso curso5 =new curso ("DESARROLLO WEB");
			
			alumno alumno1 = new alumno("Jorge","marquez", 45085372,"L45085372",50);
			alumno alumno2 = new alumno("gonzalo","richard",23467231,"L23467231", 24);
			alumno alumno3 = new alumno ("marcos","riquelme",14584046,"L14584046",32);
			alumno alumno4 = new alumno("jose","ramirez",35167234,"L35167234",32);
			alumno alumno5 = new alumno("oscar","gonzalez", 35675231,"L35675231",23);
			
		dao.persistiralumno(alumno1);
		dao.persistiralumno(alumno2);
		dao.persistiralumno(alumno3);
		dao.persistiralumno(alumno4);
		dao.persistiralumno(alumno5);
		
		dao.persistercurso(curso1);
		dao.persistercurso(curso2);
		dao.persistercurso(curso3);
		dao.persistercurso(curso4);
		dao.persistercurso(curso5);
		
			
			
		} catch(Exception err) {
			err.getMessage();
		}
		
	}
	
}
