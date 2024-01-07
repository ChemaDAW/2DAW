function ej1(){
    var mes = new Date().getMonth()+1;
    if(mes<=4){
        alert("Esta en el primer cuatrimestre")
    }else if(mes<=8){
        alert("Esta en el segundo cuatrimestre")
    }else{
        alert("Esta en el tercer cuatrimestre")
    }
}
function ej2(){
    var numero=prompt("Dime un numero y te lo elevo al cubo")
    numero=Math.pow(numero,3);
    alert(numero)
}
function ej3(){
    var numero=prompt("Dime un numero y te dire su raiz cuadrada");
    var raizCuadrada=Math.sqrt(numero);
    alert(raizCuadrada);
}
function ej5(){
    var contador = 0;
    do {
        var nombre = prompt("Ingresa nombres");
        contador++;
        nombre = nombre.toLowerCase();
    } while (nombre !== 'fin');
    if(contador===1){
        alert("Introduce al menos un nombre");
    }else{
        alert("Has introducido " + contador-1 + " nombres");
    }
   
    
}
function ej4(){
    var contador = 0;
    do {
        var nombre = prompt("Ingresa nombres");
        contador++;
    } while (nombre !== 'Fin');
    if(contador===1){
        alert("Introduce al menos un nombre");
    }else{
        alert("Has introducido " + contador-1 + " nombres");
    }
}
function ej6(){
    var frase=prompt("Dime una frase o escribe un texto");
    var palabra=prompt("Dime la palabra a buscar en la frase");
    var n = frase.search(palabra);
    if(n===-1){
        alert("No se encuentra la palabra en la frase(texto)")
    }else{
        alert("Esta en la posicion "+n);
    }
}
function ej7(){
    var frase=prompt("Dime una frase o escribe una palabra");
    frase=frase.trim();
    var esPalindromo=true;
    for (var i = 0; i < frase.length / 2; i++) {
        if (frase.charAt(i) !== frase.charAt(frase.length - 1 - i)) {
            esPalindromo = false;
            break;  
        }
    }
    if(esPalindromo){
        alert("Es palindromo");
    }else{
        alert("No es palindromo");
    }
}
function ej8(){
    var frase = prompt("Ingrese una oración:");
    var palabras = frase.split(" ");
    for (var i = 0; i < palabras.length; i++) {
       alert(palabras[i]);
    }
}
function ej9(){
    var ancho = 600;
    var alto = 300;
    window.open('', '_blank', 'width=' + ancho + ', height=' + alto); 
}
function ej10(){
    var numeroRandom=Math.random()*3;
    numeroRandom=parseInt(numeroRandom);
    if(numeroRandom==0)
    window.location='http://www.hotmail.com';
    if(numeroRandom==1)
    window.location='https://www.google.com/?hl=es';
    if(numeroRandom==2)
    window.location='https://es.search.yahoo.com/?fr2=p:fprd,mkt:es';
}
function ej11(){
    var anchoMonitor = window.screen.width;
    var altoMonitor = window.screen.height;
    var anchoVentana = anchoMonitor;
    var altoVentana = altoMonitor / 2;
    window.open('', '_blank', 'width=' + anchoVentana + ', height=' + altoVentana);
}
function ej12(){
    document.cookie = "verificar_cookies=1";
    var cookiesActivas = document.cookie.indexOf("verificar_cookies=") != -1;
    document.cookie = "verificar_cookies=; expires=Thu, 01 Jan 1970 00:00:00 UTC; path=/;";
    if (cookiesActivas) {
      alert("Las cookies están activas en este navegador.");
    } else {
      alert("Las cookies no están activas en este navegador. Habilítalas para un mejor funcionamiento del sitio.");
    }
  }
