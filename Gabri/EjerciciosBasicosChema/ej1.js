function ej1() {
    var num1 = parseFloat(prompt("Introduce un numero"));
    var num2 = parseFloat(prompt("Introduce un numero"));

    if (!isNaN(num1) && !isNaN(num2)) {
      var resultado = num1 - num2;
      alert(resultado);
    } else {
      alert('Por favor, introduce dos números válidos.');
    }

    var cadena1 = prompt("Introduce un texto");
    var cadena2 = prompt("Introduce un texto para juntarlo");
    var resultado= cadena1-cadena2;
   
    alert(resultado);
   
}