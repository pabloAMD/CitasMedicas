<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Libros</title>


</head>
<body>
	<nav>
		
			<h1>Buscar Libro por Autor o Nombre</h1>
			
			<form class="form-inline my-2 my-lg-0"	action="/CitasMedicasOnline/insertar-suscripcion" method="post">
				<input class="form-control mr-sm-2" type="search" placeholder="Autor" name="buscar" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit"
						name="accion" value="Buscar">Buscar</button>
			</form>
	</nav>
		<h1>Listado de Libros</h1>
		<form action="/CitasMedicasOnline/ListarLibro" method="post">
		<input class="btn btn-danger btn block" type="submit" name="accion"
			value="Listar">
	</form>
	<div>
		<table>
			<thead>
				<tr>
					<th>Nombre Libro</th>
					<th>ISBN</th>
					<th># Paginas</th>
					<th># Capitulo</th>
					<th>Titulo Capitulo</th>
					<th>Nombre Autor</th>
					<th>Nacionalidad Autor</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="cap" items="${paciente}">
					<tr>
						<td>${cap.getNombre()}</td>
						<td>${cap.getApellido()}</td>
						<td>${cap.getCedula()}</td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
	
		<div>
			<ul>
				<li><a href="/Correccion/ListarLibro?accion=Registrar">INSERTAR LIBRO</a></li>
			</ul>
		</div>

	</div>
</body>
</html>