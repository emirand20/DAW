# Vue 
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
    <!-- no es necesariamente que entre 'bigotes' sea llamada la funcion, 
         sino tambien podemos usar cualqueir expresion Js valida
        <h1>{{ message.split('').reverse().join('') }}</h1> -->
    <h1>{{ message }}</h1>
    <p>Count is: {{ counter.count }}</p>
</template>

~~~

~~~ 
Creamos un texto en rojo 
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
Incrementamos un numero
~~~