# VUE 3 

# Conceptos Basicos

1. Programacion Reactiva
~~~
Es un PARADIGMA DE PROGRAMACION ASÍNCRONA orientado al FLUJO DE DATOS y PROPAGACION DEL CAMBIO. 
Se compone de tres componentes basicos, OBSERVABLE, METODO QUE AVISA LOS CAMBIOS Y OBSERVER (nosotros como clientes).
~~~

1.1 Sincrono y Asíncronio

~~~
Un código síncrono es aquel código donde cada instrucción espera a la anterior para ejecutarse mientras que un código asíncrono no espera a las instrucciones diferidas y continúa con su ejecución. Por lo general la asincronía permite tener una mejor respuesta en las aplicaciones y reduce el tiempo de espera del cliente.
~~~

1.1.1 Síncrono
Cada instrucción se ejecutará en secuencia hasta terminar.
~~~
console.log('Primero'); 
console.log('Segundo');
console.log('Tercero');
~~~
1.1.2 Asíncrono
En el caso asícrono, algunas de las instrucciones se ejecutarán a destiempo.
~~~
console.log('Primero');
setTimeout(_ => {
  console.log('Segundo');
},10);
console.log('Tercero');
~~~

1.2 Flujo de datos 
Son todos aquellos datos cuyas llamadas haran que estos datos cambien gracias a una funcion que estara escuchando.

1.3 Propagacion del cambio

# API COMPOSER