fetch("https://rickandmortyapi.com/api/character")
.then(response => response.json())
.then(result => {
    console.log(result);
    const characters = result.results;
    characters.map(character => createCharacterCard(character));
});

function createCharacterCard(character) {
    console.log(character);
}

