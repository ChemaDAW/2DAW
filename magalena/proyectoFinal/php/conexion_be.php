<?php

    $conexion= mysqli_connect("localhost","root","","login_Register_db");

    if($conexion){
        echo 'Conectado exitosamente a la Base de Datos';
    }else{
        echo 'No se ha conectado a la Base de Datos';
    }

?>