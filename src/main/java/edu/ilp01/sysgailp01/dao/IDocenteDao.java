package edu.ilp01.sysgailp01.dao;

import edu.ilp01.sysgailp01.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IDocenteDao extends JpaRepository<Docente,String> {

    @Query("SELECT e FROM Docente e WHERE e.CodDocente = ?1")
    Docente obtenerDocentePorCodigo(String codigo);
}
