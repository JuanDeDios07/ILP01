package edu.ilp01.sysgailp01.dao;

import edu.ilp01.sysgailp01.entity.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEscuelaDao extends JpaRepository<Escuela,Long> {

    Escuela findByCodigoEscuela(String codigo);
}
