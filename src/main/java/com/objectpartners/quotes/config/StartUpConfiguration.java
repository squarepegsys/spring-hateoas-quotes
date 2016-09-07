package com.objectpartners.quotes.config;

import com.objectpartners.quotes.entity.Author;
import com.objectpartners.quotes.entity.Quote;
import com.objectpartners.quotes.repo.AuthorRepository;
import com.objectpartners.quotes.repo.QuoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mikeh on 9/1/16.
 */
@Configuration
public class StartUpConfiguration {

    @Autowired
    private QuoteRepository quoteRepository;

    @Autowired
    private  AuthorRepository authorRepository;

    @Bean
    public Object populateDB(){


        List<String> authorStrings =  (List<String>)Arrays.asList("Richard Stallman", "Billy Korando","Jamie Zawinski");

        List<Author> authors = new ArrayList<Author>();
        for (String author:authorStrings) {
            Author x = new Author();
            String[] parts = author.split(" ");
            x.setFirstName(parts[0]);
            x.setLastName(parts[1]);

            authors.add(x);

        }

        authorRepository.save(authors);

        List<String> quoteStrings =  (List<String>)Arrays.asList("Join Us Now And Share The Software",
                "Don’t Hate The HATEOAS",
                "Some people, when confronted with a problem, think \n" +
                        "“I know, I'll use regular expressions.”   Now they have two problems.");


        List<Quote> quotes  = new ArrayList<>();

        int counter=0;
        for (String quote :                quoteStrings) {


            Quote q = new Quote();
            q.setText(quote);
            q.setAuthor(authors.get(counter));
            quotes.add(q);
            counter++;
        }

        quoteRepository.save(quotes);
        return quotes;

    }
}
