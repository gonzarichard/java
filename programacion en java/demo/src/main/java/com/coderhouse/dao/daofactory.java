package com.coderhouse.dao;

import org.springframework.stereotype.Service;

import com.coderhouse.alumno;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class daofactory {
	
	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public void persistiralumno(alumno alumno) {
		em.persist(alumno);
	}
	@Transactional
	public void persistercurso(curso curso) {
		em.persist(curso);
	}

}
