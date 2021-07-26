package cl.inacap.bancoModel.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ejecutivo database table.
 * 
 */
@Entity
@NamedQuery(name="Ejecutivo.findAll", query="SELECT e FROM Ejecutivo e")
public class Ejecutivo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String rut;

	private String apellido;

	private String clave;

	private String nombre;

	//bi-directional many-to-one association to Cliente
	@OneToMany(mappedBy="ejecutivo")
	private List<Cliente> clientes;

	//bi-directional many-to-one association to Mensaje
	@OneToMany(mappedBy="ejecutivo")
	private List<Mensaje> mensajes;

	public Ejecutivo() {
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente addCliente(Cliente cliente) {
		getClientes().add(cliente);
		cliente.setEjecutivo(this);

		return cliente;
	}

	public Cliente removeCliente(Cliente cliente) {
		getClientes().remove(cliente);
		cliente.setEjecutivo(null);

		return cliente;
	}

	public List<Mensaje> getMensajes() {
		return this.mensajes;
	}

	public void setMensajes(List<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}

	public Mensaje addMensaje(Mensaje mensaje) {
		getMensajes().add(mensaje);
		mensaje.setEjecutivo(this);

		return mensaje;
	}

	public Mensaje removeMensaje(Mensaje mensaje) {
		getMensajes().remove(mensaje);
		mensaje.setEjecutivo(null);

		return mensaje;
	}

}