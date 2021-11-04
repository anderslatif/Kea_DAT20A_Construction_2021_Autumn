// todo here get the id from the url and make it show the correct gallery on the page

fetch(baseURL + "/galleries/1")
.then(response => response.json())
.then(gallery => {
    document.getElementById("gallery-name").innerText = gallery.name;
    document.getElementById("gallery-owner").innerText = gallery.owner;
    document.getElementById("gallery-location").innerText = gallery.location;
    document.getElementById("gallery-square-feet").innerText = gallery.squareFeet;
});

