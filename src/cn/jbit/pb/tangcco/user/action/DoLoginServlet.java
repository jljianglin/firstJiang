package cn.jbit.pb.tangcco.user.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.jbit.pb.tangcco.user.biz.UserBiz;
import cn.jbit.pb.tangcco.user.biz.impl.UserBizImpl;
import cn.jbit.pb.tangcco.user.entity.Tbuser;

public class DoLoginServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public DoLoginServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//�ȴ���ҳ�ϻ�ȡ��username��password ��user
//		String uname = request.getParameter("username");
//		String pwd = request.getParameter("password");
//		Tbuser users = new Tbuser(uname, pwd);
//		
		Tbuser users = new Tbuser(request.getParameter("username"), request.getParameter("password"));
		//�����ݿ��������
		UserBiz biz = new UserBizImpl();
		Tbuser user = biz.login(users);
		if(user!=null){
			request.getRequestDispatcher("/WEB-INF/jsp/main/main.jsp").forward(request, response);
		}else{
			String no = "�Բ���,�û������������!";
			request.setAttribute("n", no);
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
		
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
