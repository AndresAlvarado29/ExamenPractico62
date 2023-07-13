package ec.edu.ups.ppw.eva62.negocio;

import java.util.List;

import ec.edu.ups.ppw.eva62.dao.LibroDAO;
import ec.edu.ups.ppw.eva62.modelo.Libro;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionLibro {
@Inject
private LibroDAO libroDAO;

public void guardarLibros(Libro libro) throws Exception{
	if(libroDAO.read(libro.getId())==null) {
		try {
			libroDAO.insert(libro);
		} catch (Exception e) {
			throw new Exception("Error al insertar: " + e.getMessage());
		}
	}else {
		try {
			libroDAO.update(libro);
		} catch (Exception e) {
			throw new Exception("Error al actualizar: " + e.getMessage());
		}
	}
}
public List<Libro> listar(){
	return libroDAO.getAll();
}
}
