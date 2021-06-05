package co.com.sofka.crud.repository;

import co.com.sofka.crud.entities.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {

    @Query(value = queryAll)

}
