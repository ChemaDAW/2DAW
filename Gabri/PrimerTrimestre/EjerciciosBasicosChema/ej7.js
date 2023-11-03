function ej7() {
     // Obtener el número introducido por el usuario
     var numero = parseInt(prompt("Introduce un numero"));

     // Inicializar los contadores
     var contador1 = numero + 5;
     var contador2 = contador1 + 21;
     var contador3 = contador2 - 4;

     // Mostrar los resultados en la página
     var resultadoNumero = "Número introducido: " + numero;
     var resultadoContadores = "Contadores: " + contador1 + "\t" + contador2 + "\t" + contador3;

     alert(resultadoNumero);
     alert(resultadoContadores);
}