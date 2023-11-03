function ej9() {
    do {
        var num1 = parseInt(prompt("Dime el numero de uno o dos cifras"));
    } while (num1 > 99 || num1 < 0);

    if (!isNaN(num1)) {
        if (num1 >= 10) {
            alert("Tiene dos cifras");
        } else {
            alert("Tiene una cifra");
        }

    } else {
        alert('Por favor, introduce un numero valido.');
    }
}