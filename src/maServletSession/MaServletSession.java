package maServletSession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class MaServletSession
 */
@WebServlet("/MaServletSession")
public class MaServletSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MaServletSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/*getServletContext().log("I come from POST!");
		doGet(request,response);*/
		
		
		// Recuperation parametre de requete
		String nom=request.getParameter("nom");
		String prenom=request.getParameter("prenom");
		String login=request.getParameter("login");
		String email=request.getParameter("email");
		String mdp=request.getParameter("password");
		
		//Creation Session HTTP a partir de l'Objet request
		HttpSession session=request.getSession();
		
		//Mise en attribut de session des parametres de requete
		session.setAttribute("nom", nom);
		session.setAttribute("prenom", prenom);
		session.setAttribute("email", email);
		session.setAttribute("login", login);
		session.setAttribute("password", mdp);
		
		//Redirection vers page JSP
		RequestDispatcher dispatcher=null;
		dispatcher=request.getRequestDispatcher("/demoel.jsp");
		dispatcher.forward(request, response);
	}

}
