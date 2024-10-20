<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Ejercicio 1</title>
</head>
<body>
    <?php
        $cadena = "Hola";

        $relleno_inicio = str_pad($cadena, 20, '#', STR_PAD_LEFT);

        $relleno_final = str_pad($cadena, 20, '#', STR_PAD_RIGHT);

        $relleno_ambos = str_pad($cadena, 20, '#', STR_PAD_BOTH);

        echo "Relleno al inicio: $relleno_inicio\n";
        echo "Relleno al final: $relleno_final\n";
        echo "Relleno por ambos lados: $relleno_ambos\n";
    ?>

</body>
</html>