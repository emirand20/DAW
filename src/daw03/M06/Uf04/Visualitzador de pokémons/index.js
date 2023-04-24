const input = document.querySelector("input")
const button = document.querySelector('button')
const pokemonContainer = document.querySelector('.pokemon-container')

button.addEventListener('click', (e) => {
    e.preventDefault()
    searchPokemon(input.value);
})

function searchPokemon(pokemon) {
    fetch(`https://pokeapi.co/api/v2/pokemon/${pokemon}/`)
        .then((res) => {
            if (!res.ok) {
                alert("no existe");
            }
            return res.json();
        })
        .then((data) => {
            createPokemon(data);
        })
}

function createPokemon(pokemon) {
    const img = document.createElement('img')
    img.src = pokemon.sprites.front_default

    const h3 = document.createElement('h3')
    h3.textContent = pokemon.name

    const div = document.createElement('div')
    div.appendChild(img)
    div.appendChild(h3)

    pokemonContainer.appendChild(div)
}
