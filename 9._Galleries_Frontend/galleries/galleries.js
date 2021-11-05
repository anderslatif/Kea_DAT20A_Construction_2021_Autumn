const galleriesTableBody = document.getElementById("galleries-tbody");

fetch(baseURL + "/galleries")
.then(response => response.json())
.then(galleries => {
    galleries.map(gallery => {
        const galleryTableRow = document.createElement("tr");

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
    });

});

function deleteGallery(galleryId) {
    console.log(galleryId);
}
