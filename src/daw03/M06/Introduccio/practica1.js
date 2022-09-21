var inicio = 0;
function aumentar() { // se crean la funcion y se agrega al evento onclick en en la etiqueta button con id aumentar
    var cantidad = document.getElementById('cantidad').value = ++inicio; //se obtiene el valor del input, y se incrementa en 1 el valor que tenga.
}

function factorial(n) {
    var total = 1;
    for (i = 1; i <= n; i++) {
        total = total * i;
    }
    return total;
}
function boto() {
    var n = document.getElementById('fact').valueAsNumber;
    let total = factorial(n);
    document.getElementById("num").innerHTML = total; //innerHTLM mostrara cadenas en cambio value el numero.
}

function letraDNI() {
    cadena = "TRWAGMYFPDXBNJZSQVHLCKET"
    posicion = formulario.dni.value % 23
    letra = cadena.substring(posicion, posicion + 1)
    document.formulario.dni.value = formulario.dni.value + " - " + letra
}
/*function letraDNI(dni) {
    var cadena = "TRWAGMYFPDXBNJZSQVHLCKET";
    var posicion = dni % 23;
    var letra = cadena.substring(posicion, posicion + 1);
    return dni + " - " + letra;
}*/
//document.write(letraDNI("35738881"));