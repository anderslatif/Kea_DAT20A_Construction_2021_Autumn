const queryString = window.location.search;
const urlParams = new URLSearchParams(queryString);
const storeId = parseInt(urlParams.get("storeId"));

const pricesDiv = document.getElementById("prices-display-case");

// todo shouldn't be hardcoded
const prices = [
    { id: 1, price: 84.00, size: "10px", color: "green" },
    { id: 2, price: 8.28, size: "18px", color: "red" }
];
prices.map(displayPrice)

function displayPrice(price) {
    const priceTagParagraph = document.createElement("p");

    priceTagParagraph.id = price.id;
    priceTagParagraph.innerText = price.price;
    priceTagParagraph.style.position = "absolute";
    priceTagParagraph.style.fontSize = price.size;
    priceTagParagraph.style.color = price.color;
    priceTagParagraph.style.top = getRandomInteger(0, 100) + "%";
    priceTagParagraph.style.left = getRandomInteger(0, 100) + "%";

    pricesDiv.append(priceTagParagraph);
}

function createPrice() {
    // todo send the price to the backend to be created
    const price = {
        price: getRandomFloat(1, 35),
        size: getRandomInteger(4, 38) + "px",
        color: getRandomColor()
    };
    displayPrice(price);
}

function getRandomInteger(min, max) {
    return Math.floor((Math.random() * (max - min)) + min);
}

function getRandomFloat(min, max) {
    return ((Math.random() * (max - min)) + min).toFixed(2);
}

function getRandomColor() {
    let hexNumber = (Math.random() * 0xfffff * 1000000).toString(16);
    return '#' + hexNumber.slice(0, 6);
}

document.addEventListener("click", (event) => {
    if (Number(event.target.id) && (event.ctrlKey || event.metaKey)) {
        event.target.remove();
        // todo delete in the backend
    } else {
        createPrice();
    }
});

