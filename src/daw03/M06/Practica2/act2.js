// Ejercicio
function color() {
    let elemento = document.getElementById("input").value;
    document.getElementById("cuadrado").style.backgroundColor = elemento;
}

// Segundo Ejercicio
function childColor() {
    // Escoger el valor del numero que escribas en el input
    let num = document.getElementById("number").value;
    let color = document.getElementsByTagName("llista");
    // Cambiar el fondo del numero correspondiente a la lista.
    for (let i = 0; i < color.length; i++) {
        if (color[i].style.background == "red") {
            // Cambiar el fondo del numero correspondiente a la lista.
            color[i].style.background = "none";
        }
    }
    // Pintar el fondo del div por el numero correspondiente
    color[num].style.background = "red";
};

// Tercer Ejercicio
function reiniciar() {
    // Escoger el valor del numero que escribas en el input
    var num = document.getElementById("number").value;
    // Cambiar el fondo del numero correspondiente a la lista.
    var color = document.getElementById("llista").children[--num].style.background = "none";
}

// Cuarto Ejercicio (Valor Minimo)
function minim() {
    // Escoger todos los hijos del elemento lista por id
    let minimolista = document.getElementById("llista").children;
    let color = document.getElementsByTagName("div");
    let min = 5000000; // Declarar un valor muy grande para calcular el minimo numero
    let posLocal = 0; // Variable para almacenar la posicion 
    // Bucle para recorrer la lista
    for (let pos = 0; pos < minimolista.length; pos++) {
        // Obtener todo el contenido del texto de la lista y convertirlo en entero
        let texto = parseInt(minimolista[pos].innerHTML);
        // Condicion para encontrar el numero mas pequeño del texto de la lista
        if (texto <= min) {
            // Obtener el numero mas pequeño
            min = texto;
            // Almacenar la posicion que esta
            posLocal = pos;
        }
        if(color[pos].style.background == "red"){
            color[pos].style.background = "none";
        }
    }
    console.log("Valor Minimo: " + min); // Mostrar el valor minimo por consola
    //Pintar posicion mas pequeña de la lista
    minimolista[posLocal].style.background = "red";
}
// (Valor Maximo)
function maxim() {
    // Escoger todos los hijos del elemento lista por id
    let maximolista = document.getElementById("llista").children;
    let color = document.getElementsByTagName("div");
    let max = -1; // Declarar un valor muy pequeño para calcular el maximo numero
    let posLocal = 0; // Variable para almacenar la posicion 
    // Bucle para recorrer la lista
    for (let pos = 0; pos < maximolista.length; pos++) {
        // Obtener todo el contenido del texto de la lista y convertirlo en entero
        let texto = parseInt(maximolista[pos].innerHTML);
        // Condicion para encontrar el numero mas grande del texto de la lista
        if (texto >= max) {
            // Obtener el numero mas grande del texto de la lista
            max = texto;
            // Almacenar la posicion que esta
            posLocal = pos;
        }
        if(color[pos].style.background == "red"){
            color[pos].style.background = "none";
        }
    }
    console.log("Valor maximo: " + max);
}
