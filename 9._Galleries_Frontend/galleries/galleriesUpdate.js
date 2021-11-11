function updateGallery(gallery) {
    const tableRowToUpdate = document.getElementById(gallery.id);

    tableRowToUpdate.innerHTML = `
        <td>
            <input id="update-gallery-name-${gallery.id}" value="${escapeHTML(gallery.name)}">
        </td>
        <td>
            <input id="update-gallery-location-${gallery.id}" value="${escapeHTML(gallery.location)}">
        </td>
       <td>
            <input id="update-gallery-owner-${gallery.id}" value="${escapeHTML(gallery.owner)}">
       </td>
       <td>
            <input id="update-gallery-square-feet-${gallery.id}" type="number" value="${escapeHTML(gallery.squareFeet.toString())}">
       </td>
       <td>
            <button id="cancel-update-${gallery.id}">✖️</button>
            <button onclick="updateGalleryInBackend(${gallery.id})">✅</button>
       </td>
       <td>
            <button onclick="deleteGallery(${gallery.id})">❌</button>
       </td>
    `;

    document.getElementById(`cancel-update-${gallery.id}`)
        .addEventListener("click", () => undoUpdateTableRow(gallery));
}

function undoUpdateTableRow(gallery) {
    const galleryTableRow = document.getElementById(gallery.id);

    constructGalleryTableRow(galleryTableRow, gallery);

    document.getElementById(`update-button-${gallery.id}`)
        .addEventListener("click", () => updateGallery(gallery));
}

function updateGalleryInBackend(galleryId) {

    const tableRowToUpdate = document.getElementById(galleryId);

    const galleryToUpdate = {
        id: galleryId,
        name: document.getElementById(`update-gallery-name-${galleryId}`).value,
        location: document.getElementById(`update-gallery-location-${galleryId}`).value,
        owner: document.getElementById(`update-gallery-owner-${galleryId}`).value,
        squareFeet: document.getElementById(`update-gallery-square-feet-${galleryId}`).value
    };

    fetch(baseURL + "/galleries/" + galleryId, {
        method: "PATCH",
        headers: { "Content-type": "application/json; charset=UTF-8" },
        body: JSON.stringify(galleryToUpdate)
    }).then(response => {
        if (response.status === 200) {
            constructGalleryTableRow(tableRowToUpdate, galleryToUpdate);
        }
    });

}

