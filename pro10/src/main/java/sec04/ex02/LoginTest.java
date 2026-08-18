package sec04.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login8")
public class LoginTest extends HttpServlet {
	ServletContext context=null;
	List user_list=new ArrayList();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");
	    PrintWriter out = response.getWriter();
	    HttpSession session = request.getSession();
	    
	    context = getServletContext();
	    
	    String user_name = request.getParameter("user_name");
	    String user_pw = request.getParameter("user_pw");
	    
	    LoginImpl loginUser = new LoginImpl(user_name, user_pw);
	    if(session.isNew()) {
	    	session.setAttribute("loginUser", loginUser);
	    	user_list.add(user_name);
	    	context.setAttribute("user_list", user_list);
	    	
	    }
	    
	    out.println("<html><body>");
	    out.println("아이디는 " + loginUser.user_name + "<br>");
	    out.println("총 접속자 수는 " + LoginImpl.total_user + "<br><br>");
	    
	    out.println("접속 아이디 : <br>");
	    List list = (ArrayList)context.getAttribute("user_list");
	    for(int i=0; i<list.size(); i++) {
	    	out.println(list.get(i) + "<br>");
	    }
	    
	    out.println("<a href='logout?user_name="+user_name+"'>로그아웃</a>");
	    out.println("</body></html>");
	    
	    
	    
	}

}
