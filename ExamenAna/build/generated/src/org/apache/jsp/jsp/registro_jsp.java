package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>Balay Template</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"keywords\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("\n");
      out.write("        <!-- Facebook and Twitter integration -->\n");
      out.write("        <meta property=\"og:title\" content=\"\"/>\n");
      out.write("        <meta property=\"og:image\" content=\"\"/>\n");
      out.write("        <meta property=\"og:url\" content=\"\"/>\n");
      out.write("        <meta property=\"og:site_name\" content=\"\"/>\n");
      out.write("        <meta property=\"og:description\" content=\"\"/>\n");
      out.write("        <meta name=\"twitter:title\" content=\"\" />\n");
      out.write("        <meta name=\"twitter:image\" content=\"\" />\n");
      out.write("        <meta name=\"twitter:url\" content=\"\" />\n");
      out.write("        <meta name=\"twitter:card\" content=\"\" />\n");
      out.write("\n");
      out.write("        <!-- Place favicon.ico and apple-touch-icon.png in the root directory -->\n");
      out.write("        <link rel=\"shortcut icon\" href=\"favicon.ico\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Quicksand:300,400,500,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Animate.css -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/animate.css\">\n");
      out.write("        <!-- Icomoon Icon Fonts-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/icomoon.css\">\n");
      out.write("        <!-- Bootstrap  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/bootstrap.css\">\n");
      out.write("        <!-- Flexslider  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/flexslider.css\">\n");
      out.write("        <!-- Flaticons  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../fonts/flaticon/font/flaticon.css\">\n");
      out.write("        <!-- Owl Carousel -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/owl.theme.default.min.css\">\n");
      out.write("        <!-- Theme style  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"../css/style.css\">\n");
      out.write("\n");
      out.write("        <!-- Modernizr JS -->\n");
      out.write("        <script src=\"../js/modernizr-2.6.2.min.js\"></script>\n");
      out.write("        <!-- FOR IE9 below -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"js/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"colorlib-page\">\n");
      out.write("            <a href=\"#\" class=\"js-colorlib-nav-toggle colorlib-nav-toggle\"><i></i></a>\n");
      out.write("            <aside id=\"colorlib-aside\" role=\"complementary\" class=\"border js-fullheight\">\n");
      out.write("                <h1 id=\"colorlib-logo\"><a href=\"index.html\">Examen Segundo Parcial</a></h1>\n");
      out.write("                <nav id=\"colorlib-main-menu\" role=\"navigation\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"colorlib-active\"><a href=\"../index.jsp\">Inicio</a></li>\n");
      out.write("                        <li><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                        <li><a href=\"../about.html\">A cerca de</a></li>\n");
      out.write("                        <li><a href=\"registro.jsp\">Registros</a></li>\n");
      out.write("                        <li><a href=\"consulta.jsp\">Consulta</a></li>\n");
      out.write("                        <li><a href=\"../contact.html\">Contacto</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <div class=\"colorlib-footer\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-facebook2\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-twitter2\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-instagram\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"icon-linkedin2\"></i></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("            <div id=\"colorlib-main\">\n");
      out.write("\n");
      out.write("                <div class=\"colorlib-contact\">\n");
      out.write("                    <div class=\"colorlib-narrow-content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-12 animate-box\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("                                <span class=\"heading-meta\">Registra tus datos</span>\n");
      out.write("                                <h2 class=\"colorlib-heading\">Primero necesitamos saber un poco más de ti...</h2>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-5\">\n");
      out.write("                                <div class=\"colorlib-feature colorlib-feature-sm animate-box\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("                                    <div class=\"colorlib-icon\">\n");
      out.write("                                        <img src=\"../img/usuario.png\" alt=\"usuario\" width=\"50px\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"colorlib-text\">\n");
      out.write("                                        <p><a href=\"#\">info@domain.com</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"colorlib-feature colorlib-feature-sm animate-box\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("                                    <div class=\"colorlib-icon\">\n");
      out.write("                                        <i class=\"icon-map\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"colorlib-text\">\n");
      out.write("                                        <p>198 West 21th Street, Suite 721 New York NY 10016</p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"colorlib-feature colorlib-feature-sm animate-box\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("                                    <div class=\"colorlib-icon\">\n");
      out.write("                                        <i class=\"icon-phone\"></i>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"colorlib-text\">\n");
      out.write("                                        <p><a href=\"tel://\">+123 456 7890</a></p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-7 col-md-push-1\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-10 col-md-offset-1 col-md-pull-1 animate-box\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("                                        <form action=\"../RegistroServlet\" data-validate=\"Tienes que llenar este campo\">\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <label class=\"label-input100\" for=\"nombre\">Nombre</label>\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" name=\"nombre\" placeholder=\"Nombre\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"Email\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"text\" class=\"form-control\" placeholder=\"Subject\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <textarea name=\"\" id=\"message\" cols=\"30\" rows=\"7\" class=\"form-control\" placeholder=\"Message\"></textarea>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"form-group\">\n");
      out.write("                                                <input type=\"submit\" class=\"btn btn-primary btn-send-message\" value=\"Send Message\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"map\"></div>\t\n");
      out.write("\n");
      out.write("                <div id=\"get-in-touch\" class=\"colorlib-bg-color\">\n");
      out.write("                    <div class=\"colorlib-narrow-content\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 animate-box\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("                                <h2>Get in Touch!</h2>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-md-6 col-md-offset-3 col-md-pull-3 animate-box\" data-animate-effect=\"fadeInLeft\">\n");
      out.write("                                <p class=\"colorlib-lead\">Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>\n");
      out.write("                                <p><a href=\"#\" class=\"btn btn-primary btn-learn\">Contact me!</a></p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- jQuery -->\n");
      out.write("        <script src=\"../js/jquery.min.js\"></script>\n");
      out.write("        <!-- jQuery Easing -->\n");
      out.write("        <script src=\"../js/jquery.easing.1.3.js\"></script>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"../js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Waypoints -->\n");
      out.write("        <script src=\"../js/jquery.waypoints.min.js\"></script>\n");
      out.write("        <!-- Flexslider -->\n");
      out.write("        <script src=\"../js/jquery.flexslider-min.js\"></script>\n");
      out.write("        <!-- Sticky Kit -->\n");
      out.write("        <script src=\"../js/sticky-kit.min.js\"></script>\n");
      out.write("        <!-- Owl carousel -->\n");
      out.write("        <script src=\"../js/owl.carousel.min.js\"></script>\n");
      out.write("        <!-- Counters -->\n");
      out.write("        <script src=\"../js/jquery.countTo.js\"></script>\n");
      out.write("        <!-- Google Map -->\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyCefOgb1ZWqYtj7raVSmN4PL2WkTrc-KyA&sensor=false\"></script>\n");
      out.write("        <script src=\"../js/google_map.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- MAIN JS -->\n");
      out.write("        <script src=\"../js/main_1.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
