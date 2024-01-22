//Creador de variables
        var ventana;
        var ventana1;
        var ventana2;
        var ventana3;
        var opcion1;
        var opcion2;
        var vector = new Array();
        var vector1 = new Array();
        var vectorImpar = new Array();
        var contrasenaNueva="No se ha cambiado";
        var hora;
        var minuto;
//Ventana 1
function ventanaa1() {
    //Abrimos la ventana
    ventana = window.open("", "Ventana1", "width=300,height=300");
    var nombre=ventana.prompt("Dime el usuario");
    var contrasena=ventana.prompt("Dime la contraseña");
    //Cremos una clase/objeto usuario
    class Usuario {
        constructor(nombre, contrasena) {
            this.nombre = nombre;
            this.contrasena = contrasena;
        }
    }
    //Aqui creamos el objeto usuario que esta el usuario y la contraseña que introduzce el usuario
    var usuario=new Usuario(nombre,contrasena);
    //Comprobacion si la contraseña y el usuario es correcto
    if(usuario.nombre=="alumno"){
        if(usuario.contrasena=="bueno"){
            ventana.alert("Datos correctos, ¿Deseas cambiar la contraseña?")
            contrasenaNueva=ventana.prompt("Dime la contraseña nueva");
            usuario.contrasena=contrasenaNueva;
            ventana.alert("Contraseña cambiada con exito")
            //Cogemos horas y minutos
            var fechaActual = new Date();
            hora = fechaActual.getHours();
            minuto = fechaActual.getMinutes();
        //los dos else por si alguno de los dos es erroneo
        }else{
            ventana.document.write("Datos incorrectos ¿Quieres intentarlo de nuevo?")
        }
    }else{
        ventana.document.write("Datos incorrectos ¿Quieres intentarlo de nuevo?")
    }

    
}
//Ventana 2
function ventanaa2() {
    ventana1 = window.open("", "Ventana2", "width=150,height=150");
    //Cogemos las opciones del html
    opcion1 = document.getElementById("seleccion").value;
    opcion2 = document.getElementById("seleccion1").value;

    for (var i = 0; i < opcion1; i++) {
        vector[i] = i + 1;
    }
    //Escrimos todos los numeros 
    ventana1.document.write("Total de numeros");
    for (var i = 0; i < vector.length; i++) {
        ventana1.document.write(vector[i] + "\t");
    }
    //Escribimos los numeros aleatorios
    ventana1.document.write("Numeros aleatorios:")
    for (var i = 0; i < opcion2; i++) {
        var random = Math.round(Math.random() * (opcion1 - 1) + 1);
        vector1[i] = vector[random];
        ventana1.document.write(vector[random] + "\t");
    }
}
//Ventana 3
function ventanaa3() {
    ventana2 = window.open("", "Ventana3", "width=300,height=300");
    var contador = 0;
    //Cogemos el array de los aleatorios y cogemos solo los impares y los añadimos al array
    for (var i = 0; i < vector1.length; i++) {
        if (vector1[i] % 2 != 0) {
            vectorImpar[contador] = vector1[i]; 
            contador++;
        }
    }
    //Ordenamos de menor a mayor
    vectorImpar.sort(function (a, b) { return a - b });
    //Escribimos los pares ordenados
    for (var i = 0; i < vectorImpar.length; i++) {
        ventana2.document.write(vectorImpar[i] + "\t");
    }
}

//Ventana 4
function ventanaa4(){
    ventana3 = window.open("", "Ventana4", "width=300,height=300");
    //Escrimos la contraseña nueva
    ventana3.document.write("La contraseña nueva es "+contrasenaNueva+"\n");
    //Escribimos la hora y minutos
    ventana3.document.write("Se ha cambiado a las "+hora+":"+minuto);

}
//METODOS PARA CERRAR VENTANAS
function cerrarVentana1(){
    ventana.close();
}
function cerrarVentana2(){
    ventana1.close();
}
function cerrarVentana3(){
    ventana2.close();
}
function cerrarVentana4(){
    ventana3.close();
}


