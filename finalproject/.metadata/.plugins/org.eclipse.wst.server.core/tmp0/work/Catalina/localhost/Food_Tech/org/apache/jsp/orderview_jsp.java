/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.83
 * Generated at: 2023-12-17 16:04:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Food_Tech.Dto.User;
import Food_Tech.Dto.Item;
import java.util.List;

public final class orderview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("Food_Tech.Dto.User");
    _jspx_imports_classes.add("Food_Tech.Dto.Item");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("*{\r\n");
      out.write("    margin: 0%;\r\n");
      out.write("    padding: 0%;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("}\r\n");
      out.write("nav{\r\n");
      out.write("    /* border: 1px solid; */\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("    text-align: right;\r\n");
      out.write("}\r\n");
      out.write("body{\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    text-shadow: 3px 3px 20px greenyellow;\r\n");
      out.write("    color: white;\r\n");
      out.write("    background-image: url(\"\");\r\n");
      out.write("    background-size: cover;\r\n");
      out.write("    background-image: url('https://media.istockphoto.com/photos/food-background-on-dark-slate-picture-id480832827?k=6&m=480832827&s=612x612&w=0&h=AiQFadF1luFNikuejZaUuxLb1T8K76cHQHyf4mWPr9Y=');\r\n");
      out.write("    background-attachment: fixed;\r\n");
      out.write("}\r\n");
      out.write(" table{\r\n");
      out.write(" \r\n");
      out.write("    background-color: black;\r\n");
      out.write("    border-radius: 30px;\r\n");
      out.write("    font-size: larger;\r\n");
      out.write("    font-family: 'Times New Roman', Times, serif;\r\n");
      out.write("    box-shadow: 5px 5px 20px white;\r\n");
      out.write(" }\r\n");
      out.write(" td{\r\n");
      out.write("    padding: 20px;\r\n");
      out.write(" }\r\n");
      out.write(" th{\r\n");
      out.write("   \r\n");
      out.write("    padding: 20px;\r\n");
      out.write(" }\r\n");
      out.write(" \r\n");
      out.write("nav div h1:first-child{\r\n");
      out.write("   text-align: center;\r\n");
      out.write("}\r\n");
      out.write("section{\r\n");
      out.write("margin-left:600px;\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content:right;\r\n");
      out.write("    margin-right: 50px;\r\n");
      out.write("}\r\n");
      out.write("button{ \r\n");
      out.write("     margin-left: 20px;\r\n");
      out.write("    box-shadow: 2px 3px 10px white; \r\n");
      out.write("    margin-top: 10px;\r\n");
      out.write("    padding: 5px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    background-color: slategrey;\r\n");
      out.write("    border-radius: 10px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write("a{\r\n");
      out.write("    font-family: serif;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
List<Item> list =(List<Item>)request.getAttribute("list");
User user =(User)request.getAttribute("user");

      out.write("\r\n");
      out.write("<nav>\r\n");
      out.write("  <div>\r\n");
      out.write("    <h1>Welcome</h1>\r\n");
      out.write("    <h1>");
      out.print(user.getName() );
      out.write("</h1>\r\n");
      out.write("      <button><a href=\"cart?id=");
      out.print(user.getId());
      out.write("\">Cart</a></button>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div>\r\n");
      out.write("     <button><a href=\"home.jsp\">Home</a></button>\r\n");
      out.write("     <button><a href=\"login.jsp\">sign Out</a></button>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<section>\r\n");
      out.write("\r\n");
      out.write("  <table >\r\n");
      out.write("  <tr>\r\n");
      out.write("        <th>Item Name</th>\r\n");
      out.write("        <th>item Price</th>\r\n");
      out.write("        \r\n");
      out.write("\r\n");
      out.write("      </tr>\r\n");
      out.write("    ");
 for(Item item:list){
      out.write(" \r\n");
      out.write("      \r\n");
      out.write("       <tr>\r\n");
      out.write("        <td> ");
      out.print(item.getName() );
      out.write("</td>\r\n");
      out.write("        <td> ");
      out.print(item.getPrice() );
      out.write("</td>\r\n");
      out.write("        \r\n");
      out.write("         <td> <button><a href=\"orderId?id=");
      out.print(item.getId());
      out.write("&&userid=");
      out.print(user.getId());
      out.write("\">ADD</a></button></td>\r\n");
      out.write("        \r\n");
      out.write("       </tr>\r\n");
      out.write("    \r\n");
      out.write("    ");
} 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    </table>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
