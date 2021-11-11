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
    // todo steps
    // 1. get values from the input fields
    // 2. fetch with PATCH

    const tableRowToUpdate = document.getElementById(galleryId);

    console.log(tableRowToUpdate);


}

