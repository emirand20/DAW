/*frutas = ["banana", "manzana", "pera"];
document.write(frutas[1])*/

//Arrays asosiativos
let pc1 = {
    nombre: "DaltoPc",
    procesador: "Intel Core I7",
    ram: "16GB",
    espacio: "1TB"
};
//let pc2 = ["DaltoPc", "Intel Core I7", "16GB", "1TB"];

let nombre = pc1["nombre"];
let procesador = pc1["procesador"];
let ram = pc1["ram"];
let espacio = pc1["espacio"];

frase = 'el nombre de mi PC es: <b>${nombre}</b> <br>'

document.write(frase)