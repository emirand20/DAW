let list = new Vue({
    el: '#list', //conecta con el id del html
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
