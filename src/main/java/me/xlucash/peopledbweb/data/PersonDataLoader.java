package me.xlucash.peopledbweb.data;

import me.xlucash.peopledbweb.biz.model.Person;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

//@Component
public class PersonDataLoader implements ApplicationRunner {
    private PersonRepository personRepository;

    public PersonDataLoader(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (personRepository.count() == 0) {
            List<Person> people = List.of(
//                    new Person(null, "Peter", "Snake", LocalDate.of(1980, 6, 13),"dummy@sample.com", new BigDecimal("50000")),
//                    new Person(null, "Jennifer", "Smith", LocalDate.of(1960, 10, 11), "dummy@sample.com", new BigDecimal("45000")),
//                    new Person(null, "Mark", "Jackson", LocalDate.of(1971, 3, 21), "dummy@sample.com", new BigDecimal("75000")),
//                    new Person(null, "Vishnu", "Smith", LocalDate.of(1971, 3, 21), "dummy@sample.com", new BigDecimal("75000")),
//                    new Person(null, "Alice", "Johnson", LocalDate.of(1971, 3, 21), "dummy@sample.com", new BigDecimal("75000")),
//                    new Person(null, "Akira", "Kim", LocalDate.of(1983, 6, 6), "dummy@sample.com", new BigDecimal("100000"))
            );
            personRepository.saveAll(people);
        }
    }
}
