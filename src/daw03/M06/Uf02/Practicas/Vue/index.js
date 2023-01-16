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

app4.todos.push({ text: 'New item' },
    { text: 'Other item' }
)

var app5 = new Vue({
    el: '#app-5',
    data: {
        message: 'Hola Vue.js!'
    },
    methods: {
        reverseMessage: function () {
            this.message = this.message.split('').reverse().join('')
        }
    }
})

var app6 = new Vue({
    el: '#app-6',
    data: {
        message: 'Hola Vue!'
    }
})

// Define un nuevo componente llamado todo-item
Vue.component('todo-item', {
    // El componente todo-item ahora acepta una
    // "propiedad", que es como un atributo personalizado.
    // Esta propiedad es llamada todo.
    props: ['todo'],
    template: '<li>Esta es una tarea.</li>'
})