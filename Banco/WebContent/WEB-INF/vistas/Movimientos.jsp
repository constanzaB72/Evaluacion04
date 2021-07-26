<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="vendor/bulma/css/bulma.min.css" rel="stylesheet" />
<main class="container is-max-desktop mt-6">
	<!-- Formulario -->
	<div class="container mt-6">
		<div class="columns is-centered">
			<div class="column is-8 ">
				<div class="card">
					<div class="card-header has-background-info">
						<span class="card-header-title">Historial de movimientos </span>
					</div>

					<div class="field">
						<table class="table is-hovered is-bordered is-fullwidth">
							<thead class=" has-background-info">
								<tr class="">
									<th>Nombre de usuario</th>
									<th>Numero de cuenta</th>
									<th>Fecha</th>
									<th>Detalles</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="solicitud" items="${asistentes}">
									<tr>
										<td>${solicitud.nombre}${solicitud.apellido}</td>
										<td>${solicitud.empresa}</td>
										<td>${solicitud.region}</td>
										<td>${solicitud.estado}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>

</main>
</body>
</html>