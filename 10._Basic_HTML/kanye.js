function getKanyeQuote() {
    fetch("https://api.kanye.rest/")
        .then(response => response.json())
        .then(result => {
            const quoteHeader = document.getElementById("kanye-quote");
            quoteHeader.innerText = result.quote;
        });
}
getKanyeQuote();


document.getElementById("btn-laugh").addEventListener("click", () => addQuoteToList("laugh"));
document.getElementById("btn-wtf").addEventListener("click", () => addQuoteToList("wtf"));
document.getElementById("btn-horny").addEventListener("click", () => addQuoteToList("horny"));

// todo only allow the quote to be added once

function addQuoteToList(listName) {
    const quote = document.getElementById("kanye-quote").innerText;
    const paragraph = document.createElement("p");
    paragraph.innerText = quote;
    document.getElementById("list-"+listName).appendChild(paragraph);
}

setInterval(getKanyeQuote, 10000);
