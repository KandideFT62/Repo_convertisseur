<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Saisie des paramètres</title>
<jsp:include page="/fragments/inclusions.jsp" />
</head>
<body>
	<h2>Convertisseur de température : page de saisie</h2>
	<form method="post" action="${pageContext.request.contextPath}/ServletAccessCalculDirect">
		<select class="inputp" name="inputTemp">
		  <option selected>Convertir des degrés</option>
		  <option value="Celsius">Celsius</option>
		  <option value="Farenheit">Farenheit</option>
		  <option value="Kelvin">Kelvin</option>
		</select>
		<select class="outputp" name="outputTemp">
		  <option selected>en degrés</option>
		  <option value="Celsius">Celsius</option>
		  <option value="Farenheit">Farenheit</option>
		  <option value="Kelvin">Kelvin</option>
		</select>
		<input class="valtp" type="text" placeholder="valeur de la température" name="valTemp" />
		<input class="valid" type="submit" value="valider"/>
	</form>

</body>
</html>