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
}];

kajkager.push({
    type: "Kaj",
    color: "green",
    deliciousness: 10
});

const tbodyElement = document.getElementById("cake-tbody");

/* what is??? XSS === cross side scripting */

tbodyElement.innerHTML = escapeHTML("<script>test string</script>");


console.log(escapeHTML("<script>test string</script>"));