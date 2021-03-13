<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Formata��o de Texto</title>
	<link rel="stylesheet" href="estilo.css">
</head>
<body>
	
	<div class="wrapper">
		<form action="formatar-texto" method="post">		

			<textarea name="texto" placeholder="texto para formatar" class="texto" required>${texto}</textarea>
			
			<div class="buttons">
				<button name="format" value="upper" type="submit">MAI�SCULA</button>
				<button name="format" value="lower" type="submit">min�scula</button>
				<button name="format" value="firstupper" type="submit">Primeira Letra De Cada Palavra Em Maiuscula</button>
			</div>
		</form>
	</div>
</body>
</html>