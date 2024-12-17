package br.com.wrtecnologia;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from Quarkus REST";
    }
}

// mvn quarkus:list-extensions

// mvn quarkus:add-extensions -Dextensions="quarkus-hibernate-orm-panache"
// mvn quarkus:add-extensions -Dextensions="quarkus-jdbc-postgresql"




