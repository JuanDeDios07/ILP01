package edu.ilp01.sysgailp01.service;

import edu.ilp01.sysgailp01.entity.Escuela;

import java.util.List;

public interface IEscuelaServiceImpl {

    //listar todas las escuelas
    List<Escuela> listarEscuelas();

    //Obtener escuela por su codigo

    Escuela obtenerEscuelaPorCodigo(String codigo);
}
