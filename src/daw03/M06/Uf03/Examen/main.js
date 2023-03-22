import { canvas, context, alçadaPala, maximPalaY, paddleSpeed, velocitatPilota, palaEsquerra, palaDreta, pilota } from './pong.js'
import { collides, loop } from './pong.js'

document.addEventListener("mousemove", e => {
    palaEsquerra.y = e.y;
})  
document.addEventListener("mousemove", e => {
    palaEsquerra.y = e.y - 150;
});       

palaEsquerra.querySelector(window).scroll(function () {
    let pixel = document.querySelector(window).scrollTop
    macpro.currentTime = pixel / 1000
})   
