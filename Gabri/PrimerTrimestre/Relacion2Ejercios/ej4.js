function ej4() {
    var precioArticulo = parseInt(prompt("Dime lo que cuesta el articulo"));
    var dineroCliente = parseInt(prompt("Dime el dinero que llevas"));


    if (!isNaN(precioArticulo) && !isNaN(dineroCliente) && dineroCliente > precioArticulo) {
        var devolucion = dineroCliente - precioArticulo;
        alert("Tiene que pagar " + precioArticulo + " y le sobran " + devolucion);
    } else {
        alert('Por favor, introduce un numero valido,o no te llega el dinero');
    }
}