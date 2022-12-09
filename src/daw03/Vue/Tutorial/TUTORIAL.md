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