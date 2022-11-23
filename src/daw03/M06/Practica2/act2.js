const colorSubrallado = "blue"
function color() {
    let elemento = document.getElementById('añadeColor').value;
    document.getElementById("cuadrado").style.backgroundColor = elemento;
}

function childColor() {
    // let numLista = document.getElementById("llista").children
    // numLista[2].style.backgroundColor = colorSubrallado;
    let numLista = document.getElementById("valor").value
    document.getElementById("llista").children[numLista].style.backgroundColor = colorSubrallado;

    // numLista.getElementsByTagName("div")[2].style.backgroundColor = colorSubrallado;
};

function reiniciar() {
    let num = document.getElementById("llista").children; //recorrer los hijos de la lista 
    for (let i = 0; i < num.length; i++) {
        document.getElementById("llista").children[i].style.backgroundColor = "white"; //en cada hijo añadimos un espacio blanco
    }
}

function minim() {
    let lista = document.getElementById("llista").children;
    let min = parseInt(lista[0].textContent);
    let index = 0;
    for (let i = 0; i < lista.length; i++) {
        if (parseInt(lista[i].textContent) < min) {
            min = parseInt(lista[i].textContent);
            index = i;
        }
    }
    lista[index].style.backgroundColor = colorSubrallado;
}

function maxim() {
    let lista = document.getElementById("llista").children;
    let max = parseInt(lista[0].textContent);
    let index = 0;
    for (let i = 0; i < lista.length; i++) {
        if (parseInt(lista[i].textContent) > max) {
            min = parseInt(lista[i].textContent);
            index = i;
        }
    }
    lista[index].style.backgroundColor = colorSubrallado;
}

// function minim() {
//     // Escoger todos los hijos del elemento lista por id
//     let minimolista = document.getElementById("llista").children;
//     let color = document.getElementsByTagName("div");
//     let min = 5000000; // Declarar un valor muy grande para calcular el minimo numero
//     let posLocal = 0; // Variable para almacenar la posicion 
//     // Bucle para recorrer la lista
//     for (let pos = 0; pos < minimolista.length; pos++) {
//         // Obtener todo el contenido del texto de la lista y convertirlo en entero
//         let texto = parseInt(minimolista[pos].innerHTML);
//         // Condicion para encontrar el numero mas pequeño del texto de la lista
//         if (texto <= min) {
//             // Obtener el numero mas pequeño
//             min = texto;
//             // Almacenar la posicion que esta
//             posLocal = pos;
//         }
//         if (color[pos].style.background == colorSubrallado) {
//             color[pos].style.background = "none";
//         }
//     }
//     console.log("Valor Minimo: " + min); // Mostrar el valor minimo por consola
//     minimolista[posLocal].style.background = colorSubrallado;
// }