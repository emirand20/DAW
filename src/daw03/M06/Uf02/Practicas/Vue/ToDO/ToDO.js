let list = new Vue({
    el: '#app', //conecta con el id del html
    data: {
        title: 'To Do',
        message: 'Crea una lista de tareas',
        nueva: null,
        items: [
            {
                text: 'Tomates',   
                checkbox: false,
                deleted: false
            }
        ]
    },
    methods: {
        addItem() { 
            this.items.push({
                text: this.nueva,
                checkbox: false,
                deleted: false
            })
        },
        moverPapelera() {
            this.items.forEach(items => {
                
            });
            this.deleted = false
            //this.items.splice(index, 1); //agrega y/o elimina elementos de la matriz.
        }
    }
})
