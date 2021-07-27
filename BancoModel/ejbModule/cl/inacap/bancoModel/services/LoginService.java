package cl.inacap.bancoModel.services;

import javax.ejb.Stateless;
import javax.jws.WebService;

import cl.inacap.bancoModel.dao.ClienteDAO;
import cl.inacap.bancoModel.model.Cliente;
import cl.inacap.bancoModel.utils.Utils;

@Stateless
@WebService
public class LoginService {

	private Utils utils= new Utils();
	private ClienteDAO clienteDAO = new ClienteDAO();
	
	public Cliente validarCredenciales(String rut,String password) throws Exception {
		return clienteDAO.validaLogin(rut,password);
	}
}
