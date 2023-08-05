package com.codellege.api.service;

import java.util.List;

public interface IAlumnoService <Alumno, Integer> {
    //4 verbos HTTP GET,POST,PUT & DELETE
    //GET
    List<Alumno> findAll();
    //POST
    Alumno save(Alumno alumno);
    //PUT
    Alumno save(Integer id, Alumno alumno);
    //DELETE
    void deleteById(java.lang.Integer id);
}
