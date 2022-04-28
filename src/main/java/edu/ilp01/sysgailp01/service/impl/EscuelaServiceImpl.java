package edu.ilp01.sysgailp01.service.impl;

import edu.ilp01.sysgailp01.dao.IEscuelaDao;
import edu.ilp01.sysgailp01.entity.Escuela;
import edu.ilp01.sysgailp01.service.IEscuelaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EscuelaServiceImpl implements IEscuelaServiceImpl {
    //inyeccion de dependencia
    @Autowired
    private IEscuelaDao escuelaDao;

    @Override
    public List<Escuela> listarEscuelas() {

        return this.escuelaDao.findAll();
    }

    @Override
    public  Escuela obtenerEscuelaPorCodigo(String codigo){
        return  this.escuelaDao.findByCodigoEscuela(codigo);
    }
}
