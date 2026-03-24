package com.frymce.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

    @GetMapping("/json")
    public Message sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Message("Bonjour, " + name + "!", "Systeme Spring");
    }

    public class Message {
        private String texte;
        private String auteur;

        public Message(String texte, String auteur) {
            this.texte = texte;
            this.auteur = auteur;
        }

        public String getTexte() {
            return texte;
        }

        public String getAuteur() {
            return auteur;
        }
    }
}
