package vip.yazilim.libs.springvip.template.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import vip.yazilim.libs.springvip.template.example.Person;
import vip.yazilim.libs.springvip.template.example.IPersonService;

import java.util.Optional;

@Slf4j
@Controller
@RequestMapping("/persons")
public class  PersonController {

    private final IPersonService personService;

    public PersonController(IPersonService personService) {
        this.personService = personService;
    }

    @GetMapping(value = "/")
    public String home(Model model) {
        model.addAttribute("personList", personService.getAll());
        return "list_person";
    }


    @GetMapping({"/create", "/edit/{personId}"})
    public String saveForm(Model model, @PathVariable(value = "personId", required = false) Integer personId) {

        if (personId != null) { // create operation
            Optional<Person> person = personService.getById(personId);
            model.addAttribute("person", person.orElseThrow(() -> new RuntimeException("Person not found :: " + personId)));
        } else {
            model.addAttribute("person", new Person());
        }
        return "frm_save_person";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Person person) {
        personService.save(person);
        return "redirect:/persons/";
    }

    @PostMapping("/delete/{personId}")
    public String delete(@PathVariable(value = "personId") Integer personId) {
        Object x = new ParameterizedTypeReference<String>() {

        };
        personService.deleteById(personId);
        return "redirect:/persons/";
    }
}