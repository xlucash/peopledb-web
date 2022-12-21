package me.xlucash.peopledbweb.web.controller;

import me.xlucash.peopledbweb.biz.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @GetMapping
    public String getPeople(Model model) {
        List<Person> people = List.of(
                new Person(10L, "Jake", "Snake", LocalDate.of(1980, 6, 13), new BigDecimal("50000")),
                new Person(20L, "Sarah", "Smith", LocalDate.of(1960, 10, 11), new BigDecimal("45000")),
                new Person(30L, "Johny", "Jackson", LocalDate.of(1971, 3, 21), new BigDecimal("75000")),
                new Person(30L, "Jerry", "Smith", LocalDate.of(1971, 3, 21), new BigDecimal("75000")),
                new Person(30L, "Jane", "Johnson", LocalDate.of(1971, 3, 21), new BigDecimal("75000")),
                new Person(40L, "Bobby", "Kim", LocalDate.of(1983, 6, 6), new BigDecimal("100000"))
        );
        model.addAttribute("people", people);
        return "people";
    }
}
