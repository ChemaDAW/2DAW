//Inicializamos variables
var lado1=0,lado2=0,lado3=0;
var contador=1;
var equilatero=0,isosceles=0,escaleno=0;
//Hacemos un bucles para controlar que se introduzca 4 veces
do {
    //Le pedimos los lados al usuario
    lado1=prompt("Dime el lado 1 del triangulo "+contador);
    lado2=prompt("Dime el lado 2 del triangulo "+contador);
    lado3=prompt("Dime el lado 3 del triangulo "+contador);
    //Comprabamos que sea un numero
    if (isNaN(lado1) || isNaN(lado2) || isNaN(lado3)) {
              alert("Un lado no es un numero repitalo")
    }else{
        //Sumamos el contador para el bucle
        contador++; 
        //Aqui comprobamos que tipo de triangulo es segun los lados
        //Si es equilatero
        if(lado1==lado2&&lado1==lado3){
            equilatero++;
        }
        //Si es equilatero
        else if(lado1!=lado2&&lado1!=lado3&&lado2!=lado3){
            escaleno++;
        //Y por ultimo si es isosceles
        }else
            isosceles++;
    }

} while (contador<=4);//Fin del bucle
alert("El usuario a introducido estos triangulos: \nEquilatero: "+equilatero+"\nEscaleno: "+escaleno+"\nIsosceles: "+isosceles);
//Aqui comprobamos que triangulo se ha introducido en menor cantidad
//Aqui comprobamos si es equilatero es el que menos se ha introducido
if(equilatero<escaleno&&equilatero<isosceles){
    alert("El triangulo que menos se ha introducido es el equilatero");
}
//Aqui comprobamos si es escaleno es el que menos se ha introducido
else if(escaleno<equilatero&&escaleno<isosceles){
    alert("El triangulo que menos se ha introducido es el escaleno");
}
//Aqui comprobamos si es isosceles es el que menos se ha introducido
else if(isosceles<equilatero&&isosceles<escaleno){
    alert("El triangulo que menos se ha introducido es el isosceles");
}
else{//Si no hay ningun menor de los triangulos porque,hay la misma cantidad se le indica al usuario
    alert("No hay menor de los triangulos,unos de los triangulos tienen la misma cantidad");
}


