<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Résultat de la conversion</title>
<jsp:include page="/fragments/inclusions.jsp" />
</head>
<body>
<h2>Convertisseur de température : page de résultat</h2>
<!-- cette expression fonctionne aussi
<p>La conversion de ${requestScope.valTp} degrés ${requestScope.inputTp} en degrés ${requestScope.outputTp} vaut : </p>
 -->
 <div class="text">La conversion de ${requestScope["valTp"]} degrés ${requestScope["inputTp"]} en degrés ${requestScope["outputTp"]} vaut : </div>
<div class="res">${requestScope.temperature.getResult()}</div>
<div class="retour">
	<form action="${pageContext.request.contextPath}/ServletAccessIndex">
		<input class="button-back" type="submit" value="retour"/>
	</form>
</div>
</body>
</html>