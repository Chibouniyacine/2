package com.memoire.demo.Object;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/objects")
public class ObjectController {

    private ObjectService objectService;

    @Autowired
    public ObjectController(ObjectService objectService){
        this.objectService = objectService;
    }
    @GetMapping
    public List<Object> getObjects(){
        return objectService.getObjects();
    }

    @PostMapping
    public void addObject(@RequestBody Object x){
        objectService.addObject(x);
    }

    @DeleteMapping(path = "/delete/{objectId}")
    public void deleteObject (@PathVariable("objectId") Integer objectId){
        objectService.deleteObject(objectId);
    }

    @GetMapping(path = "/add/{objectId}")
    public void saveObject(){
        objectService.addObject(new Object("book"));
    }

}