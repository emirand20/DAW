//valores por defecto aplicables a todos los charts
Chart.defaults.color = '#fff'
Chart.defaults.borderColor = '#444'




//desde esta funcion llamaremos a las demas funciones, cada una de ellas se
//encargaran de generar otro nuevo chart
const printCharts = () => {
    renderModelsChart()
}

//chart basico
const renderModelsChart = () =>{

    //lo que necesita chart, para renderizar un chaerter a nivel de datos
    //son necesarias dos propiedades, labels y datasets
    const data = {
        labels: ['uno', 'dos', 'tres'],
        datasets: [{
            data: [10, 20, 30],
            //necesidad esteticas
            borderColor: ['red', 'green', 'blue'],
            backgroundColor: ['blue', 'green', 'red']
        }]
    }
    //leyenda a la izquierda
    const options = {
        plugins: {
            legend: { position: 'left'}
        }
    }
    //creamos un nuevo chartm el cual el pasamos como primer argumento el id
    //y como segundo argumentoun objecto con el tipo y como minimo los datos
    new Chart('modelsChart', {type: 'doughnut', data, options})
}

printCharts()