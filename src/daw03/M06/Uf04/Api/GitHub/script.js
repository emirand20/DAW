document.addEventListener('DOMContentLoaded', getUserInfo);

Chart.defaults.color = '#fff'
Chart.defaults.borderColor = '#444'

function getUserInfo() {
  const username = 'GarajeDeIdeas'; // Nombre de usuario de GitHub

  fetch(`https://api.github.com/users/emirand20`)
    .then(response => response.json())
    .then(user => {
      const userInfoElement = document.getElementById('user-info');

      const html = `
        <h2>${user.login}</h2>
        <img src="${user.avatar_url}" alt="Avatar de ${user.login}" />
        <p>Nombre: ${user.name || 'No disponible'}</p>
        <p>Seguidores: ${user.followers}</p>
        <p>Siguiendo: ${user.following}</p>
        <p>Repositorios públicos: ${user.public_repos}</p>
      `;

      userInfoElement.innerHTML = html;

      // Obtener datos de repositorios
      fetch(`https://api.github.com/users/${username}/repos`)
        .then(response => response.json())
        .then(repos => {
          const repoChartElement = document.getElementById('repo-chart');

          const repoLabels = repos.map(repo => repo.name);
          const repoStars = repos.map(repo => repo.stargazers_count);

          const data = {
            labels: repoLabels,
            datasets: [{
              label: 'Estrellas',
              data: repoStars,
              borderColor: getDataColors(),
              backgroundColor: getDataColors(20)
            }]
          };

          const options = {
            responsive: true,
            scales: {
              y: {
                beginAtZero: true
              }
            }
          };

          new Chart(repoChartElement, {
            type: 'doughnut', // Cambio de 'bar' a 'doughnut'
            data: data,
            options: options
          });
        })
        .catch(error => {
          console.error('Error al obtener los repositorios:', error);
        });
    })
    .catch(error => {
      console.error('Error al obtener la información del usuario:', error);
    });
}

const getDataColors = opacity => {
  const colors = ['#7448c2', '#21c0d7', '#d99e2b', '#cd3a81', '#9c99cc', '#e14eca', '#ffffff', '#ff0000', '#d6ff00', '#0038ff']
  return colors.map(color => opacity ? `${color + opacity}` : color)
}

