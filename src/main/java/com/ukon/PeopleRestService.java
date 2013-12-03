package com.ukon;

import org.apache.catalina.deploy.Injectable;

import javax.inject.Inject;
import javax.ws.rs.*;
import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 * User: ukondoz
 * Date: 03/12/2013
 * Time: 14:55
 * To change this template use File | Settings | File Templates.
 */
@Path("/people")
public class PeopleRestService {
    @Inject
    private PeopleService peopleService;

    @Produces( { "application/json" } )
    @GET
    public Collection< Person > getPeople( @QueryParam( "page") @DefaultValue( "1" ) final int page ) {
        return peopleService.getPeople( page, 5 );
    }

    @Produces( { "application/json" } )
    @PUT
    public Person addPerson( @FormParam( "email" ) final String email ) {
        return peopleService.addPerson( email );
    }


}
