<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $paises=array("España"=>"Madrid","Francia"=>"Paris","Croacia"=>"xfganistan");
        foreach($paises as $pais => $capital){
            echo "La capital de $pais es $capital<br>";
        }
        ksort($paises);
        print_r($paises);
        echo "<br>";
        asort($paises);
        print_r($paises);

    ?>
</body>
</html>