package edu.ilp01.sysgailp01.service;

import edu.ilp01.sysgailp01.entity.Persona;

import java.util.List;

public interface IPersonaSrevice {

    //listar todas las persona
    List<Persona> listarPersona();

    //Obtener escuela por su codigo

    Persona obtenerPersonaPorDni(String dni);
}
