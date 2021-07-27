package cl.inacap.banco.controller;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cl.inacap.bancoModel.dao.ClienteDAO;
import cl.inacap.bancoModel.model.Cliente;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController.do")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	@Inject
	private ClienteDAO clienteDAO;
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		request.getRequestDispatcher("WEB-INF/vistas/Login.jsp").forward(request, response);
//		
		String user=request.getParameter("rut-txt");
		String password=request.getParameter("clave-txt");
		
		if(user !=null && password !=null) {
			if (!user.isEmpty() && !password.isEmpty()) {
				try {
					Cliente cliente=clienteDAO.validaLogin(user,password);
					if(cliente !=null) {
						 HttpSession session = request.getSession(true);
						 session.setAttribute("usuario", cliente);
						 session.setAttribute("nombre", cliente.getNombre() + " " +cliente.getApellido());
						 int saldo=cliente.getCuentas().get(0).getSaldo();
						 request.setAttribute("saldo",saldo);
						 request.setAttribute("cliente", cliente);
						 request.getRequestDispatcher("WEB-INF/vistas/ConsultarSaldo.jsp").forward(request, response);
					}else {
						System.out.println("error de credenciales");
					}
				}catch (Exception e) {
					System.out.println(e);
				}
			}
		}
			request.getRequestDispatcher("WEB-INF/vistas/Login.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
