<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Ejercicio 5</title>
</head>
<body>
    <?php 
        $frase = "Hola me llamo Chema";
        $posicion = 0;
        $contador = 0;

        while (($posicion = strpos($frase, 'a', $posicion)) == true) {
            $contador++;
            $posicion++; 
        }

        echo "Hay " . $contador;
    ?>
</body>
</html>
