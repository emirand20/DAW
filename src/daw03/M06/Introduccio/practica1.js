let inicio = 0;
function aumentar() { // se crean la funcion y se agrega al evento onclick en en la etiqueta button con id aumentar
    let cantidad = document.getElementById('cantidad').value = ++inicio; //se obtiene el valor del input, y se incrementa en 1 el valor que tenga.
}

function factorial(n) {
    let total = 1;
    for (i = 1; i <= n; i++) {
        total *= i;
    }
    return total;
}
function boto() {
    let n = document.getElementById('fact').valueAsNumber;
    let total = factorial(n);
    document.getElementById("num").innerHTML = total; //en el id num mostraremos la variable total ya creada
}

function letraDNI() {
    cadena = "TRWAGMYFPDXBNJZSQVHLCKET"
    posicion = formulario.dni.value % 23
    letra = cadena.substring(posicion, posicion + 1)
    document.formulario.dni.value = formulario.dni.value + " - " + letra
}
/*function letraDNI(dni) {
    let cadena = "TRWAGMYFPDXBNJZSQVHLCKET";
    let posicion = dni % 23;
    let letra = cadena.substring(posicion, posicion + 1);
    return dni + " - " + letra;
}*/
//document.write(letraDNI("35738881"));