const lista = document.getElementsByTagName('div')

//crearemos un div que tenga un input checkbox y fuera del imput
function añadirInput() {
    let div = document.createElement('div')
    div.setAttribute('id', 'elemento')

    let checkbox = document.createElement('input')
    checkbox.setAttribute('type', 'checkbox')

    checkbox.addEventListener('change', function (event) {
        let parent = checkbox.parentElement
        let child = parent.lastChild

        if (event.currentTarget.checked) {
            child.style.textDecoration = 'line-through'
        } else {
            child.style.textDecoration = 'none'
        }
    })

    let añadirTarea = document.getElementById('input').value //conectamos el input 
    let nuevaTarea = document.createTextNode(añadirTarea)
    let span = document.createElement('span')
    span.appendChild(nuevaTarea)
    let button = document.createElement("button")

    let boton_toggle = document.getElementById("elimina")
    
    if (boton_toggle.classList.contains('is-hidden')) {

        button.classList.add('hidden');
    }
    
    button.classList.add('boton_borrar');
    let txt = document.createTextNode("\u00D7")
    button.appendChild(txt)

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
    console.log(botones.length)

    for (let i = 0; i < botones.length; i++) {
        if (botones.item(i).classList.contains('hidden')) {

            botones.item(i).classList.remove('hidden')
        } else {
            botones.item(i).classList.add('hidden')
        }
        // let button = document.createElement("button")
        // let txt = document.createTextNode("\u00D7")
        // button.appendChild(txt)
        // lista[i].appendChild(button)
        // button.addEventListener('click', function () { //funcion anonima
        //     lista[i].style.display = "none"
        // })
    }
}
function verTodosElementosLI() {
    let elementosLista = document.getElementById('elemento')
    // let ul = document.getElementsByTagName('UL')
    for (let i = 0; i < lista.length; i++) {
        if (elementosLista.hasAttribute("style")) {

            elementosLista.removeAttribute("style")
        }

    }
    return elementosLista
}