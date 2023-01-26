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
            
            if(!this.nueva){
                alert('añade tarea')  
            }else{
                this.items.push({
                text: this.nueva,
                checked: false,
                deleted: false
                })
            }
        },
        hideItem(item) {
            item.deleted = true
        },
        muestraElementosPapelera() {
            this.items.forEach(element => {
                if (element.deleted == true) {
                    element.deleted = false
                }
            })
        }
    }
})
