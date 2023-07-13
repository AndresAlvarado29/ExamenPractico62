package ec.edu.ups.ppw.eva62.modelo;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Libro {
@Id
@Column(name="lib_id")
private int id;
@Column(name="lib_nombre")
private String nombre;
@Column(name="lib_editorial")
private String editorial;
@Column(name="lib_autor")
private String autor;
@Column(name="lib_paginas")
private int pagina;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getEditorial() {
	return editorial;
}
public void setEditorial(String editorial) {
	this.editorial = editorial;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getPagina() {
	return pagina;
}
public void setPagina(int pagina) {
	this.pagina = pagina;
}

}
