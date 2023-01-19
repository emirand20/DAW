let list = new Vue({
    el: '#list', //conecta con el id del html
    data: {
        title: 'To Do',
        message: 'Crea una lista de tareas',
        checked: false,
        items: []
    },
    methods: {
        addItem: function () {
            let input = document.getElementById("itemForm");
            
            if (input.value !== "") {
                this.items.push({
                    text: input.value
                });
                input.value = "";
            }
        },
        deleteItem: function (index) {
            this.items.splice(index, 1); //agrega y/o elimina elementos de la matriz.
        },
        controlCheckbox: function (){
            
        }
    }
})
