<?php
require_once 'config/config.php';
require_once 'helpers/funciones.php';
//verifica si la url contiene la palabra admin
$isAdmin = strpos($_SERVER['REQUEST_URI'], '/' . ADMIN) !== false;
//comprobnar si existe get para crear rutas amigables
$ruta = empty($_GET['url']) ? 'principal/index' : $_GET['url'];
//crear array a partir de la url
$array = explode('/', $ruta);



if (
    $isAdmin && (count($array) == 1
        || (count($array) == 2  && empty($array[1])))
    && $array[0] == ADMIN
) {
    //Crear controlador
    $controller = 'admin';
    $metodo = 'login';
} else {
    $indiceUrl = ($isAdmin) ? 1 : 0;
    $controller = ucfirst($array[$indiceUrl]);
    $metodo = 'index';
}
//Validar metodos
$metodoIndice = ($isAdmin) ? 2 : 1;
if (!empty($array[$metodoIndice]) && $array[$metodoIndice] != '') {
    $metodo = $array[$metodoIndice];
}
//validar metodos
$parametro = '';
$parametroIndice = ($isAdmin) ? 3 : 2;
if (!empty($array[$parametroIndice]) && $array[$parametroIndice] != '') {
    for ($i = $parametroIndice; $i < count($array); $i++) {
        $parametro .= $array[$i] . ',';
    }
    $parametro = trim($parametro, ',');
}
//Llamar autoload
require_once 'config/app/Autoload.php';
//Validar Directorio contro lador
$dirControllers = ($isAdmin) ? 'controllers/admin/' . $controller . '.php' : 'controllers/principal/' . $controller . '.php';
if(file_exists($dirControllers)){
    require_once $dirControllers;
    $controller = new $controller();
    if(method_exists($controller, $metodo)){
        $controller->$metodo($parametro);
    }else{
        echo 'Metodo no existe';
    }
}else{
    echo 'Controlador no existe';
}
?>