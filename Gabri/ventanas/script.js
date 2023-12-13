var parametros = "width=400, height=300, left=200, top=150, resizable=no, menubar=no, toolbar=no, directories=no, location=no, scrollbars=no, status=no";
var ventana;

function abrirVentana() {
   ventana = window.open("texto_de_secundaria_2.htm", "ventana", parametros);
}

function pedirCoordenadas() {
   if (ventana && !ventana.closed) {
      const x = ventana.screenX;
      const y = ventana.screenY;

      const nuevasX = prompt('Ingrese la nueva coordenada X:', x);
      const nuevasY = prompt('Ingrese la nueva coordenada Y:', y);

      ventana.moveTo(nuevasX,nuevasY);
   } else {
      alert('La ventana secundaria no está abierta.');
   }
}
function aplicarColor() {
   const select = document.getElementById("colores");
   const colorSeleccionado = select.value;
   ventana.document.body.style.backgroundColor = colorSeleccionado;
}
function cerrarVentanaTiempo(){
   var tiempo = prompt("Ingresa la cantidad de segundos para que la ventana esté activa:");
   tiempo*=1000;
   setTimeout("ventana.close()",tiempo);
}
function focusVentana() {
   ventana.focus();
}
function blurVentana(){
   ventana.blur();
}
function escrbirTexto() {
   var texto = prompt("Ingresa el texto que quieres que aparezca en la ventana secundaria:");
   ventana.document.write('<p>' + texto + '</p>');
}
var x; // Variable global para el intervalo
function actualizarContador(duracion) {
var horaFinal = new Date().getTime() + duracion * 1000;
x = setInterval(function() {
var horaActual = new Date().getTime();
var distancia = horaFinal - horaActual;
var dias = Math.floor(distancia / (1000 * 60 * 60 * 24));//Redondeamos convirtiendo a milisegundos
var horas = Math.floor((distancia % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));//Redondeamos convirtiendo a milisegundos
var minutos = Math.floor((distancia % (1000 * 60 * 60)) / (1000 * 60));//Redondeamos convirtiendo a milisegundos
var segundos = Math.floor((distancia % (1000 * 60)) / 1000);//Redondeamos convirtiendo a milisegundos
document.getElementById("countdown").innerHTML = dias + horas + minutos +segundos;
if (distancia < 0) {//Poner a 0 cuando llega a 0 y mostrar una alerta por pantalla
    clearInterval(x);
    document.getElementById("countdown").innerHTML = "0h 0m 0s";
    window.alert("Fin boom al lio");
}
}, 1000);
}
function configurarCuentaRegresiva() {
//Asociamos los datos introducidos con las variables
//Convertimos a enteros para poder operar con ellas
var horas = parseInt(document.getElementById("horas").value) || 0;
var minutos = parseInt(document.getElementById("minutos").value) || 0;
var segundos = parseInt(document.getElementById("segundos").value) || 0;
//Convertimos a segundos
var duracion = (horas * 3600) + (minutos * 60) + segundos;
//Mostrar mensaje si la cantidad no es válida
if (duracion > 0) {
    clearInterval(x);
actualizarContador(duracion);
 } else {
    alert("Por favor, introduce una duración válida.");
}
}vc
