let timeEl = document.getElementById('time');
let time = getCurrentTime();
timeEl.innerText = time;

setInterval(function () {
    let time = getCurrentTime();
    timeEl.innerText = time;

}, 1000);


function getCurrentTime() {
    let dateOBJ = new Date();
    let time = {
        hours: dateOBJ.getHours(),
        minutes: dateOBJ.getMinutes(),
        seconds: dateOBJ.getSeconds(),
        tt: 'AM'
    }
    if (time.hours == 12) {
        time.ampm = 'PM';
    } else if (time.hours > 12) {
        time.hours -= 12;
        time.tt = 'PM'
    }
    if (time.hours < 10) {
        time.hours = '0' + time.hours
    }
    if (time.minutes < 10) {
        time.minutes = '0' + time.minutes
    }
    if (time.seconds < 10) {
        time.seconds = '0' + time.seconds
    }
    return time.hours + ':' + time.minutes + ':' + time.seconds + ' ' + time.tt
}

function chronometer() {
    seconds++
    if (seconds < 10) seconds = `0` + seconds
    if (seconds > 59) {
        seconds = `00`
        minutes++
        if (minutes < 10) minutes = `0` + minutes
    }
    if (minutes > 59) {
        minutes = `00`
        hours++
        
        if (hours < 10) hours = `0` + hours
    }
    
    chronometerDisplay.textContent = `${hours}:${minutes}:${seconds}` //concatenacion

}
let hours = `00`,
    minutes = `00`,
    seconds = `00`,
    chronometerDisplay = document.querySelector(`[data-chronometer]`),
    chronometerCall

play.onclick = (event) => {
    chronometerCall = setInterval(chronometer, 1000)
    event.target.setAttribute(`disabled`, ``)
}

pause.onclick = () => {
    clearInterval(chronometerCall)
    play.removeAttribute(`disabled`)
}

reset.onclick = () => {
    clearInterval(chronometerCall)
    play.removeAttribute(`disabled`)
    chronometerDisplay.textContent = `00:00:00`

    hours = `00`,
    minutes = `00`,
    seconds = `00`
}

let segundos = 120

function timer(){
    document.getElementById('temporizador').innerText = segundos + ' segundos'
    
    if(segundos == 0){
       alert('Se termino el tiempo')
    }else{
        let a = document.getElementById('bottonTimer')
        a.setAttribute('disabled', '')
        segundos--
        setTimeout('timer()', 1000)
        
    }
}
