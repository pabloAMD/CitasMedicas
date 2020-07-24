<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Crear Telefono</title>
</head>
<body>


	<form method="POST" action="/CitasMedicasOnline/CrearCitaMedica">

		<div class="form-group text-center pt-3">
			<h1 class="text-light">CREAR UN NUEVO TELEFONO</h1>
		</div>
		<div class="form-group mx-sm-4 pt-1 ">
			<H6>Ingrese el tipo de telefono:</H6>
			<input type="text" class="form-control"
				placeholder="Ingrese su tipo aqui" name="tipo" required>
		</div>


		<div class="form-group mx-sm-4 pb-2">
			<input type="submit" class=" btn  btn-block ingresar"
				value="REGISTRAR">
		</div>



	</form>







</body>
</html>