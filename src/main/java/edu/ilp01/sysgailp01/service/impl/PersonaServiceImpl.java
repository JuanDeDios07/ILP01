package edu.ilp01.sysgailp01.service.impl;

import edu.ilp01.sysgailp01.dao.IPersonaDao;
import edu.ilp01.sysgailp01.entity.Persona;
import edu.ilp01.sysgailp01.service.IPersonaSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements IPersonaSrevice {
    //inyeccion de dependencia
    @Autowired
    private IPersonaDao personaDao;

    @Override
    public List<Persona> listarPersona() {
        return this.personaDao.findAll();
    }

    @Override
    public  Persona obtenerPersonaPorDni(String dni){
        return  this.personaDao.obtenerPersonaPorDni(dni);
    }
}
