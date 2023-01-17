let app = new Vue({
    el: '#app', //esto es la conceccion con el ids  
    data: {
        header: 'To Do'
    },
})

let añadirInput = new Vue({
    data: {
        añadirInput: {
            click: () => ("Has hecho click")

        }
    }
})
var app2 = new Vue({
    el: '#aplicacion',
    data:{ 
      contador: 100
    }      
  })
