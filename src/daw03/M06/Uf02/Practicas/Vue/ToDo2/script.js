var card = new Vue({
    el: "#card",
    data: {
      title: "List",
      items: [
        { text: "Velociraptor" }
      ]
    },
    methods: {
      addItem: function() {
        var input = document.getElementById("itemForm");
  
        if (input.value !== "") {
          this.items.push({
            text: input.value
          });
          input.value = "";
        }
      },
      deleteItem: function(index) {
        this.items.splice(index, 1);
      }
    }
  });
  