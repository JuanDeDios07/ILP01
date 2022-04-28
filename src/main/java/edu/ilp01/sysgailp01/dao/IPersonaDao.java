package edu.ilp01.sysgailp01.dao;

import edu.ilp01.sysgailp01.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IPersonaDao extends JpaRepository<Persona,Long> {

    @Query("SELECT e FROM Persona e WHERE e.dni = ?1")
    Persona obtenerPersonaPorDni(String dni);
}
