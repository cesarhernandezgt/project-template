package com.yourorganization.resources;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Example JAX-RS resource.
 * Remember to document your work ;).
 * Remember to delete this class once you got the general idea.
 */
@Path("/example")
public class ExampleResource {

    public ExampleResource() {
    }

    /**
     * By company code and service conventions:
     * Match the Path name with method name.
     * Always produces MediaType.APPLICATION_XML and MediaType.APPLICATION_JSON.
     * @return String
     */
    @Path("hi")
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String hi(){
        return "Hello World";
    }



}
