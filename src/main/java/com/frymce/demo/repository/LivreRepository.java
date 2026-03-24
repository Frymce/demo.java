package com.frymce.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.frymce.demo.model.Livre;

@Repository
public interface LivreRepository extends JpaRepository<Livre, Long> {
    
}
