package edu.ilp01.sysgailp01.service;

import edu.ilp01.sysgailp01.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {

    //listar todas las escuelas
    List<Estudiante> listarEstudiante();

    //Obtener escuela por su codigo

    Estudiante obtenerEstudiantePorCodigo(String codigo);
}
