function ej3() {
    var num1 = parseInt(prompt("Dime el primer numero"));
    var num2 = parseInt(prompt("Dime el segundo numero"));
    var num3 = parseInt(prompt("Dime el tercer numero"));
    var num4 = parseInt(prompt("Dime el cuarto numero"));

    if (!isNaN(num1) && !isNaN(num2) && !isNaN(num3) && !isNaN(num4)) {
        var suma=num1+num2+num3+num4;
        var producto=num1*num2*num3*num4;
        alert("La suma de los numeros es :" + suma);
        alert("El producto de los numeros es :" + producto);

    } else {
        alert('Por favor, introduce un numero valido');
    }
}