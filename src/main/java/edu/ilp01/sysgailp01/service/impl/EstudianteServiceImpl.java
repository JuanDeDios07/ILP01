package edu.ilp01.sysgailp01.service.impl;

import edu.ilp01.sysgailp01.dao.IEstudianteDao;
import edu.ilp01.sysgailp01.entity.Estudiante;
import edu.ilp01.sysgailp01.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

    //inyeccion de dependencia
    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public List<Estudiante> listarEstudiante() {
        return this.estudianteDao.findAll();
    }

    @Override
    public  Estudiante obtenerEstudiantePorCodigo(String codigo){
        return  this.estudianteDao.obtenerEstudiantePorCodigos(codigo);
    }
}
