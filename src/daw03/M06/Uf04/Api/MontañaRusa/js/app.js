//valores por defecto aplicables a todos los charts
Chart.defaults.color = '#fff'
Chart.defaults.borderColor = '#444'
const ApiKey = '401c9200-9c5f-40bf-b111-f0683b6faf2a'
//desde esta funcion llamaremos a las demas funciones, cada una de ellas se
//encargaran de generar otro nuevo chart
const printCharts = () => {
    fetchCoastersData('http://coasters-api.herokuapp.com', 'http://coasters-api.herokuapp.com/country/Spain')
        .then(([allCoasters, nationalCoasters]) => {
            console.log(allCoasters, nationalCoasters)
        })
    renderModelsChart()
}

//chart basico
const renderModelsChart = () => {

    //lo que necesita chart, para renderizar un chaerter a nivel de datos
    //son necesarias dos propiedades, labels y datasets
    const data = {
        labels: ['uno', 'dos', 'tres'],
        datasets: [{
            data: [10, 20, 30],
            //necesidad esteticas, solo una paleta de colores y agregar opacidad
            borderColor: getDataColors(),
            backgroundColor: getDataColors(20)
        }]
    }
    //leyenda a la izquierda
    const options = {
        plugins: {
            legend: { position: 'left' }
        }
    }
    //creamos un nuevo chartm el cual el pasamos como primer argumento el id
    //y como segundo argumentoun objecto con el tipo y como minimo los datos
    new Chart('modelsChart', { type: 'doughnut', data, options })
}

printCharts()