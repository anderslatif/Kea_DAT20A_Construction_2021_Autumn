const createGalleryForm = `// todo create the HTML form here`;


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


document.getElementById("expand-gallery-form").addEventListener("click",
    () => console.log("todo expand gallery form"));
