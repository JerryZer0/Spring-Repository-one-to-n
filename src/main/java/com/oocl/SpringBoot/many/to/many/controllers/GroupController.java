package com.oocl.SpringBoot.many.to.many.controllers;

import com.oocl.SpringBoot.many.to.many.controllers.dto.GroupDTO;
import com.oocl.SpringBoot.many.to.many.entities.Group;
import com.oocl.SpringBoot.many.to.many.repositories.GroupRepository;
import com.oocl.SpringBoot.many.to.many.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v3/groups")
public class GroupController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    GroupRepository groupRepository;

    @Transactional
    @PostMapping(path = "",produces = MediaType.APPLICATION_JSON_VALUE)
    public void save(@RequestBody Group group){
        groupRepository.save(group);
    }

    @Transactional
    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Group findGroutById(@PathVariable int id){
        Group group = groupRepository.findById(id).get();
        return new GroupDTO(group);
    }

}
