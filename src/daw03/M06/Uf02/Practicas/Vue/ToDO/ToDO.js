let list = new Vue({
    el: '#list', //esto es la conceccion con el ids  
    data: {
        title: 'To Do',
        items: [
            { text: "Peras" }
        ]
    },
    methods: {
        addItem: function () {
            var input = document.getElementById("itemForm");

            if (input.value !== "") {
                this.items.push({
                    text: input.value
                });
                input.value = "";
            }
        },
        deleteItem: function (index) {
            this.items.splice(index, 1);
        }
    }
})
