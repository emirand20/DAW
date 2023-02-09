const canvas = document.getElementById('game');
const ctx = canvas.getContext('2d');

let snake = [];
const snakeSize = 20;
let direction = 'right';
let speed = 100;

function drawSnake() {
    for (let i = 0; i < snake.length; i++) {
        ctx.fillStyle = 'green';
        ctx.fillRect(snake[i].x, snake[i].y, snakeSize, snakeSize);
    }
}

function moveSnake() {
    let x = snake[0].x;
    let y = snake[0].y;

    if (direction === 'right') {
        x += snakeSize;
    } else if (direction === 'left') {
        x -= snakeSize;
    } else if (direction === 'up') {
        y -= snakeSize;
    } else if (direction === 'down') {
        y += snakeSize;
    }

    snake.pop();
    snake.unshift({ x, y });
}

setInterval(() => {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    drawSnake();
    moveSnake();
}, speed);

document.addEventListener('keydown', (event) => {
    switch (event.keyCode) {
        case 37:
            direction = 'left';
            break;
        case 38:
            direction = 'up';
            break;
        case 39:
            direction = 'right';
            break;
        case 40:
            direction = 'down';
            break;
    }
});