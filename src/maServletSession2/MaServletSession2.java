package maServletSession2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MaServletSession2
 */
@WebServlet("/MaServletSession2")
public class MaServletSession2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MaServletSession2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// etape 1: recuperation des parametres de la requete
		String login = request.getParameter("login");
		String password = request.getParameter("password");

		// etape 2: soumettre les parametres de la requete a la couche service et
		// recuperation parametre de requete
		User user = new User(login, password);
		HttpSession maSession = request.getSession();
		maSession.setAttribute("utilisateur", user);
	
		// etape 3: reponse a l'utilisateur
		/*RequestDispatcher dispatcher= request.getRequestDispatcher("resultatlogin2.jsp");
		dispatcher.forward(request, response);*/
		response.sendRedirect("resultatlogin2.jsp");
	}

}
