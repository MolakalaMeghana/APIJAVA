
package com.example.demo2.API;
import java.util.*;
import com.example.demo2.model.person;
import com.example.demo2.service.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class personController {
    @Autowired
    //private final personService personService;


    public personController(personService personService)
    {
        //this.personService=personService;
    }

    //ADD new person
    @PostMapping("/person")
    public void addperson(@RequestBody person person) {
              this.addperson(person);
    }
    //GET all persons
    @GetMapping("/persons")
    public List<person> getAllperson()
    {
       return getAllperson();
    }

    //GET person by id
    @GetMapping("/person/{id}")
    public person getperson(@PathVariable("id") int id)
    {
        return getperson(id);
    }

    
    @DeleteMapping("/Person/{id}")
    public void deleteperson(@PathVariable("id") int id)
    {
        this.deleteperson(id);
    }

    
    @PutMapping("/person/{id}")
    public person updateperson(@RequestBody person person,@PathVariable("id") int id)
    {
         this.updateperson(person,id);
         return person;
    }
}









