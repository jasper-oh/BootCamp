package com.jsplec.bbs.homecontroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsplec.bbs.command.BCommand;
import com.jsplec.bbs.command.BContentCommand;
import com.jsplec.bbs.command.BDeleteCommand;
import com.jsplec.bbs.command.BListCommand;
import com.jsplec.bbs.command.BUpdateCommand;
import com.jsplec.bbs.command.BWriteCommand;

/**
 * Servlet implementation class BFrontController
 */
// 어떤것이 들어와도 이게 받는다. 
@WebServlet("*.do")
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		어디로 들어왔는지 흔적 남기
		System.out.println("doGet()");
		actionDo(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		어디로 들어왔는지 흔적 남기
		System.out.println("doPost()");
		actionDo(request,response);
		
	}
	
	private void actionDo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		어디로 들어왔는지 흔적 남기
		System.out.println("actionDo()");
		
		request.setCharacterEncoding("UTF-8");
		
		String uri = request.getRequestURI();
//		url  => location , uri => information ///MVCBoard/start.do
		
		String conPath = request.getContextPath();
//		project 이름만 가져온다 /// MVCBoard
		
		String com = uri.substring(conPath.length());
//		내가 원하는것을 들고왔다! //start.do
		
		String viewPage = null;
		
//		System.out.println(uri);
//		System.out.println(conPath);
//		System.out.println(com);
		
		BCommand command = null;
		
		switch(com) {
		
		case("/list.do"):
			command = new BListCommand();
			command.execute(request, response);
			viewPage = "list.jsp";
			break;
		case("/write_view.do"):
			viewPage = "write_view.jsp";
			break;
			
		case("/write.do"):
			command = new BWriteCommand();
			command.execute(request,response);

			// 위로올라가서 업데이트가 자동으로 되어 보여준다. -> list.do
			viewPage = "list.do";
			break;
		case("/content_view.do"):
			command = new BContentCommand();
			command.execute(request, response);
			viewPage = "content_view.jsp";
			break;
		case("/modify.do"):
			command = new BUpdateCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
		case("/delete.do"):
			command = new BDeleteCommand();
			command.execute(request, response);
			viewPage = "list.do";
			break;
			
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}//--endLine
