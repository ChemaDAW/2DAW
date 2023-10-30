function ej9() {
    //Creamos la variable octal edimos el numero octal
    var numOctal = prompt("Introduce un numero en base 8");
    var decimalResultado = parseInt(numOctal, 8);
    var binarioResultado ="Base 2: "+ decimalResultado.toString(2);
    alert(decimalResultado);
    alert(binarioResultado);
}