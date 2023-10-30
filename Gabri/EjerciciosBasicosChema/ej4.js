function ej4() {
    var numero = parseFloat(prompt("Dime un numero"));

    if (!isNaN(numero)) {
      var doble = numero * 2;
      var triple = numero * 3;
      var cuadruple = numero * 4;

      var mensaje = "Número introducido: " + numero + "\n";
      mensaje += "Doble: " + doble + "\n";
      mensaje += "Triple: " + triple + "\n";
      mensaje += "Cuádruple: " + cuadruple;

      alert(mensaje);
    } else {
      alert('Por favor, introduce un número válido.');
    }
}