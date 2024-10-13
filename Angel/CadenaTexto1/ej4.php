<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 4</title>
</head>
<body>
	<?php
		$frase="Hola me llamo chema";
		print($frase);
		$primer_espacio = strpos($frase, ' ');
		$segundo_espacio = strpos($frase, ' ', $primer_espacio + 1);

		// Extraer las dos primeras palabras y mostrarlas con printf
		printf("Las dos primeras palabras son: %s", substr($frase, 0, $segundo_espacio));
	  ?>
</body>
</html>