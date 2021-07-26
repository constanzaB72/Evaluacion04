package cl.inacap.bancoModel.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cuenta database table.
 * 
 */
@Entity
@NamedQuery(name="Cuenta.findAll", query="SELECT c FROM Cuenta c")
public class Cuenta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int numerocta;

	private String clavetransaccion;

	private int estado;

	private int saldo;

	private int saldolineacredito;

	private int saldolineacreditousado;

	//bi-directional many-to-one association to Cliente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clienteFK")
	private Cliente cliente;

	//bi-directional many-to-one association to Movimiento
	@OneToMany(mappedBy="cuenta")
	private List<Movimiento> movimientos;

	public Cuenta() {
	}

	public int getNumerocta() {
		return this.numerocta;
	}

	public void setNumerocta(int numerocta) {
		this.numerocta = numerocta;
	}

	public String getClavetransaccion() {
		return this.clavetransaccion;
	}

	public void setClavetransaccion(String clavetransaccion) {
		this.clavetransaccion = clavetransaccion;
	}

	public int getEstado() {
		return this.estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getSaldolineacredito() {
		return this.saldolineacredito;
	}

	public void setSaldolineacredito(int saldolineacredito) {
		this.saldolineacredito = saldolineacredito;
	}

	public int getSaldolineacreditousado() {
		return this.saldolineacreditousado;
	}

	public void setSaldolineacreditousado(int saldolineacreditousado) {
		this.saldolineacreditousado = saldolineacreditousado;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Movimiento> getMovimientos() {
		return this.movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public Movimiento addMovimiento(Movimiento movimiento) {
		getMovimientos().add(movimiento);
		movimiento.setCuenta(this);

		return movimiento;
	}

	public Movimiento removeMovimiento(Movimiento movimiento) {
		getMovimientos().remove(movimiento);
		movimiento.setCuenta(null);

		return movimiento;
	}

}