package com.codellege.api.repository;

import com.codellege.api.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlumnoRepo extends JpaRepository<Alumno, Integer> {
}
