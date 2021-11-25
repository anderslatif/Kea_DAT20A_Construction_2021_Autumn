const queryString = window.location.search;
const urlParams = new URLSearchParams(queryString);
const storeId = parseInt(urlParams.get("storeId"));

const pricesDiv = document.getElementById("prices-display-case");

const prices = [
    { id: 1, price: 84.00, size: "10px", color: "green" },
    { id: 2, price: 8.28, size: "18px", color: "red" }
];
prices.map(displayPrice)

function displayPrice(price) {
    const priceTagParagraph = document.createElement("p");

    priceTagParagraph.innerText = price.price.toFixed(2);
    priceTagParagraph.style.position = "absolute";
    priceTagParagraph.style.fontSize = price.size;
    priceTagParagraph.style.color = price.color;

    pricesDiv.append(priceTagParagraph);
}