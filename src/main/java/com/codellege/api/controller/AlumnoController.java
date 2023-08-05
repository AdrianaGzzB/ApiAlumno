package com.codellege.api.controller;

import com.codellege.api.model.Alumno;
import com.codellege.api.service.AlumnoServiceImpl;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/alumnos")
public class AlumnoController {
    @Autowired
    private AlumnoServiceImpl serviciosREST;
    @GetMapping
    public List<Alumno> listarTodo(){
        return serviciosREST.findAll();
    }
    @PostMapping
    public Alumno crear(@RequestBody Alumno alumno){
        return serviciosREST.save(alumno);
    }
    @PutMapping("{id}")
    public Alumno actualizar(@RequestBody Alumno alumno, @PathVariable Integer id){
        alumno.setId(id);
        return serviciosREST.save(alumno);
    }
    @DeleteMapping("{id}")
    public void eliminar(@PathVariable Integer id){
        serviciosREST.deleteById(id);
    }
}
