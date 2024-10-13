<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 7</title>
</head>
<body>
	<?php 
		$posicion=0;
		$frase="Hola me llamo chema";
		$longitudFrase=strlen($frase);
		while($posicion<$longitudFrase){
			print($frase[$posicion]);
			print($frase[$posicion]);
			$posicion++;
		}
	 ?>
</body>
</html>