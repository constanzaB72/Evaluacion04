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
			<form method="POST" action=>
				<div class="card">
					<div class="card-header has-background-info">
						<span class="card-header-title">Saldo disponible</span>
					</div>
					<div class="card-content">
						<div class="field">
							<label class="label" for="saldo-txt">Saldo</label>
							<div class="control ">
								<input type="text" class="input" id="saldo-txt" name="saldo-txt"
									placeholder="XXXX" />
							</div>
						</div>
							</div>
					</div>
					</form>
				</div>
			
		</div>

	<!-- Formulario -->
	<div class="columns is-centered mt-4">
		<div class="column is-8">
			<form method="POST" action="TransferenciaController.do">
				<div class="card">
					<div class="card-header has-background-info">
						<span class="card-header-title">Transferencia</span>
					</div>
					<div class="card-content">
						<div class="field">
							<label class="label" for="NumCuentaOrigen-txt">Numero de cuenta Origen</label>
							<div class="control ">
								<input type="text" class="input" id="numCuentaOrigen-txt" name="NumCuentaOrigen-txt" />
							</div>
						</div>
						<div class="field">
							<label class="label" for="numCuentaDestino-txt"> Numero Cuenta Destino</label>
							<div class="control">
								<input type="text" class="input" id="numCuentaDestino-txt"
									name="numCuentaDestino-txt" />
							</div>
						</div>
						<div class="field">
							<label class="label" for="monto-txt">Monto</label>
							<div class="control">
								<input type="text" class="input" id="monto-txt"
									name="monto-txt" />
							</div>
						</div><div class="field">
							<label class="label" for="clave-txt"> Clave</label>
							<div class="control">
								<input type="text" class="input" id="clave-txt"
									name="clave-txt" />
							</div>
						</div>
							<div class="field">				
							<div class="card-footer-item">
								<button type="submit" class="button is-info">Transferir</button>
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