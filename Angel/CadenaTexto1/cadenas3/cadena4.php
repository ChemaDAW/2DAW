<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 1</title>
</head>
<body>
    <?php
        $cadena = "sOy Soy Chema";

        $cadena_modificada = str_replace(
            ['a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'],  
            ['A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u'],  
            $cadena
        );
        
        echo $cadena_modificada;
    ?>
</body>
</html>