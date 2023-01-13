const lista = document.getElementsByTagName('div')

//crearemos un div que tenga un input checkbox y fuera del imput
function añadirInput() {
    let div = document.createElement('div')

    let checkbox = document.createElement('input')
    checkbox.setAttribute('type', 'checkbox')

    let span = document.createElement('span')

    checkbox.addEventListener('change', function (event) {
        if (event.currentTarget.checked) {
            span.classList.add('checked')
        } else {
            span.classList.remove('checked')
        }
    })

    let añadirTarea = document.getElementById('input').value //conectamos el input 
    let nuevaTarea = document.createTextNode(añadirTarea)
    span.appendChild(nuevaTarea)

    let button = document.createElement("button")

    const addClass = () => div.classList.add('eliminaTarea')
    button.addEventListener('click', addClass)

    let boton_toggle = document.getElementById("elimina")

    if (boton_toggle.classList.contains('is-hidden')) {
        button.classList.add('hidden');
    }

    button.classList.add('boton_borrar');
    let txt = document.createTextNode(" \u00D7")
    button.appendChild(txt)

    if (div.classList.contains('')) {
        div.classList.add('eliminaTarea')
    }

    if (añadirTarea === '') {
        alert('Añade una tarea');
    } else {
        div.appendChild(checkbox)
        div.appendChild(span)
        div.appendChild(button)
        document.getElementById('lista').appendChild(div)

    }
    document.getElementById('input').value = ''
}

function editarList() {
    let boton_toggle = document.getElementById("elimina")

    if (boton_toggle.classList.contains('is-hidden')) {
        boton_toggle.classList.remove('is-hidden')
    } else {
        boton_toggle.classList.add('is-hidden')
    }

    let botones = document.getElementsByClassName('boton_borrar')
    for (let i = 0; i < botones.length; i++) {
        if (botones.item(i).classList.contains('hidden')) {
            botones.item(i).classList.remove('hidden')
        } else {
            botones.item(i).classList.add('hidden')
        }
    }
}

function verTodosElementosLI() {
    let elementoLista = document.getElementsByTagName('div')

    for (let i = 0; i < elementoLista.length; i++) {
        if(elementoLista[i].classList.contains('eliminaTarea')){
            elementoLista[i].classList.remove('eliminaTarea')
        }
        
    }
}