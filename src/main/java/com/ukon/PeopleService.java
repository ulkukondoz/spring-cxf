package com.ukon;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: ukondoz
 * Date: 03/12/2013
 * Time: 14:38
 * To change this template use File | Settings | File Templates.
 */

@Service
public class PeopleService {

    public Collection< Person > getPeople( int page, int pageSize ) {
        Collection<Person> persons = new ArrayList<Person>( pageSize );

        for( int index = 0; index < pageSize; ++index ) {
            persons.add( new Person( String.format( "person+%d@at.com", ( pageSize * ( page - 1 ) + index + 1 ) ) ) );
        }

        return persons;
    }

    public Person addPerson( String email ) {
        return new Person( email );
    }
}

