package com.frymce.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.frymce.demo.model.Livre;
import com.frymce.demo.service.LivreService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("api/livres")
public class LivreController {

    @Autowired
    private LivreService livreService;

    //Pour lire tous les livres (GET)
    @GetMapping
    public List<Livre> getAll() {
        return livreService.listerToutLesLivres();
    }

    //Pour créer un livre (POST)
    @PostMapping
    public Livre createLivre(@RequestBody Livre livre) {
        return livreService.enregistrerLivre(livre);
    }

    //Pour modifier un livre (PUT)
    @PutMapping("/{id}")
    public Livre updateLivre(@PathVariable Long id, @RequestBody Livre livre) {
        return livreService.modifier(id, livre);
    }

    //Pour supprimer un livre (DELETE)
    @DeleteMapping("/{id}")
    public void deleteLivre(@PathVariable Long id) {
        livreService.supprimer(id);
    }

}
