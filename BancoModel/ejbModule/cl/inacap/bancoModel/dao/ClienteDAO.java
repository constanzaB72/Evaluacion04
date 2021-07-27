package cl.inacap.bancoModel.dao;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import cl.inacap.bancoModel.model.Cliente;
import cl.inacap.bancoModel.utils.Utils;

@Stateless
@LocalBean
public class ClienteDAO {
@PersistenceContext(unitName = "BANCO_PU")
EntityManager em;

private Utils utils=new Utils();
public void save (Cliente cliente) {
	em.persist(cliente);
}
public Cliente validaLogin (String rut,String password) throws Exception{
	try {
		Query query = em.createNamedQuery("Cliente.login",Cliente.class);
		query.setParameter("rut", rut);
		query.setParameter("clave", utils.MD5(password).replace(" ",""));
		return((Cliente) query.getSingleResult());
	}catch (Exception e) {
		throw new Exception("Error");
	}
}
}
