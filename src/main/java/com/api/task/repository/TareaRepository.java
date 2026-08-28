package com.api.task.repository;

import com.api.task.enums.Estado;
import com.api.task.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {

    List<Tarea> findByUsuarioId(Long usuarioId);

    List<Tarea> findByUsuarioIdAndEstado(Long usuarioId, Estado estado);
}
