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

    if (añadirTarea === '') {
        alert('Añade una tarea');
    } else {
        div.appendChild(checkbox)
        document.getElementById('lista').appendChild(div).appendChild(span)
    }
    document.getElementById('input').value = ''
}

function editarList() {
    document.getElementById("elimina").disabled = true

    for (let i = 0; i < lista.length; i++) {
        let button = document.createElement("button")
        let txt = document.createTextNode("\u00D7")
        button.appendChild(txt)
        lista[i].appendChild(button)
        button.addEventListener('click', function () { //funcion anonima
            lista[i].style.display = "none"
        })
    }
}
function verTodosElementosLI() {
    let elementosLista = document.getElementById('elemento')
    // let ul = document.getElementsByTagName('UL')
    for(let i = 0; i < lista.length; i++){
        if(elementosLista.hasAttribute("style")){

            elementosLista.removeAttribute("style")
        }
        
    }
    return elementosLista
}