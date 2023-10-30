function ej13() {
    var numeros = [];
    var numero;
    var contador = 0;

    while (true) {
        numero = parseInt(prompt("Introduce un número (9999 para finalizar):"));
        
        if (numero === 9999) {
            break;
        }

        if (!isNaN(numero)) {
            numeros.push(numero);
            contador++;
        } else {
            alert("Por favor, introduce un número válido.");
        }
    }

    alert("Número de números introducidos (excluyendo el 9999): " + contador);
}