function ej3() {
    var nombre = prompt("Dime tu nombre");
    var edad = parseFloat(prompt("Dime tu edad"));

    if (!isNaN(edad) && nombre.trim() !== "") {
      var diasVividos = edad * 365;
      var resultado = nombre + ', has vivido ' + diasVividos + ' días hasta el momento.';
      alert(resultado);
    } else {
      alert('Por favor, introduce un nombre y una edad válida.');
    }
}