<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<title>Crear Paciente</title>
<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <!-- Mobile Metas -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">

    <!-- Site Metas -->
    <title>Create CV Resume - Responsive HTML5 Template</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Site Icons -->
    <link rel="shortcut icon" href="#" type="image/x-icon" />
    <link rel="apple-touch-icon" href="#" />

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="plantillas/css/bootstrap.min.css">
    <!-- Pogo Slider CSS -->
    <link rel="stylesheet" href="plantillas/css/pogo-slider.min.css">
    <!-- Site CSS -->
    <link rel="stylesheet" href="plantillas/css/style.css">
    <!-- Responsive CSS -->
    <link rel="stylesheet" href="plantillas/css/responsive.css">
    <!-- Custom CSS -->
    <link rel="stylesheet" href="plantillas/css/custom.css">

    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body id="home" data-spy="scroll" data-target="#navbar-wd" data-offset="98">

    <!-- Start header -->
    <header class="top-header">
        <nav class="navbar header-nav navbar-expand-lg">
            <div class="container-fluid">
                <a class="navbar-brand" href="index.html"><img src="images/logo.png" alt="image"></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbar-wd" aria-controls="navbar-wd" aria-expanded="false" aria-label="Toggle navigation">
                    <span></span>
                    <span></span>
                    <span></span>
                </button>
                <div class="collapse navbar-collapse justify-content-end" id="navbar-wd">
                    <ul class="navbar-nav">
                      
                        <li><a class="nav-link" href="registro">Registro</a></li>
                        <li><a class="nav-link active" style="background:#fff;color:#000;" href="login">Iniciar Sesion</a></li>
                    </ul>
                </div>
                <div class="search-box">
                    <input type="text" class="search-txt" placeholder="Search">
                    <a class="search-btn">
                        <img src="images/search_icon.png" alt="#" />
                    </a>
                </div>
            </div>
        </nav>
    </header>
    <!-- End header -->
<!-- section -->
    <div class="section layout_padding">
        <div class="container">
            <div class="row">


                <div class="col-lg-10 offset-lg-1 margin-top_30">
                    <div class="full text_align_center">
                    	<h2>Crear Paciente</h2>
                    	<form action="insertar-paciente" method="POST" class = "ui form">
                        <div class="modal-body">
                            <div class="form-group">
                                <label for="nombre">Nombre</label>
                                <input type="text" class="form-control" id="nombre" name="nombre" required="" placeholder="Juanito " >
                            </div>
                            <div class="form-group">
                                <label for="nombre">Apellido</label>
                                <input type="text" class="form-control" id="apellido" name="apellido" required="" placeholder="Perez" >
                            </div>
                            <div class="form-group">
                                <label for="nombre">Direccion</label>
                                <input type="text" class="form-control" id="direccion" name="direccion" required="" placeholder="Gansolandia" >
                            </div>
                            
                           <div class="form-group" >
                                <label for="nombre">Telefono</label>
                                <input type="text" class="form-control" id="telefono" name="telefono" required="" placeholder="0939002242" >
                            </div>
                            
                            <div class="form-group">
                                <label for="nombre">Cedula</label>
                                <input type="text" class="form-control" id="cedula" name="cedula" required="" placeholder="0109876543" >
                            </div>
                            
                            <div class="form-group">
                                <label for="nombre">Email</label>
                                <input type="text" class="form-control" id="email" name="email" required="" placeholder="juanito@gmail.com" >
                            </div>    
                        </div>
                       <div class="modal-footer">
                            <button type="button"  data-dismiss="modal">Cerrar</button>
                            <button type="submit" >Guardar</button>
                        </div>
                    </form> 
                    
                    </div>
                </div>

            </div>
        </div>
    </div>
    <!-- end section -->
 
        
        <!-- Start Footer -->
    <footer class="footer-box">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="logo">
                        <a href="index.html"><img src="images/footer_logo.png" alt="#" /></a>
                    </div>
                </div>
                <div class="col-lg-12 white_fonts">
                    <h4 class="text-align">Contact Us</h4>
                </div>
                
            
            </div>
            <div class="row white_fonts margin-top_30">
                <div class="col-lg-12">
                    <div class="full">
                        <div class="center">
                            <ul class="social_icon">
                                <li><a href="href="https://www.facebook.com/henry.guaman.338" target="_BLANK""><i class="fa fa-facebook-f"></i></a></li>
                                <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                                <li><a href="#"><i class="fa fa-google-plus"></i></a></li>
                                <p>&COPY; 2020 Todos los derechos reservados | Realizado por Henry Guaman</p>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </footer>
    <!-- End Footer -->

    <div class="footer_bottom">
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <p class="crp">© 2019 RD resume . All Rights Reserved.</p>
                    <ul class="bottom_menu">
                        <li><a href="#">About Us</a></li>
                        <li><a href="#">Find jobs</a></li>
                        <li><a href="contact.html">Contact us</a></li>
                        <li><a href="#">Terms of Service</a></li>
                        <li><a href="#">Privacy</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <a href="#" id="scroll-to-top" class="hvr-radial-out"><i class="fa fa-angle-up"></i></a>

    <!-- ALL JS FILES -->
    <script src="plantillas/js/jquery.min.js"></script>
    <script src="plantillas/js/popper.min.js"></script>
    <script src="plantillas/js/bootstrap.min.js"></script>
    <!-- ALL PLUGINS -->
    <script src="plantillas/js/jquery.magnific-popup.min.js"></script>
    <script src="plantillas/js/jquery.pogo-slider.min.js"></script>
    <script src="plantillas/js/slider-index.js"></script>
    <script src="plantillas/js/smoothscroll.js"></script>
    <script src="plantillas/js/form-validator.min.js"></script>
    <script src="plantillas/js/contact-form-script.js"></script>
    <script src="plantillas/js/isotope.min.js"></script>
    <script src="plantillas/js/images-loded.min.js"></script>
    <script src="plantillas/js/custom.js"></script>
</body>
</html>