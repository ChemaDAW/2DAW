function ej7() {
    var num1 = parseInt(prompt("Dime el primer numero"));
    var num2 = parseInt(prompt("Dime el segundo numero"));

    if (!isNaN(num1) && !isNaN(num2)) {
        if (num1 > num2) {
            num1 += num2;
            alert("La suma de los dos es " + num1);
        } else {
            var producto = num1 * num2;
            var division = num2 / num1;
            alert("El producto es " + producto + " y la division es " + division);
        }

    } else {
        alert('Por favor, introduce un numero valido.');
    }
}