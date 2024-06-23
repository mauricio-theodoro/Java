package com.gestao.festa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gestao.festa.model.Convidado;
import org.springframework.stereotype.Repository;

@Repository
public interface Convidados extends JpaRepository<Convidado, Long>{
}
