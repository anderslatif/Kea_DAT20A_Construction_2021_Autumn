const galleriesWrapperElement = document.getElementById("galleries-wrapper");

fetch(baseURL + "/galleries")
.then(response => response.json())
.then(galleries => {
    galleries.map(gallery => {
        const galleryElement = document.createElement("div");

        galleryElement.innerHTML = `
            <a href="./gallery.html?galleryId=${gallery.id}">
                <p>${escapeHTML(gallery.name)}</p>
            </a>
        `;

        galleriesWrapperElement.appendChild(galleryElement);
    });
});

