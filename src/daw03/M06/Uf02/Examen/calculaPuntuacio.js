
function calculaPuntuacio(name, score) {
    this.name = name
    this.score = score
    this.media
}
calculaPuntuacio.prototype.calculaPuntuacio = function (obj) {
    let sum = 0;
    let count = 0;
    for (let key in obj) {
        ++count
        sum += obj[key];
    }
    let media = sum / count
    console.log('La suma de los puntos es:', sum, ', en total hay ', count, 'jugadores', 'y la media es de:', media)
}

calculaPuntuacio.prototype.sense = function (obj, player) {
    for (const [key, value] of Object.entries(obj)) {
        if (`${key}` == player) {
            delete obj[`${key}`];
        }
        console.log(`${key}: ${value}`)
    }
    console.log(obj)
}
const j1 = new calculaPuntuacio()
const scoreBoard = {
    'Dave Thomas': 44,
    'Freyja Ćirić': 539,
    'José Valim': 265,
};

j1.calculaPuntuacio(scoreBoard)
j1.sense(scoreBoard, 'Dave Thomas')
const keys = Object.keys(j1)
console.log(keys)
function Matriu(height, width) {
    this.height = height //- Retorna l’alçada de la matriu
    this.width = width //- Retorna l’amplada de la matriu
}
Matriu.prototype.print = function () {

}
Matriu.prototype.fromArray = function (height, width) {
    const res = []
    for (let i = 0; i < height; i++) {
        for (let j = 0; j < width; j++) {
            if (!res[i]) {
                res[i] = [];
            };
            res[i][j] = val;
        };
    };
    return res;
}

const matriu = new Matriu()
matriu.fromArray((5, 4))

function fromArray(width, height, value) {
    return Array.apply(null, { length: height }).map(function () {
        return Array.apply(null, { length: width }).map(function () {
            return value;
        });
    });
}
document.write(JSON.stringify(fromArray(3, 3, 9)));

function MatriuBinaria(width, height, value) {
    return Array.apply(null, { length: height }).map(function () {
        return Array.apply(null, { length: width }).map(function () {
            return value;
        });
    });
}

document.write(JSON.stringify(MatriuBinaria(3, 3, 1)))