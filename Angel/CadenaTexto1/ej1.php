<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 1</title>
</head>
<body>
	<?php 
		$palabra1="abeja";
		$palabra2="ovejo";
		$letra1=substr($palabra1, -3);
		$letra2=substr($palabra2,-3);
		if($letra1==$letra2){
			echo("Las palabras riman");
		}else{
			echo("Las palabras no riman");
		}
	 ?>
</body>
</html>