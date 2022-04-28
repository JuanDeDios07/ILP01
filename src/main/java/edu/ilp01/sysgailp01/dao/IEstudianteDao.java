package edu.ilp01.sysgailp01.dao;

import edu.ilp01.sysgailp01.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IEstudianteDao extends JpaRepository<Estudiante,String> {

    //Estudiante findByCodigoEstudiante(String codigo);

    @Query("SELECT e FROM Estudiante e WHERE e.codigo = ?1")
    Estudiante obtenerEstudiantePorCodigos(String codigo);
}
