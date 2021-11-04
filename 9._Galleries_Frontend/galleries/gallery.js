const queryString = window.location.search;
const URLParams = new URLSearchParams(queryString);
const galleryId = URLParams.get("galleryId");

fetch(baseURL + "/galleries/" + galleryId)
.then(response => response.json())
.then(gallery => {
    document.getElementById("gallery-name").innerText = gallery.name;
    document.getElementById("gallery-owner").innerText = gallery.owner;
    document.getElementById("gallery-location").innerText = gallery.location;
    document.getElementById("gallery-square-feet").innerText = gallery.squareFeet;
});

