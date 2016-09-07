package com.objectpartners.quotes.repo;

import com.objectpartners.quotes.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by mikeh on 9/1/16.
 */
@RepositoryRestResource
public interface AuthorRepository extends CrudRepository<Author,Long> {

}
