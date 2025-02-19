<?php

include 'conexion_be.php';

$correo = $_POST['correo'];
$contrasena = $_POST['contrasena'];

$query = "INSERT INTO usuarios(correo,contrasena)
                VALUES('$correo','$contrasena')";

$verificar_correo = mysqli_query($conexion, "SELECT * FROM usuarios WHERE correo='$correo'");

if (mysqli_num_rows($verificar_correo) > 0) {
    echo '
            <script>
                alert("Este correo ya esta registrado,registrate con otro");
                window.location = "../html/index.html";
            </script>
        ';
        exit();
} 

$ejecutar = mysqli_query($conexion, $query);

if ($ejecutar) {
    echo '
            <script>
                alert("Usuario almacenado exitosamente");
                window.location = "../html/index.html";
            </script>
        ';
} else {
    echo '
        <script>
            alert("Intentalo de nuevo");
            window.location = "../html/index.html";
        </script>
    ';
}

mysqli_close($conexion);
?>