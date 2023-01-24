let list = new Vue({
    el: '#app', //conecta con el id del html
    data: {
        title: 'To Do',
        message: 'Crea una lista de tareas',
        nueva: null,
        items: [
            {
                text: 'Tomates',
                checked: false,
                deleted: false
            },
            {
                text: 'Judias',
                checked: false,
                deleted: false
            },
            {
                text: 'Manzanas',
                checked: false,
                deleted: false
            }
        ]
    },
    methods: {
        addItem() {
            this.items.push({
                text: this.nueva,
                checked: false,
                deleted: false
            })
        },
        removeItem(){
            items.deleted ? 'moverPapelera' : null
            // this.items.splice(index, 1); //agrega y/o elimina elementos de la matriz.
        },
        muestraElementosPapelera() {
            this.items.forEach(element => {

            });
        }
    }
})
