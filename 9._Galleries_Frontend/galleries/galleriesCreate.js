const galleryFormParentDiv = document.getElementById("create-gallery-form");
const galleryFormExpandButton = document.getElementById("expand-gallery-form");

const createGalleryForm = `<div>
    <label>Name</label>
    <input id="create-gallery-name" placeholder="name">
    <label>Location</label>
    <input id="create-gallery-location" placeholder="location">    
    <label>Owner</label>
    <input id="create-gallery-owner" placeholder="owner">    
    <label>Square Feet</label>
    <input id="create-gallery-square-feet" placeholder="square feet">
    <button onclick="removeGalleryForm()">Cancel</button>
    <button onclick="console.log('about to create a new gallery')">Create A New Gallery</button>
</div>`;


function showGalleryForm() {
    galleryFormExpandButton.style.display = "none";
    galleryFormParentDiv.innerHTML = createGalleryForm;
}

function removeGalleryForm() {
    galleryFormExpandButton.style.display = "block";
    galleryFormParentDiv.innerHTML = "";
}

function createGallery() {

    fetch(baseURL + "/galleries", {
        method: "POST",
        headers: { "Content-type": "application/json; charset=UTF-8" },
        body: JSON.stringify({
            name: "New hardcoded gallery",
            location: "Atlantis",
            owner: "Apollo"
        })
    }).then(response => response.json())
    .then(gallery => {
        createGalleryTableRow(gallery);
    });
}


document.getElementById("expand-gallery-form")
    .addEventListener("click", showGalleryForm);
