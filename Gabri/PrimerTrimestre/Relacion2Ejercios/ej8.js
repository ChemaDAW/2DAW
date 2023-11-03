function ej8() {
    var nota1 = parseInt(prompt("Dime la primera nota"));
    var nota2 = parseInt(prompt("Dime la segunda nota"));
    var nota3 = parseInt(prompt("Dime la tercera nota"));


    if (!isNaN(nota1) && !isNaN(nota2) && !isNaN(nota3)) {
        nota1 = nota1 + nota2 + nota3;
        nota1 /= 3;
        if (nota1 >= 4) {
            alert("Regular");
        }else{
            alert("Reprobado");
        }

    } else {
        alert('Por favor, introduce un numero valido.');
    }
}