<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $pila = array("cinco" => 5, "uno"=>1, "cuatro"=>4, "dos"=>2, "tres"=>3);
        asort($pila);
        echo "\nOrdenado por valor (ascendente) [asort]:\n";
        print_r($pila);

    ?>
</body>
</html>