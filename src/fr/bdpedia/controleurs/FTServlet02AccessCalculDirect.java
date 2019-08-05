package fr.bdpedia.controleurs;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.bdpedia.modeles.Temperature;

/**
 * Faire appel à la bonne méthode à l'aide des trois paramètres
 * Servlet implementation class FTServlet02AccessCalculDirect
 */
@WebServlet("/ServletAccessCalculDirect")
public class FTServlet02AccessCalculDirect extends HttpServlet {
	//
	private static final long serialVersionUID = 1L;
	private static final String VUES = "/WEB-INF/vues";
	private static final String DEFVUE = "/ftservlet01accessindex/index.jsp";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FTServlet02AccessCalculDirect() {
        super();
        //
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
		String inputTemp = request.getParameter("inputTemp");
		String outputTemp = request.getParameter("outputTemp");
		Double valTemp = Double.parseDouble(request.getParameter("valTemp"));
		String laVue = VUES + DEFVUE;
		//
		String fonction = "get"+outputTemp+"From"+inputTemp;	
		Temperature tp = new Temperature(valTemp,fonction);
		//
		request.setAttribute("inputTp", inputTemp);
		request.setAttribute("outputTp", outputTemp);
		request.setAttribute("valTp", valTemp);
		request.setAttribute("temperature", tp);
		//
		try {
			//
			if(inputTemp.equals(null) || outputTemp.equals(null) || valTemp.equals(null)) {
				//
			}else {
				//définir la vue
				laVue = VUES + "/ftservlet02accesscalculdirect/globalSolution.jsp";
			}		
		}catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher rd = request.getRequestDispatcher(laVue);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//
		doGet(request, response);
	}

}
