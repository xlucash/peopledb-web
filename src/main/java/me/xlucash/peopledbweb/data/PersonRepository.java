package me.xlucash.peopledbweb.data;

import me.xlucash.peopledbweb.biz.model.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface PersonRepository extends PagingAndSortingRepository<Person, Long>, CrudRepository<Person, Long> {

    @Query(nativeQuery = true, value = "select photo_filename from person where id in :ids")
    public Set<String> findFilenamesByIds(@Param("ids") Iterable<Long> ids);
}
