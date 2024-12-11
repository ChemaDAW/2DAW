<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
    $colores = [
        "Fuerte" => [
            "Rojo:FF0000 ",
            "Verde:00FF00",
            "Azul: 0000FF"
        ],
        "Suave" => [
            "Rosa:FE9ABC",
            "Amarillo:FDF189 ",
            "Malva:BC8F8F"
        ]
    ];
    foreach ($colores as $fila) {
        foreach ($fila as $valor) {
            echo $valor;
        }
        echo "<br>";
    }
    var_dump($colores["Suave"]);
    ;

    ?>
</body>

</html>