<?php
function ej3($dias){
    $dias*=24*60*60;
    return $dias;
}
$dias=5;
echo $dias." dias son ";
$dias=ej3($dias);

echo $dias;
echo " segundos";
?>