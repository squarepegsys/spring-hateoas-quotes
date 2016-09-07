package com.objectpartners.quotes.repo;

import com.objectpartners.quotes.entity.Quote;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

/**
 * Created by mikeh on 9/1/16.
 */
@Projection(name = "AuthorNames", types = {Quote.class})
public interface QuoteProjection {

    @Value("#{target.author.firstName} #{target.author.lastName}")
    public String getAuthorName();

    @Value("#{target.text}")
    public String getText();

}
