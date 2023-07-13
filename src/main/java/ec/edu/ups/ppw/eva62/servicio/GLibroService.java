package ec.edu.ups.ppw.eva62.servicio;


import java.util.List;

import ec.edu.ups.ppw.eva62.modelo.Libro;
import ec.edu.ups.ppw.eva62.negocio.GestionLibro;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("libros")
public class GLibroService {
@Inject
private GestionLibro gLibro;

@POST
@Produces("application/json")
@Consumes("application/json")
public Response guardarLibros(Libro libro) {
	try {
		gLibro.guardarLibros(libro);
		return Response.status(Response.Status.OK).entity(libro).build();
	} catch (Exception e) {
		Error error = new Error();
		e.printStackTrace();
		error.setCodigo(99);
		error.setMensaje("Error al guardar: " + e.getMessage());
		return Response.status(Response.Status.OK).entity(error).build();
	}
}
@GET
@Path("lista")
@Produces("application/json")
public List<Libro> listaLibro(){
	return gLibro.listar();
}
}
