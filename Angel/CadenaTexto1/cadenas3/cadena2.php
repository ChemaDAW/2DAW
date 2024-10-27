<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 1</title>
</head>
<body>
    <?php
        $email = "josemaria@gmail.com";
        list($usuario, $dominio) = explode('@', strtolower($email));
        echo "Usuario: $usuario\n";
        echo "Dominio: $dominio";
    ?>
</body>
</html>