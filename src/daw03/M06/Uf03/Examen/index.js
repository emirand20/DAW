const num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
const res = []
num.map((e) => {
    res.push(Math.pow(2, e))
})
const b = res.filter(e => e < 10)
console.log(b)
const c = b.reduce((acc, e) => e + acc)
console.log(c)
