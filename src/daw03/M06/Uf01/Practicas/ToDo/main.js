const { doc } = require("prettier")

const lista = document.getElementsByTagName('div')

//crearemos un div que tenga un input checkbox y fuera del imput
function añadirInput() {
    let div = document.createElement('div')

    let checkbox = document.createElement('input')
    checkbox.setAttribute('type', 'checkbox')

    checkbox.addEventListener('change', function (event) {
        let parent = checkbox.parentElement
        let child = parent.lastChild
        let child1 = parent.lastChild

        if (event.currentTarget.checked) {
            child.style.textDecoration = 'line-through'
            // let supr = document.createElement('input')
            // supr.setAttribute('type', 'checkbox')
        } else {
            child.style.textDecoration = 'none'
        }
    })

    let añadirTarea = document.getElementById('input').value //conectamos el input 
    let nuevaTarea = document.createTextNode(añadirTarea)

    let span = document.createElement('span')
    span.appendChild(nuevaTarea)

    if (añadirTarea === '') {
        alert('Añade una tarea');
    } else {
        div.appendChild(checkbox)
        document.getElementById('lista').appendChild(div).appendChild(span)
    }
    document.getElementById('input').value = ''
}

function verTodosElementosLI() {
    //ha de retornar un la lista de los elementos originsles y añadidos
}