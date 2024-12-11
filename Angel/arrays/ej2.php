<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
        $lista=["Jose","Maria","Fran","Juan","Gitano"];
        $array1=array_slice($lista,0,3);
        $array2=array_splice($lista,-2,2);
        var_dump($array1);
        echo "<br>";
        var_dump($array2);
        echo "<br>";
        var_dump($lista);
    ?>
</body>
</html>