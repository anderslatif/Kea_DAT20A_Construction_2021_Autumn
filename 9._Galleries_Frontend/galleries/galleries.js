const galleriesTableBody = document.getElementById("galleries-tbody");

fetch(baseURL + "/galleries")
.then(response => response.json())
.then(galleries => {
    galleries.map(createGalleryTableRow);
});

function createGalleryTableRow(gallery) {
    const galleryTableRow = document.createElement("tr");
    galleryTableRow.id = gallery.id;

    galleryTableRow.innerHTML = `
            <td>
                <a href="./gallery.html?galleryId=${gallery.id}">
                    <p>${escapeHTML(gallery.name)}</p>
                </a>
            </td>
            <td>
                <p>${escapeHTML(gallery.location)}</p>
            </td>
            <td>
                <p>${escapeHTML(gallery.owner)}</p>
            </td>
            <td>
                <p>${escapeHTML(gallery.squareFeet.toString())}</p>
            </td>           
            <td>
                <button onclick="deleteGallery(${gallery.id})">❌</button>            
            </td>
        `;

    galleriesTableBody.appendChild(galleryTableRow);
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

function deleteGallery(galleryId) {
    fetch(baseURL + "/galleries/" + galleryId, {
        method: "DELETE"
    }).then(response => {
        if (response.status === 200) {
            document.getElementById(galleryId).remove();
        } else {
            console.log(response.status);
        }
    });
}

document.getElementById("create-gallery").addEventListener("click", createGallery);
