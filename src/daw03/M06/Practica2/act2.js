function color() {
    let elemento = document.getElementById("input").value;
    document.getElementById("cuadrado").style.backgroundColor = elemento;
}

function seleccion() {
    let parentList = document.getElementById('llista');
    let listChildren = parentList.children;
    let elemento = document.getElementById("input").value;
    for (let i = 0; i < listChildren.length; i++) {
        console.log(listChildren[i]);
    }
}
