<?php
function calcularMedia(...$numeros) {
    $suma = 0;
    $cantidad = 0;

    foreach ($numeros as $numero) {
        $suma += $numero;
        $cantidad++;
    }

    return $suma / $cantidad ;
}

// Ejemplo de uso
echo calcularMedia(4, 8, 15, 16, 23, 42); 
?>
