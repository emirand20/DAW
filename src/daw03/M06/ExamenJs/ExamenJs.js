// Ej 1
const coloret = document.getElementById('coloret')
let index = 0;
const colors = ['red', 'white'];
coloret.addEventListener('click', function onClick() {
    coloret.style.backgroundColor = colors[index];
    document.body.style.backgroundColor = colors[index]
    coloret.style.color = 'white';
    //Si index no es mayor a colores menos 1 sera 0 sino mas 1
    index = index >= colors.length - 1 ? 0 : index + 1;
});

// Ej 2
function coloret2() {
    const coloret2 = document.getElementById('coloret2');
    coloret2.addEventListener('click', function onClick() {
        coloret2.style.backgroundColor = colors[index];
        document.body.style.backgroundColor = colors[index]
        coloret2.style.color = 'white';
        index = index >= colors.length - 1 ? 0 : index + 1;
    });
}
// Ej 3
function factorial(n) {
    let total = 1;
    for (i = 1; i <= n; i++) {
        total *= i;
    }
    return total;
}
function multiplicacion() {
    let n = document.getElementById('fact').valueAsNumber;
    let total = factorial(n);
    document.getElementById("num").innerHTML = total; //en el id num mostraremos la variable total ya creada
}

// Ej 4
function mitjanaImparells(){
    console.log('Ejercicio 4')
    let numeros = [3, 5, 6, 4, 7, 1]
    let impares = []
    let sumImpares = 0
    let mediaImpares;
    for (let i = 0; i < numeros.length; i++) {
        if ((numeros[i] % 2) !== 0) {
            impares.push(numeros[i])
        }
    }
    for (let i = 0; i < impares.length; i++) {
        sumImpares += impares[i]
    }
    mediaImpares = sumImpares / impares.length
    console.log("La media es: " + mediaImpares)
}