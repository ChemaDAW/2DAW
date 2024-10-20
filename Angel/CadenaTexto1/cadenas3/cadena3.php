<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 1</title>
</head>
<body>
    <?php
        $cadena="hola soy chema";
       if (preg_match('/[aeiou]/', $cadena)) {
        echo "La cadena contiene al menos una vocal.";
    } else {
        echo "La cadena no contiene ninguna vocal.";
    }
    ?>
</body>
</html>