<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
        $dias = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"];
        foreach($dias as $indice => $valor){
            echo "Indice: $indice, Valor: $valor\n\n";
        }
        for($i=0;$i<count($dias);$i++){
            echo "Indice: $i,Valor: $dias[$i] ";
        }
    ?>
</body>

</html>