const lista = document.getElementsByTagName("div")
//crearemos un div que tenga un input checkbox y fuera del imput
function añadirInput() {
    let div = document.createElement("div")

    let checkbox = document.createElement("input")
    checkbox.setAttribute("type", "checkbox")

    checkbox.addEventListener('change', function (){
        let parent = checkbox.parentElement
        let child = parent.lastChild
        child.style.textDecoration = "line-through"
    })

    let añadirTarea = document.getElementById("input").value //conectamos el input 
    let nuevaTarea = document.createTextNode(añadirTarea)
    
    let span = document.createElement("span")
    span.appendChild(nuevaTarea)

    /*let button = document.createElement("button")
    let txt = document.createTextNode("x")
    button.appendChild(txt)

    button.addEventListener('click', function () { //funcion anonima
        div.style.display = "none"
    })*/

    if (añadirTarea === '') {
        alert("Añade una tarea");
    } else {
        div.appendChild(checkbox)
        document.getElementById("lista").appendChild(div).appendChild(span)
    }
    document.getElementById("input").value = ''
}

// function editList() {
//     document.getElementById("foo").disabled = true
//     //
// }
function updateItem() {
    //ERROR MUESTRA TACHA EL PRIMER ID
    for (let i = 0; i < lista.length; i++) {
        let checkbox = document.getElementById("myCheck")

        checkbox.addEventListener('click', function () {
            if (checkbox.checked = true) {
                lista[i] = document.getElementById("text").style.textDecoration = "line-through"
            }
        })
    }
}


function verTodosElementosLI() {
    //ha de retornar un la lista de los elementos originsles y añadidos
}