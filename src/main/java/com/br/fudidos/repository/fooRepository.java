package com.br.fudidos.repository;

import com.br.fudidos.model.Foo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pvmeira on 04/11/2017.
 */
@Repository
public interface fooRepository extends CrudRepository<Foo,Long>{
}
