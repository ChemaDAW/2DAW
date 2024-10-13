<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 3</title>
</head>
<body>
	<?php
    $nombre="Chema";
        if (strlen($nombre) < 3 || strlen($nombre) > 20) {
            echo "El nombre de usuario debe tener entre 3 y 20 caracteres.";
        }
        else if (!preg_match('/^[a-zA-Z0-9_-]+$/', $nombre)) {
            echo "El nombre de usuario solo puede contener letras, números, guión alto y guión bajo.";
        }
        else "El nombre de usuario es válido.";
	  ?>
</body>
</html>