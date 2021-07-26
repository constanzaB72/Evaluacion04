package cl.inacap.bancoModel.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the movimientos database table.
 * 
 */
@Entity
@Table(name="movimientos")
@NamedQuery(name="Movimiento.findAll", query="SELECT m FROM Movimiento m")
public class Movimiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int idmovimiento;

	private String descripcion;

	@Temporal(TemporalType.DATE)
	private Date fecha;

	//bi-directional many-to-one association to Cuenta
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cuentaFK")
	private Cuenta cuenta;

	public Movimiento() {
	}

	public int getIdmovimiento() {
		return this.idmovimiento;
	}

	public void setIdmovimiento(int idmovimiento) {
		this.idmovimiento = idmovimiento;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cuenta getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

}