function updateGallery(galleryId) {
    const tableRowToUpdate = document.getElementById(galleryId);

    const galleryToUpdate = {
        id: galleryId,
        name: tableRowToUpdate.getElementsByClassName("row-gallery-name")[0].innerText,
        location: tableRowToUpdate.getElementsByClassName("row-gallery-location")[0].innerText,
        owner: tableRowToUpdate.getElementsByClassName("row-gallery-owner")[0].innerText,
        squareFeet: tableRowToUpdate.getElementsByClassName("row-gallery-square-feet")[0].innerText
    };

    tableRowToUpdate.innerHTML = `
        <td>
            <input value="${escapeHTML(galleryToUpdate.name)}">
        </td>
        <td>
            <input value="${escapeHTML(galleryToUpdate.location)}">
        </td>
       <td>
            <input value="${escapeHTML(galleryToUpdate.owner)}">
        </td>
       <td>
            <input value="${escapeHTML(galleryToUpdate.squareFeet)}">
        </td>
        <td>
            <button id="cancel-update-${galleryId}">✖️</button>
            <button onclick="">✅</button>
        </td>
        <td>
            <button onclick="deleteGallery(${galleryId})">❌</button>
        </td>
    `;
}

function undoUpdateTableRow(gallery) {
    console.log(gallery);
}

function updateGalleryInBackend() {

}

