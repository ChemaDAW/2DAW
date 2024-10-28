<?php
function ej8($numero) {
    $total = 0;
    for ($i = 1; $i <= $numero; $i++) {
        $total += $i;
    }
    return $total;
}


echo ej8(5); 
?>
