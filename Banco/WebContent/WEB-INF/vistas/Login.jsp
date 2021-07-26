<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../templates/header.jsp"></jsp:include>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="vendor/bulma/css/bulma.min.css" rel="stylesheet" />
<main class="container is-max-desktop mt-6">
	<!-- Formulario -->
	<div class="columns is-centered mt-4">
		<div class="column is-8">
			<form method="POST" action="LoginController.do">
				<div class="card">
					<div class="card-header has-background-info">
						<span class="card-header-title">Iniciar Sesion</span>
					</div>
					<div class="card-content">
						<div class="field">
							<label class="label" for="rut-txt">Rut</label>
							<div class="control ">
								<input type="text" class="input" id="rut-txt" name="rut-txt"
									placeholder="26.485.321-5" />
							</div>
						</div>
						<div class="field">
							<label class="label" for="clave-txt"> Clave</label>
							<div class="control">
								<input type="text" class="input" id="clave-txt"
									name="clave-txt" />
							</div>
						</div>
							<div class="field">				
							<div class="card-footer-item">
								<button type="submit" class="button is-info">Entrar</button>
							</div>
						</div>
					</div>
				</div>
			</form>
		</div>
	</div>

</main>
</body>
</html>