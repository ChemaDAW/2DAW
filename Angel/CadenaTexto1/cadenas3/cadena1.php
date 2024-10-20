<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 1</title>
</head>
<body>
	<?php 
		$frase="hola me llamo chema";
        $palabras = explode(" ", $frase);
        $ultima=end($palabras);
        echo $ultima;
	 ?>
</body>
</html>