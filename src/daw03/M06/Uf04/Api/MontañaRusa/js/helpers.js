/**
 * esta funcion recivira tantas urls como deseemos, que convertiremos en un array, iterearemos sobre cada una de las urls, que le pasemos,
 * de manera que para cada una de ellas haremos una llamada de ayax, una vez resuelta la parsaremos, 
 * retona un promise.all(), con las promesas ya resueltas. 
 * promise.all(), retorna un array, con cada una de las posiciones seran las respuestas del servidor, para cada unas de las urls
 */
const fetchCoastersData = (...urls) => {
    const promises = urls.map(url => fetch(url).then(response => response.json()))
    return Promise.all(promises)
}

/**
 * @param {*} opacity , se verifica si se proporciona un valor para opacity. Si opacity tiene un valor, 
 * se concatena al color utilizando la sintaxis de concatenación
 * @returns 
 * esta función permite agregar opcionalmente un valor de opacidad a cada color en un array de colores, 
 * creando así una nueva lista de colores que pueden tener diferentes niveles de transparencia.
 */
const getDataColors = opacity => {
    const colors = ['#7448c2', '#21c0d7', '#d99e2b', '#cd3a81', '#9c99cc', '#e14eca', '#ffffff', '#ff0000', '#d6ff00', '#0038ff']
    return colors.map(color => opacity ? `${color + opacity}` : color)
}

/**
 * @param {*} coasters  es un array que contiene información sobre montañas rusas, 
 * cada elemento representa una montaña rusa con una propiedad year que indica el año de lanzamiento de la montaña rusa.
 * @param {*} years  es también un array que contiene rangos de años en formato de cadena separados por guiones ("-").
 * Cada rango de años representa un intervalo de años en el cual se desea buscar montañas rusas.
 * @returns 
 * 
 * coastersByYear -> con el metodo map iteramos, con split diviremos el rango de años en dos partes, from y to.
 * filtraremos las montañas rusas cuyo año de lanzamiento esta dentro del rango. La condicion verifica si la propiedad year de la montaña
 * es mayor o igual que from y menor o igual a to. *devuelve la longitud del array filtrado, que representa la cantidad de montañas rusas 
 * que cumplen con el rango de años especificado.*
 * El resultado final es un array coastersByYear que contiene la cantidad de montañas rusas para cada rango de años especificado en el 
 * array years
 */
const getCoastersByYear = (coasters, years) => {
    const coastersByYear = years.map(yearsRange => {
        const [from, to] = yearsRange.split('-')
        return coasters.filter(eachCoaster => eachCoaster.year >= from && eachCoaster.year <= to).length
    })
    return coastersByYear
}
/**
 * @param {*} chartId ID gráfico que actualizaremos
 * @param {*} data es un array que contiene los nuevos datos para el gráfico
 * @param {*} label nueva etiqueta para el conjunto de datos del gráfico
 * 
 * Chart.getChart(chartId) para obtener una referencia al objeto del gráfico actualmente existente en la página,
 * utilizando el ID del gráfico proporcionado.
 */
const updateChartData = (chartId, data, label) => {
    const chart = Chart.getChart(chartId)
    chart.data.datasets[0].data = data
    chart.data.datasets[0].label = label
    chart.update()
}