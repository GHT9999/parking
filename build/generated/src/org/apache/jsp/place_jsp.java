package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class place_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/template/menu.jsp");
    _jspx_dependants.add("/template/header.jsp");
    _jspx_dependants.add("/template/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <!-- Required meta tags -->\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <title>Gestion Parking</title>\n");
      out.write("  <!-- base:css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"template/css/materialdesignicons.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"template/css/vendor.bundle.base.css\">\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- inject:css -->\n");
      out.write("  <link rel=\"stylesheet\" href=\"template/css/style.css\">\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <link rel=\"shortcut icon\" href=\"template/images/favicon.png\" />\n");
      out.write("  <script src=\"script/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"script/Place.js\" type=\"text/javascript\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("  <div class=\"container-scroller d-flex\">\n");
      out.write("    <!-- partial:../../partials/_sidebar.html -->\n");
      out.write("    ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\n");
      out.write("      <ul class=\"nav\">\n");
      out.write("        <li class=\"nav-item sidebar-category\">\n");
      out.write("          <p>MENU</p>\n");
      out.write("          <span></span>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"../Parking/index.jsp\">\n");
      out.write("            <i class=\"mdi mdi-grid-large menu-icon\"></i>\n");
      out.write("            <span class=\"menu-title\">Gestion Section</span>\n");
      out.write("          </a>\n");
      out.write("        </li>\n");
      out.write("        <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"../Parking/place.jsp\">\n");
      out.write("            <i class=\"mdi mdi-grid-large menu-icon\"></i>\n");
      out.write("            <span class=\"menu-title\">Gestion places</span>\n");
      out.write("          </a>\n");
      out.write("        </li> \n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    <!-- partial -->\n");
      out.write("    <div class=\"container-fluid page-body-wrapper\">\n");
      out.write("      <!-- partial:../../partials/_navbar.html -->\n");
      out.write("      ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <nav class=\"navbar col-lg-12 col-12 px-0 py-0 py-lg-4 d-flex flex-row\">\n");
      out.write("        <div class=\"navbar-menu-wrapper d-flex align-items-center justify-content-end\">\n");
      out.write("          <button class=\"navbar-toggler navbar-toggler align-self-center\" type=\"button\" data-toggle=\"minimize\">\n");
      out.write("            <span class=\"mdi mdi-menu\"></span>\n");
      out.write("          </button>\n");
      out.write("          <ul class=\"navbar-nav navbar-nav-right\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("              <h4 class=\"mb-0 font-weight-bold d-none d-xl-block\">Mar 12, 2019 - Apr 10, 2019</h4>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("          </ul>\n");
      out.write("          <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\" data-toggle=\"offcanvas\">\n");
      out.write("            <span class=\"mdi mdi-menu\"></span>\n");
      out.write("          </button>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("      <!-- partial -->\n");
      out.write("      <div class=\"main-panel\">\n");
      out.write("        <div class=\"content-wrapper\">\n");
      out.write("            <div class=\"col-md-6\" >\n");
      out.write("                                 <div class=\"card\">\n");
      out.write("                                    <legend>Liste des places</legend>\n");
      out.write("                                    <fieldset>\n");
      out.write("                                        <table class=\"table\">\n");
      out.write("                                            <thead>\n");
      out.write("                                                <tr>\n");
      out.write("                                                   <th scope=\"col\">Id</th>\n");
      out.write("                                                    <th scope=\"col\">Numero</th>\n");
      out.write("                                                    <th scope=\"col\">Etat</th>\n");
      out.write("                                                    <th scope=\"col\">idSection </th>\n");
      out.write("                                                    <th scope=\"col\">Liberer</th>\n");
      out.write("                                                    <th scope=\"col\">Occuper</th>\n");
      out.write("                                                </tr>\n");
      out.write("                                            </thead>\n");
      out.write("                                            <tbody id=\"content\">\n");
      out.write("\n");
      out.write("                                            </tbody>\n");
      out.write("                                        </table>\n");
      out.write("                                    </fieldset>\n");
      out.write("                                </div>\n");
      out.write("                              \n");
      out.write("                            </div>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <!-- content-wrapper ends -->\n");
      out.write("        <!-- partial:../../partials/_footer.html -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("              <div class=\"d-sm-flex justify-content-center justify-content-sm-between\">\n");
      out.write("                <span class=\"text-muted d-block text-center text-sm-left d-sm-inline-block\">Copyright © bootstrapdash.com 2020</span>\n");
      out.write("                <span class=\"float-none float-sm-right d-block mt-1 mt-sm-0 text-center\"> Outhmane GHALLABI</span>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </footer>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <!-- partial -->\n");
      out.write("      </div>\n");
      out.write("      <!-- main-panel ends -->\n");
      out.write("    </div>\n");
      out.write("    <!-- page-body-wrapper ends -->\n");
      out.write("  </div>\n");
      out.write("  <!-- container-scroller -->\n");
      out.write("  <!-- base:js -->\n");
      out.write("  <script src=\"../../vendors/js/vendor.bundle.base.js\"></script>\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- Plugin js for this page-->\n");
      out.write("  <!-- End plugin js for this page-->\n");
      out.write("  <!-- inject:js -->\n");
      out.write("  <script src=\"../../js/off-canvas.js\"></script>\n");
      out.write("  <script src=\"../../js/hoverable-collapse.js\"></script>\n");
      out.write("  <script src=\"../../js/template.js\"></script>\n");
      out.write("  <!-- endinject -->\n");
      out.write("  <!-- End custom js for this page-->\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
