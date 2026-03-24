package com.frymce.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frymce.demo.model.Livre;
import com.frymce.demo.repository.LivreRepository;

@Service
public class LivreService {

    @Autowired
    private LivreRepository livreRepository;

    public Livre enregistrerLivre(Livre livre) {
        return livreRepository.save(livre);
    }
    public List<Livre> listerToutLesLivres() {
        return livreRepository.findAll();
    }
    public void supprimer(Long id){
        livreRepository.deleteById(id);
    }
}
