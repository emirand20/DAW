function createPlayer() {
    let body = document.getElementsByTagName("body")[0];
    let tabla = document.createElement("table");
    let tblBody = document.createElement("tbody");

    let fila = document.createElement("tr");
    let columna = document.createElement("td");

    let NamePlayer = document.getElementById("inputName").value
    let tagNamePlayer = document.getElementById("players")
    let Name = document.createTextNode(NamePlayer)

    columna.appendChild(Name);
    fila.appendChild(columna);

    tblBody.appendChild(fila);

    // posiciona el <tbody> debajo del elemento <table>
    tabla.appendChild(tblBody);
    // appends <table> into <body>
    body.appendChild(tabla);
    tabla.setAttribute("border", "1");
    tabla.setAttribute("style", "width:25%")
}

function createScore() {

}

function createScoreBoard() {

}