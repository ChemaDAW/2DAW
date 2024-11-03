<?php
function calcularMedia() {
    $cantidad = func_num_args(); 
    if ($cantidad === 0) {
        return 0; 
    }   
    $suma = array_sum(func_get_args());
    return $suma / $cantidad;
}
echo calcularMedia(4, 8, 15, 16, 23, 42); 
?>
