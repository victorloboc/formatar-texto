package format.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formatar-texto")
public class ServletFormatar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String texto = request.getParameter("texto");
		String formato = request.getParameter("format");
		
		//System.out.println(formato);
		
		Modelo formatar = new Modelo();
		String textoFormatado = formatar.formatarTexto(texto, formato);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("/mostrarTexto.jsp");
		request.setAttribute("texto", textoFormatado);
		
		rd.forward(request, response);
		
		
	}

}