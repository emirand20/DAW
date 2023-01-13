var app = new Vue({
    el: '#app',
    data: {
        message: 'Hola Vue!'
    }
})

app.message = 'Cambie a la data'

var app2 = new Vue({
    el: '#app-2',
    data: {
        message: 'Usted cargó esta página el ' + new Date().toLocaleString()
    }
})

var app3 = new Vue({
    el: '#app-3',
    data: {
        seen: true
    }
})
app3.seen = true

var app4 = new Vue({
    el: '#app-4',
    data: {
        todos: [
            { text: 'Aprender JavaScript' },
            { text: 'Aprender Vue' },
            { text: 'Construir algo increíble' }
        ]
    }
})

app4.todos.push({text: 'New item'},
                {text: 'Other item'})