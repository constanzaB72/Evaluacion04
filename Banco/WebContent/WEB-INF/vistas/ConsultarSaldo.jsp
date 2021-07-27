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
			<form method="POST" action="ConsultarSaldoController.do">
				<div class="card">
					<div class="card-header has-background-info">
						<span class="card-header-title">Consulta de Saldo</span>
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

</main>
<main class="container is-max-desktop mt-6">
	<!-- Formulario -->
	<div class="columns is-centered mt-4">
		<div class="column is-8">
			<form method="POST" action=>
				<div class="card">
					<div class="card-header has-background-info">
						<span class="card-header-title">Linea de credito</span>
					</div>
					<div class="card-content">
						<div class="field">
							<label class="label" for="saldolineacredito-txt">Saldo Linea de credito</label>
							<div class="control ">
								<input type="text" class="input" id="saldolineacredito-txt" name="saldolineacredito-txt" />
							</div>
						</div>
						<div class="field">
							<label class="label" for="saldolineacreditousado-txt">Credito utilizado </label>
							<div class="control">
								<input type="text" class="input" id="saldolineacreditousado-txt"
									name="saldolineacreditousado-txt" />
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