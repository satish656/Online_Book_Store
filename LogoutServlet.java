 package test;
 import java.io.*;
 import jakarta.servlet.*;
 import jakarta.servlet.http.*;
 import jakarta.servlet.annotation.*;
 @SuppressWarnings("serial")
 @WebServlet("/logout")
 public class LogoutServlet extends HttpServlet{
 @Override
  protected void doGet(HttpServletRequest req,HttpServletResponse res)throws
  ServletException,IOException{
  HttpSession hs = req.getSession(false);
  if(hs==null) {
  req.setAttribute("msg","Session Expired...<br>");
  }else {
  hs.removeAttribute("abean");
  hs.removeAttribute("alist");
 
  hs.invalidate();//Session destroyed
  req.setAttribute("msg","Logged out Successfully...<br>");
  }//end of else
  req.getRequestDispatcher("Msg.jsp").forward(req, res);  
  }
 }