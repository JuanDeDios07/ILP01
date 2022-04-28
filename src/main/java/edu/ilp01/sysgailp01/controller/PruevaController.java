package edu.ilp01.sysgailp01.controller;

import edu.ilp01.sysgailp01.entity.Docente;
import edu.ilp01.sysgailp01.entity.Escuela;
import edu.ilp01.sysgailp01.entity.Estudiante;
import edu.ilp01.sysgailp01.entity.Persona;
import edu.ilp01.sysgailp01.service.IDocenteService;
import edu.ilp01.sysgailp01.service.IEscuelaServiceImpl;
import edu.ilp01.sysgailp01.service.IEstudianteService;
import edu.ilp01.sysgailp01.service.IPersonaSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("login")
public class PruevaController {


    //LISTAR ESCUELA
    @Autowired
    private IEscuelaServiceImpl escuelaService;
    // LISTA DE LA BASE DE DATOS
    @GetMapping("/listaEscuelas")
    public List<Escuela> listaEscuelas(){

        return this.escuelaService.listarEscuelas();
    }

    //LISTAR PERSONA
    @Autowired
    private IPersonaSrevice personaService;
    // LISTA DE LA BASE DE DATOS
    @GetMapping("/listaPersona")
    public List<Persona> listaPersona() {
        return  this.personaService.listarPersona();

    }

    //LISTAR ESTUDIANTE
    @Autowired
    private IEstudianteService estudianteService;
    // LISTA DE LA BASE DE DATOS
    @GetMapping("/listaEstudiante")
    public List<Estudiante> listaEstudiante() {
        return this.estudianteService.listarEstudiante();
    }

    //LISTAR DOCENTE
    @Autowired
    private IDocenteService docenteService;
    // LISTA DE LA BASE DE DATOS
    @GetMapping("/listaDocente")
    public List<Docente> listaDocente(){

        return this.docenteService.listarDocente();
    }

    // METODO DE BUSCAR ESCUELA
    @GetMapping("/buscarEscuelaByCodigo")
    public Escuela buscarpERSONAByCodigo(@RequestParam String codigo){
        return this.escuelaService.obtenerEscuelaPorCodigo(codigo);

    }

    // METODO DE BUSCAR PERSONA
    @GetMapping("/buscarPersonaByDni")
    public Persona buscarPersonaByDni(@RequestParam String dni){
        return this.personaService.obtenerPersonaPorDni(dni);

    }

    // METODO DE BUSCAR ESTUDIANTE
    @GetMapping("/buscarEstudianteByCodigo")
    public Estudiante buscarEstudianteByCodigo(@RequestParam String codigo){
        return this.estudianteService.obtenerEstudiantePorCodigo(codigo);

    }
}
