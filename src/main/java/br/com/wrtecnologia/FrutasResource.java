package br.com.wrtecnologia;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/frutas")
public class FrutasResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Fruta> list() {
        return Fruta.listAll();
    }

    @POST
    //@Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public void newFruta() {
        Fruta fruta = new Fruta();
        fruta.nome = "Ameixa";
        fruta.qtd = 18;
        fruta.persist();
    }
}

// mvn quarkus:list-extensions

// mvn quarkus:add-extensions -Dextensions="quarkus-hibernate-orm-panache"
// mvn quarkus:add-extensions -Dextensions="quarkus-jdbc-postgresql"




