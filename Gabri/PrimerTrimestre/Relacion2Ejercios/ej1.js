function ej1() {
    var lado = parseInt(prompt("Dime el lado del cuadrado"));

    if (!isNaN(lado)) {
      var perimetro = lado *4;
      alert("El perimetro del cuadrado es: "+perimetro);
    } else {
      alert('Por favor, introduce un numero valido');} 
}