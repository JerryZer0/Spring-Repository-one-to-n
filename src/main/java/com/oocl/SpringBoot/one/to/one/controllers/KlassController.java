package com.oocl.SpringBoot.one.to.one.controllers;

import com.oocl.SpringBoot.one.to.one.controllers.dto.KlassDTO;
import com.oocl.SpringBoot.one.to.one.controllers.dto.LeaderDTO;
import com.oocl.SpringBoot.one.to.one.entities.Klass;
import com.oocl.SpringBoot.one.to.one.entities.Leader;
import com.oocl.SpringBoot.one.to.one.repositories.KlassRepository;
import com.oocl.SpringBoot.one.to.one.repositories.LeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v2")
public class KlassController {

    @Autowired
    LeaderRepository leaderRepository;

    @Autowired
    KlassRepository klassRepository;

    @Autowired
    public KlassController(KlassRepository klassRepository){
        this.klassRepository=klassRepository;
    }

    @Transactional
    @PostMapping(path = "/klasses", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addKlass(@RequestBody Klass klass) {
        System.err.println(klass.getId());
        klassRepository.save(klass);
    }

    @Transactional
    @GetMapping(path = "/klasses/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public KlassDTO showKlasses(@PathVariable int id){
        Klass klass = klassRepository.findById(id).get();
        return new KlassDTO(klass);
    }

    @Transactional
    @PutMapping("/klasses/{id}")
    public void update(@RequestBody Klass klass) {
        klassRepository.save(klass);
    }

    @Transactional
    @DeleteMapping("/klasses/{id}")
    public void delete(@PathVariable int id) {
        Klass klass = klassRepository.findById(id).get();
        klassRepository.delete(klass);
    }

}
