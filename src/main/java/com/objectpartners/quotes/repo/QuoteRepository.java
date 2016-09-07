package com.objectpartners.quotes.repo;

import com.objectpartners.quotes.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by mikeh on 9/1/16.
 */
@RepositoryRestResource(excerptProjection = QuoteProjection.class)
public interface QuoteRepository extends JpaRepository<Quote, Long> {
}
