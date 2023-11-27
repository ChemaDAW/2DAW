// Obtenemos una referencia al elemento HTML con id "caja"
var caja = document.getElementById("caja");

// Establecemos el límite de filas en el rombo
var limite = 4;

// Creamos la mitad superior del rombo (creciendo desde arriba hacia el centro)
for (var i = 0; i < limite; i++) {
    var asterisco = "";  // Cadena para almacenar asteriscos
    var espacioHTML = "";  // Cadena para almacenar espacios (para centrar)

    // Agregamos espacios a la izquierda para centrar los asteriscos
    for (var k = 0; k < limite - i - 1; k++) {
        espacioHTML += "&nbsp;&nbsp;";
    }

    // Agregamos asteriscos para formar una fila del rombo
    for (var j = 1; j <= 2 * i + 1; j++) {
        asterisco += "*";
    }

    // Actualizamos el contenido HTML con la fila que contiene espacios y asteriscos
    caja.innerHTML = caja.innerHTML + espacioHTML + asterisco + "<br>";
}

// Creamos la mitad inferior del rombo (simétrica a la mitad superior)
for (var i = limite - 2; i >= 0; i--) {
    var asterisco = "";  // Cadena para almacenar asteriscos
    var espacioHTML = "";  // Cadena para almacenar espacios (para centrar)

    // Agregamos espacios a la izquierda para centrar los asteriscos
    for (var k = 0; k < limite - i - 1; k++) {
        espacioHTML += "&nbsp;&nbsp;";
    }

    // Agregamos asteriscos para formar una fila del rombo
    for (var j = 1; j <= 2 * i + 1; j++) {
        asterisco += "*";
    }

    // Actualizamos el contenido HTML con la fila que contiene espacios y asteriscos
    caja.innerHTML = caja.innerHTML + espacioHTML + asterisco + "<br>";
}