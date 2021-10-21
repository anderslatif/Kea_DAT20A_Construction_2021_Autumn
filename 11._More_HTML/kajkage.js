/*const list = [1, 2, 3, 4, 5];

const squaredList = list.map(number => number * number);

console.log(squaredList);

// hint: takes a predicate:
const isOdd = list.filter(number => number % 2 === 0);
console.log(isOdd);*/

const kajkager = [{
    type: "Andrea",
    color: "blue",
    deliciousness: 8
},
{
    type: "Kaj",
    color: "brown",
    deliciousness: 1
}];

kajkager.push({
    type: "Kaj",
    color: "green",
    deliciousness: 10
});

const tbodyElement = document.getElementById("cake-tbody");

/* what is??? XSS === cross site scripting */

kajkager.map(cake => {
    const tableRowElement = document.createElement("tr");

    tableRowElement.innerHTML = `
        <td>${escapeHTML(cake.type)}</td>
        <td>${escapeHTML(cake.color)}</td>
        <td>${escapeHTML(cake.deliciousness.toString())}/10</td>
`;

    tbodyElement.appendChild(tableRowElement);
});
