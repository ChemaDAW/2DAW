function ej8() {
     // Obtener el número entero introducido por el usuario
     var numero = parseInt(prompt("Introduce un numero entero"));
     //Base 16(Convertir)
     var  base1 = numero.toString(16);
     //Base 5(Convertir)
     var  base2 = numero.toString(5);
     // Creamos variables para mostrar los numeros
     var resultadoNumero = "Número introducido: " + numero;
     var resultadoContadores = "Numero en base 16: " + base1 + "\tNumero en base 5: " + base2;

     alert(resultadoNumero);
     alert(resultadoContadores);
}