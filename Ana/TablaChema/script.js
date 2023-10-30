 //Hecho por jose maria fdez garzon
 //tabla de multiplicar del 7 
 let tablaMultiplicar7 = "tabla de multiplicar del 7:\n";//titulo
 let i = 1; //inicializamos el contador
 while (i <= 10) {
    tablaMultiplicar7 += '7 x ' + i + ' = ' + (7 * i) + '\n';
    i++;//incrementamos el contador//incrementamos el contador
 }
 document.getElementById("tablaMultiplicar7").textContent = tablaMultiplicar7;

 // tabla de sumar del 8 
 let tablaSumar8 = "tabla de sumar del 8:\n";//titulo
 let j = 1; //inicializamos el contador
 do {
    tablaSumar8 += '8 + ' + j + ' = ' + (8 + j) + '\n';
    j++;//incrementamos el contador
 } while (j <= 10);
 document.getElementById("tablaSumar8").textContent = tablaSumar8;

 // tabla de dividir del 9 
 let tablaDividir9 = "tabla de dividir del 9:\n";//titulo
 for (let k = 1; k <= 10; k++) {
    tablaDividir9 += '9 / ' + k + ' = ' + (9 / k) + '\n';
}
 document.getElementById("tablaDividir9").textContent = tablaDividir9;
  
 // Operaciones de desplazamiento de bits
  let operacionesDesplazamientoBits = "operaciones de Desplazamiento de Bits:\n";//titulo
  operacionesDesplazamientoBits += "125 / 8 = " + (125 >> 3) + "\n";
  operacionesDesplazamientoBits += "40 x 4 = " + (40 << 2) + "\n";
  operacionesDesplazamientoBits += "25 / 2 = " + (25 >> 1) + "\n";
  operacionesDesplazamientoBits += "10 x 16 = " + (10 << 4) + "\n";
  document.getElementById("operacionesDesplazamientoBits").textContent = operacionesDesplazamientoBits;