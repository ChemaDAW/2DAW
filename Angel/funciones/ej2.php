<?php
function ej2($pais, $capital = "madrid", $habitantes = "muchos") {
    echo "La capital de $pais es $capital y tiene $habitantes habitantes.<br>";
}

ej2("España");
ej2("Portugal", "Lisboa");
ej2("Francia", "París", "6.000.000");
?>