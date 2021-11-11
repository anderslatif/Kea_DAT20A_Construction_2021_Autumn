function updateGallery(gallery) {
    const tableRowToUpdate = document.getElementById(gallery.id);


    tableRowToUpdate.innerHTML = `
        <td>
            <input value="${escapeHTML(gallery.name)}">
        </td>
        <td>
            <input value="${escapeHTML(gallery.location)}">
        </td>
       <td>
            <input value="${escapeHTML(gallery.owner)}">
        </td>
       <td>
            <input value="${escapeHTML(gallery.squareFeet.toString())}">
        </td>
        <td>
            <button id="cancel-update-${gallery.id}">✖️</button>
            <button onclick="">✅</button>
        </td>
        <td>
            <button onclick="deleteGallery(${gallery.id})">❌</button>
        </td>
    `;

    document.getElementById(`cancel-update-${gallery.id}`)
        .addEventListener("click", () => undoUpdateTableRow(gallery))
}

function undoUpdateTableRow(gallery) {
    console.log(gallery);
}

function updateGalleryInBackend() {

}

