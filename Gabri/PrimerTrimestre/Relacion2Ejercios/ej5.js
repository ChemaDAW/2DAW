function ej5() {
    var nota1 = parseInt(prompt("Dime la primera nota"));
    var nota2 = parseInt(prompt("Dime la segunda nota"));
    var nota3 = parseInt(prompt("Dime la tercera nota"));


    if (!isNaN(nota1) && !isNaN(nota2) && !isNaN(nota3)) {
        nota1 = nota1 + nota2 + nota3;
        nota1 /= 3;
        if (nota1 >= 7) {
            alert("Promocionado");
        }else{
            alert("No promocionas");
        }

    } else {
        alert('Por favor, introduce un numero valido.');
    }
}