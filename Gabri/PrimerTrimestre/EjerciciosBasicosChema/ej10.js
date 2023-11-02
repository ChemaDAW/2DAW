function ej10() {
    var numero = parseInt(prompt("Dime el numero"));
    var base = parseInt(prompt("Dime la base"));

    if (!isNaN(numero) && !isNaN(base)) {
      var resultado = numero.toString(base);
      alert(resultado);
    } else {
      alert('Por favor, introduce un número entero y una base válida.');
    }
}