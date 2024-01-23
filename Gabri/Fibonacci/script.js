function calcularFibonacci(num){
    if(num <= 1){
        return num;
    } else {
        return calcularFibonacci(num - 1) + calcularFibonacci(num - 2);
    }
}
var numero = fibonacci(10);
document.write(numero);