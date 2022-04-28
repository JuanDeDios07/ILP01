package edu.ilp01.sysgailp01.service.impl;

import edu.ilp01.sysgailp01.dao.IDocenteDao;
import edu.ilp01.sysgailp01.entity.Docente;
import edu.ilp01.sysgailp01.service.IDocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DocenteSreviceImpl implements IDocenteService {
    //inyeccion de dependencia
    @Autowired
    private IDocenteDao docenteDao;

    @Override
    public List<Docente> listarDocente() {
        return this.docenteDao.findAll();
    }
}
