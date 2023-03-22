import { canvas, context, alçadaPala, maximPalaY, paddleSpeed, velocitatPilota, palaEsquerra, palaDreta, pilota } from './pong.js'
import { collides, loop } from './pong.js'

window.addEventListener('mouseup', function (e) {
    tmp = document.elementFromPoint(x + px, y + py);
    up = palaDreta.x + palaDreta.alçada
    down = palaDreta.y + palaDreta.amplada
})

window.addEventListener('mousemove', function (e) {
    
})

palaEsquerra.querySelector(window).scroll(function () {
    let pixel = document.querySelector(window).scrollTop
    macpro.currentTime = pixel / 1000
})
