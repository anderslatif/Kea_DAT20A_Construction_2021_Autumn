const characterGalleryDiv = document.getElementById("character-gallery");
let characters;
let filteredCharacters;

fetch("https://rickandmortyapi.com/api/character")
.then(response => response.json())
.then(result => {
    characters = result.results;
    filteredCharacters = characters;
    characters.map(character => createCharacterCard(character));
});


function createCharacterCard(character) {
    const cardElement = document.createElement("div");
    cardElement.innerHTML = `
        <p>${escapeHTML(character.name)}</p>
        <img src="${escapeHTML(character.image)}">
    `;

    characterGalleryDiv.appendChild(cardElement);
}

function searchCharacters() {
    const selectedStatus = document.getElementById("status-dropdown").value;
    characterGalleryDiv.innerHTML = "";

    if (selectedStatus === "All") {
        filteredCharacters = characters;
        characters.map(createCharacterCard);
    } else {
        filteredCharacters = characters.filter(character => character.status === selectedStatus);
        filteredCharacters.map(createCharacterCard);
    }
}

function handleSearchName(event) {
    characterGalleryDiv.innerHTML = "";
    const searchTerm = event.target.value.toLowerCase();
    filteredCharacters.filter(character => character.name.toLowerCase().includes(searchTerm))
    .map(createCharacterCard);
}

document.getElementById("search").addEventListener("click", searchCharacters);
document.getElementById("name-search").addEventListener("input", handleSearchName);
