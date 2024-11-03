<?php

function cambiarNumeros(&$num1,&$num2){
    $aux=$num1;
    $num1=$num2;
    $num2=$aux;
}
$num1=7;
$num2= 10;
echo "El numero 1 es ".$num1.",y el numero 2 es ".$num2."<br>";

cambiarNumeros($num1,$num2);   
echo "El numero 1 es ".$num1.",y el numero 2 es ".$num2;

?>