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