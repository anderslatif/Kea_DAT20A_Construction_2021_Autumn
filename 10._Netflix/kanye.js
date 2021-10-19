fetch("https://api.kanye.rest/")
.then(response => response.json())
.then(result => {
    console.log(result.quote)
});

//todo put the quote on the website
// you are allowed to change the HTML as well