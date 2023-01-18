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


Vue.component('todo-item', {
    props: ['todo'],
    template: '<li>{{ todo.text }}</li>'
})

var app7 = new Vue({
    el: '#app-7',
    data: {
        groceryList: [
            { id: 0, text: 'Vegetales' },
            { id: 1, text: 'Queso' },
            { id: 2, text: 'Cualquier otra cosa que se supone que los humanos coman' }
        ]
    }
})

var obj = {
    foo: 'bar'
}

Object.freeze(obj)

new Vue({
    el: '#app-8',
    data: obj
})

var app2 = new Vue({
    el: '#aplicacion',
    data:{ 
      contador: 0
    }      
    })