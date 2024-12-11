<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
    $valores = [];
    for ($i = 0; $i < 10; $i++) {
        $valores[] = rand(1, 10); // Genera un número aleatorio entre 1 y 10
    }

    // Mostrar el array generado
    echo "Array generado: ";
    print_r($valores);

    // Contar cuántos valores son iguales a 2
    $contador = 0;
    foreach ($valores as $valor) {
        if ($valor == 2) {
            $contador++;
        }
    }

    // Mostrar el número de valores iguales a 2
    echo "\nNúmero de valores iguales a 2: $contador";
    ?>
    
</body>

</html>