fetch("http://localhost:8080/artists")
.then(response => response.json())
.then(result => {
    result.map(createArtistCard);
});

const artistsGalleryWrapper = document.getElementById("artists-gallery");

function createArtistCard(artist) {
    const artistElement = document.createElement("div");
    artistElement.innerText = artist.name;

    artistsGalleryWrapper.appendChild(artistElement);
}
