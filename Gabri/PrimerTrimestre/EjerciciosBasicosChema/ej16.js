function ej16() {
    var multiples = [];
    var suma = 0;

    for (var i = 1; i <= 1000; i++) {
      if (i % 23 === 0) {
        multiples.push(i);
        suma += i;
      }
    }

    alert(multiples);
    alert(suma);
}