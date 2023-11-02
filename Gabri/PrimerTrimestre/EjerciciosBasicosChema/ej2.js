function ej2() {
    var dividendo = parseFloat(prompt("Dime el primer numero"));
    var divisor = parseFloat(prompt("Dime el segundo numero"));

    if (!isNaN(dividendo) && !isNaN(divisor)) {
        if (divisor !== 0) {
            var resultado = dividendo / divisor;
           alert(resultado);
        } else {
            alert('No puedes dividir por cero. Por favor, introduce un divisor diferente de 0.');
        }
    } else {
        alert('Por favor, introduce dos números válidos para dividir.');
    }
}