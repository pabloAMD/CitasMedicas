<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<nav>
		
		<form action="/CitasMedicasOnline/insertar-suscripcion" method="post">
					<input class="form-control mr-sm-2" type="search" placeholder="nombre" name="buscar" aria-label="Search">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit" name="accion" value="Buscar">Buscar</button>
		</form>
	</nav>
	
	<div>
		<table>
			<thead>
				<tr>
					<th>Nombre Libro</th>
					<th>ISBN</th>
					<th>Numero Paginas</th>
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

	</div>
</body>
</html>