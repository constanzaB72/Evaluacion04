package cl.inacap.bancoModel.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the mensaje database table.
 * 
 */
@Entity
@NamedQuery(name="Mensaje.findAll", query="SELECT m FROM Mensaje m")
public class Mensaje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idmensaje;

	private String asunto;

	private String contenido;

	private String respuesta;

	//bi-directional many-to-one association to Cliente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clienteFK")
	private Cliente cliente;

	//bi-directional many-to-one association to Ejecutivo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ejecutivoFK")
	private Ejecutivo ejecutivo;

	public Mensaje() {
	}

	public int getIdmensaje() {
		return this.idmensaje;
	}

	public void setIdmensaje(int idmensaje) {
		this.idmensaje = idmensaje;
	}

	public String getAsunto() {
		return this.asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getContenido() {
		return this.contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getRespuesta() {
		return this.respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Ejecutivo getEjecutivo() {
		return this.ejecutivo;
	}

	public void setEjecutivo(Ejecutivo ejecutivo) {
		this.ejecutivo = ejecutivo;
	}

}