//Mi array de ejemplo
let miLista = [4, 2, 1, 6, 1, 22, 12];
let letras = ['a', 'b', 'a', 'd', 'e', 'b', 'b']

let contador = []

console.info('----- FOREACH LETRAS ------')
letras.forEach(item =>{
    if(contador[item]){
        contador[item]++
    }else{
        contador[item] = 1
    }
})
console.log(contador)

console.info("----- FOREACH -----");
//Imprime todos los elementos
miLista.forEach(e => {
    console.log(e)
})

console.info("----- MAP RESTAURANTE-----");
let almuerzos = [
    {principal: 'arepa', postre: 'helado'},
    {principal: 'tacos', postre: 'torta de queso'},
    {principal: 'pizza', postre: 'galletas'},
    {principal: 'sushi', postre: 'quesito'},
]

let platosPrincipales = almuerzos.map(almuerzo => almuerzo.principal)
console.log(platosPrincipales)


console.info("----- MAP -----");
//Multiplica cada elemento de la array *3
console.log(miLista.map((e) => e * 3));
//Suma cada elemento de la array + 2
console.log(miLista.map((e) => e + 2));

console.info("----- REDUCE -----");
//Todos los elementos se suma
const res = miLista.reduce((acc, item) => {
    return acc+=item
},10) //acc empieza desde 10
console.log(res)

const strings = ['Mi', 'nombre', 'es', 'javi']
const res2 = strings.reduce((acc, item) =>{
    return acc += ' ' + item
}, 'Hola')
console.log(res2)

const obj = [
    {nombre: 'Javi', edad: 18},
    {nombre: 'Lena', edad: 10},
]

const res3 = obj.reduce((acc, item) =>{
    return acc += item.edad
}, 0)
console.log(res3)

console.log(miLista.reduce((e, acumulador) => e + acumulador));
//Todos los elementos se multiplican
console.log(miLista.reduce((e, acumulador) => e * acumulador));

console.info("----- SOME ----- permite verificar si ALGUNO de los elementos del array cumple con la condicion que le estoy especificando, boolean");

const users = [
    {name: 'Fabian', age: 17},
    {name: 'Luis', age: 2},
    {name: 'John', age: 3},
]

const anyAdult = users.some(user => user.age > 18)
console.log(anyAdult)

//Hay algun elementos impar
console.log(miLista.some(e => e % 2 !== 0));
//Hay algun numero menor a 10
console.log(miLista.some(e => e < 10));

console.info("----- EVERY ----- Boolean, deja de iterar en cuanto encuentra un elemento que no cumple la condicion");
//Todos los elementos son impares
console.log(miLista.every(e => e % 2 !== 0));
//Todos los elementos son menores a 10
console.log(miLista.every(e => e < 10));

console.info("----- FILTER ----- Devuelve un array");
//Devuelve todos los elementos mayor a 10
console.log(miLista.filter(e => e > 10));
//Devuelve todos los elementos menor a 20
console.log(miLista.filter(e => e < 20));


const names = ['Alfredo', 'Andrea', 'Belen', 'Cesar', 'Juan', 'Javi']
let filterNames = names.filter((name) =>{
    return name[0] == 'A'
})
console.log(filterNames)


console.info("---- EXTRA ----");
//Cada funcion tiene una funcion dentro, la puedo extraer

//Funcion en una variable 
let condition1 = function (e) { return e > 10 }
console.log(miLista.filter(condition1));

//Funcion anonima en una variable 
let condition2 = (e) => e > 10;
console.log(miLista.filter(condition2));

//Funcion y directamente llamo a la funcion, IMPORTANTE, SIN '()'
function condition3(e) { return e > 10; }
console.log(miLista.filter(condition3));