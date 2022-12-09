# Vue 

# Representación declarativa

La característica principal de Vue es la representación declarativa : al usar una sintaxis de plantilla que extiende HTML, podemos describir cómo debería verse el HTML en función del estado de JavaScript. Cuando cambia el estado, el HTML se actualiza automáticamente.

Sintaxis bigotes = {{ message }}

Tambien podemos usar cualqueir expresion Js valida dentro de bigotes.
~~~
<script>
export default {
    data() {
        return {
            message: 'Esto es Vue!',
            counter: {
                count: 5
            }
        }
    }
}
</script>

<template>
    <!-- {{ message.split('').reverse().join('') }} -->
    <h1>{{ message }}</h1>
    <p>Count is: {{ counter.count }}</p>
</template>
~~~

# Creamos un texto en rojo 

Una directiva es un atributo especial que comienza con el v-prefijo. Son parte de la sintaxis de la plantilla de Vue.
~~~
<script>
export default {
  data() {
    return {
      titleClass: 'title'
    }
  }
}
</script>

<template>
    <h1 :class="titleClass">Make me red</h1>
</template>

<style>
.title {
    color: red;
}
</style>
~~~

# Incrementamos un numero

Podemos escuchar eventos DOM usando la v-ondirectiva:
~~~
<button v-on:click="increment">{{ count }}</button>
~~~
Dentro de un método, podemos acceder a la instancia del componente usando 'this'. La instancia del componente expone las propiedades de datos declaradas por data.
Los controladores de eventos también pueden usar expresiones en línea y pueden simplificar tareas comunes con modificadores.
~~~
<script>
export default {
  data() {
    return {
      count: 0
    }
  }
}
</script>

<template>
  <!-- make this button work -->
  <button>count is: {{ count }}</button>
</template>
~~~

# Enlaces de formulario

Usando 'v-bind' y 'v-on' juntos, podemos crear enlaces bidireccionales en elementos de entrada de formulario:
~~~
<input :value="text" @input="onInput">
~~~
~~~
methods: {
  onInput(e) {
    // a v-on handler receives the native DOM event
    // as the argument.
    this.text = e.target.value
  }
}
~~~
Para simplificar los enlaces bidireccionales, Vue proporciona una directiva, 'v-model' que es esencialmente un azúcar de sintaxis para lo anterior:
~~~
<input v-model="text">
~~~
'v-model' sincroniza automáticamente el '<input>' valor de con el estado enlazado, por lo que ya no necesitamos usar un controlador de eventos para eso.

'v-model' no solo funciona con entradas de texto, sino también con otros tipos de entrada, como casillas de verificación, botones de opción y menús desplegables de selección. 
~~~
<script>
export default {
  data() {
    return {
      text: ''
    }
  }
}
</script>

<template>
  <input v-model="text" placeholder="Type here">
  <p>{{ text }}</p>
</template>
~~~

# Condicionales

Podemos usar la v-ifdirectiva para representar condicionalmente un elemento:
~~~
<h1 v-if="awesome">Vue is awesome!</h1>
~~~
Esto 'h1' se representará solo si el valor de 'awesome' es verdadero. Si 'awesome' cambia a un valor falso, se eliminará del DOM.
También podemos usar 'v-else' y 'v-else-if' para denotar otras ramas de la condición:
~~~
<h1 v-if="awesome">Vue is awesome!</h1>
<h1 v-else>Oh no 😢</h1>
~~~
~~~
<script>
export default {
  data() {
    return {
      awesome: false
    }
  },
  methods: {
    toggle() {
      this.awesome = !this.awesome
    }
  }
}
</script>

<template>
  <!-- <button @click="toggle">toggle</button> -->
  <h1 v-if="awesome">Vue is awesome!</h1>
  <h1 v-else>Oh no 😢</h1>
</template>
~~~

# Representación de lista
Podemos usar la 'v-for' directiva para representar una lista de elementos basada en un script:
~~~
 data() {
    return {
      newTodo: '',
      todos: [
        { id: id++, text: 'Learn HTML' },
        { id: id++, text: 'Learn JavaScript' },
        { id: id++, text: 'Learn Vue' }
      ]
    }
<ul>
  <li v-for="todo in todos" :key="todo.id">
    {{ todo.text }}
  </li>
</ul>
~~~
Añadiremos, viusalizaremos y eliminaremos cada uno de los elementos de la fila.
Hay dos formas de actualizar la lista:
1. Llame a los métodos de mutación en la matriz de origen:
~~~
addTodo() {
      this.todos.push({ id: id++, text: this.newTodo })
      this.newTodo = ''
    },
~~~
2. Remplace por una nueva matriz
~~~
removeTodo(todo) {
      this.todos = this.todos.filter((t) => t !== todo)
    }
~~~
De manera que visualizaremos un imput el cual añadiremos productos a nuestra lista, visualizaremos la lista con 'v-for' y eliminaremos con 'button'
~~~
<script>
// give each todo a unique id
let id = 0

export default {
  data() {
    return {
      newTodo: '',
      todos: [
        { id: id++, text: 'Learn HTML' },
        { id: id++, text: 'Learn JavaScript' },
        { id: id++, text: 'Learn Vue' }
      ]
    }
  },
  methods: {
    addTodo() {
      this.todos.push({ id: id++, text: this.newTodo })
      this.newTodo = ''
    },
    removeTodo(todo) {
      this.todos = this.todos.filter((t) => t !== todo)
    }
  }
}
</script>

<template>
  <form @submit.prevent="addTodo">
    <input v-model="newTodo">
    <button>Add Todo</button>    
  </form>
  <ul>
    <li v-for="todo in todos" :key="todo.id">
      {{ todo.text }}
      <button @click="removeTodo(todo)">DELETE PRODUCT</button>
    </li>
  </ul>
</template>
~~~