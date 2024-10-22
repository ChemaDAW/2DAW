<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 1</title>
</head>
<body>
    <?php
     $cadena1 = "ies murgi";
     $cadena2 = "hola soy cehema";
     
     if ($cadena1 < $cadena2) {
         echo "Comparando toda la cadena: '$cadena1' es menor que '$cadena2'.\n";
     } elseif ($cadena1 > $cadena2) {
         echo "Comparando toda la cadena: '$cadena2' es menor que '$cadena1'.\n";
     } else {
         echo "Comparando toda la cadena: ambas cadenas son iguales.\n";
     }
     
     if (substr($cadena1, 0, 5) < substr($cadena2, 0, 5)) {
         echo "Comparando los primeros 5 caracteres: '$cadena1' es menor que '$cadena2'.\n";
     } elseif (substr($cadena1, 0, 5) > substr($cadena2, 0, 5)) {
         echo "Comparando los primeros 5 caracteres: '$cadena2' es menor que '$cadena1'.\n";
     } else {
         echo "Comparando los primeros 5 caracteres: ambas cadenas son iguales.\n";
     }
     
     if (strnatcmp($cadena1, $cadena2) < 0) {
         echo "Comparación natural: '$cadena1' es menor que '$cadena2'.\n";
     } elseif (strnatcmp($cadena1, $cadena2) > 0) {
         echo "Comparación natural: '$cadena2' es menor que '$cadena1'.\n";
     } else {
         echo "Comparación natural: ambas cadenas son iguales.\n";
     }
    ?>
</body>
</html>