function createScoreBoard() {
    let body = document.getElementsByTagName("body")[0];

    let tabla   = document.createElement("table");
    let tblBody = document.createElement("tbody");
    
    let ScorePlayer = document.getElementById("inputScore").value
    let Score = document.createTextNode(ScorePlayer)
    
    // Crea las columnas
    for (let i = 0; i < 1; i++) {
        // Crea las fila de la tabla
        let fila = document.createElement("tr");
        
        for (let j = 0; j < 2; j++) {
            // Crea un elemento <td> y un nodo de texto, haz que el nodo de
            // texto sea el contenido de <td>, ubica el elemento <td> al final
            // de la fila de la tabla
            let columna = document.createElement("td");
            let NamePlayer = document.getElementById("inputName").value
            let Name = document.createTextNode(NamePlayer)
            columna.appendChild(Name);
            fila.appendChild(columna);
        }
        // agrega la fila al final de la tabla (al final del elemento tblbody)
        tblBody.appendChild(fila);
    }
    // posiciona el <tbody> debajo del elemento <table>
    tabla.appendChild(tblBody);
    // appends <table> into <body>
    body.appendChild(tabla);
    // modifica el atributo "border" de la tabla y lo fija a "2";
    tabla.setAttribute("border", "1");
    tabla.setAttribute("style", "width:100%")
}