package edu.austincc.tictactoe.servlets;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.austincc.tictactoe.domain.BadRowOrColumnIndex;
import edu.austincc.tictactoe.domain.Board;
import edu.austincc.tictactoe.domain.Move;
import edu.austincc.tictactoe.domain.Piece;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		if ( session.getAttribute("board") == null ) {
			Board b = new Board();
//			try {
//				b.makeMove(new Move(1, 1, Piece.X));
//				System.out.println(b.toString());
//			} catch (BadRowOrColumnIndex e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			session.setAttribute("board", b );
		}
		
		getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Post accomplished\n");
//		response.getWriter().append("Attrs are: \n");
//		Enumeration<String> ae = request.getAttributeNames();
//		while(ae.hasMoreElements()) {
//			String attrName = ae.nextElement();
//			response.getWriter().append(attrName + "\n");
//		}
//		
//		response.getWriter().append("Params are: \n");
//		Enumeration<String> pe = request.getParameterNames();
//		while(pe.hasMoreElements()) {
//			String paramName = pe.nextElement();
//			response.getWriter().append(paramName + "\n");
//		}
		
// response.getWriter().append("---\n");
//response.getWriter().append(request.getParameter("rowColPiece"));
		
		// Getting the session
		HttpSession session = request.getSession();
		
		// Handle reset board request
		String reset = request.getParameter("reset");
		if ( (reset != null) ) {
			if ( reset.equalsIgnoreCase("reset") ) {
				if ( session.getAttribute("board") != null ) {
					Board b = (Board)session.getAttribute("board");
					b.clear();
				}
				getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
				return;
			}
		}
		
		// Handle new move made 
		String moveString = request.getParameter("rowColPiece");
		if ( moveString != null) {
			String[] tokenizedMove = moveString.split(",");
	
			Integer row = new Integer(tokenizedMove[0]);
			Integer col = new Integer(tokenizedMove[1]);
			if ( !tokenizedMove[2].equalsIgnoreCase("X") && 
					!tokenizedMove[2].equalsIgnoreCase("O") ) {
				Enum<Piece> p = Piece.X;
				Move newMove = new Move(row, col, p);
				// response.getWriter().append("---\n" + newMove.toString());

				if ( session.getAttribute("board") != null ) {
					Board b = (Board)session.getAttribute("board");
					
					if (b != null) {
						// response.getWriter().append("Board is not null");
						try {
							// Player X's Move
							b.makeMove(newMove);
							// Computers Move (makeRandomMove is always O's - see the source)
							b.makeRandomMove();
						} catch (BadRowOrColumnIndex e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						if ( b.hasWinner() ) {
							request.setAttribute("winner", "true");
							request.setAttribute("winningTeam", b.getWinningTeam());
						}
						getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
						return;
					}
				}
			}
			
		}
		
		// Default case
		getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
	}


}
