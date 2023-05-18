function buscarEquipo() {
    let url = `https://futdb.app/api/clubs?page=1`;
    let token = '374b575f-f03c-4583-beec-926f35e7ae69';

    fetch(url, {
        method: 'GET',
        headers: {
            'accept': 'application/json',
            'X-AUTH-TOKEN': token
        }
    })
        .then(function (response) {
            if (response.ok) {
                return response.json();
            } else {
                throw new Error('Error: ' + response.status);
            }
        })
        .then(function (data) {
            mostrarEquipo(data)
        })
        /*.then(function (img){
            mostrarImg(img)
        })*/
        .catch(function (error) {
            console.log(error);
        });
}

function mostrarEquipo(data) {
    const resultContainer = document.getElementById('resultContainer');
    let teamId = document.getElementById('teamIdInput').value;
    let item = data.items;
    let teamName = '';
    
    for (let i = 0; i < item.length; i++) {
      if (item[i].id == teamId) {
        teamName = item[i].name;
      }
    }
    
    // Crear el elemento <h2>
    const h2Element = document.createElement('h2');
    h2Element.textContent = teamName;
    resultContainer.appendChild(h2Element);    
}

/*function mostrarImg(img){
    
}*/