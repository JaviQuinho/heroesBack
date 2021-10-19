package com.form.heroesBack.hero.controller;

import javax.websocket.server.PathParam;

import com.form.heroesBack.hero.entity.Hero;
import com.form.heroesBack.hero.repository.HeroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.extern.java.Log;

@Log
@RepositoryRestController
@RequestMapping("/heroes/custom")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class HeroController {
 
    @Autowired
    private HeroRepository heroRepository;

    @GetMapping(value = "/search/{id}")
    public @ResponseBody Hero getHeroUpperCase(@PathParam("id") long id) {
        log.info("Launching getHeroeUpperCase with ID: " + id);
        
        Hero hero = heroRepository.findById(id).orElse(null);

        // Retornamos sus campos en MAYUS.
        // El objetivo de este ejercicio es simular un servicio en el que debemos procesar su salida o incluso operar con otros repositorios.
        if(hero != null) {
            log.info("Wuou, " + hero.getHeroName() + " showed up!");
            hero.setFirstName(hero.getFirstName().toUpperCase());
            hero.setLastName(hero.getLastName().toUpperCase());
            hero.setHeroName(hero.getHeroName().toUpperCase());
            hero.setHeroPower(hero.getHeroPower().toUpperCase());
        } else {
            log.warning("This hero doesn't exist!");

        }
        return hero;
    }
}