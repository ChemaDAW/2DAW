function ej6() {
    var radio = parseFloat(prompt("Dime el radio del circulo"));

      if (!isNaN(radio)) {
        var circunferencia = 2 * Math.PI * radio;
        var area = Math.PI * Math.pow(radio, 2);

        alert(circunferencia); // Redondear a 2 decimales
        alert(area).toFixed(2); // Redondear a 2 decimales
      } else {
        alert('Por favor, introduce un radio válido.');
      }
}