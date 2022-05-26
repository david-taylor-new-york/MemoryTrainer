function getDescendingFractalTextHeader() {
    let numberOfLettersToRemove = 0;
    for (let i = 1; i <= 6; i++) {
        document.getElementById('mt').innerHTML += getHeaderString(i, numberOfLettersToRemove);
        numberOfLettersToRemove+=2;
    }
}

function getHeaderString(level, numberOfLettersToRemove) {
    let headerString = Array.from(`<h${level}>Welcome to Mem Train!</h${level}>`);
    if (level === 6) { numberOfLettersToRemove = 0}
    for (let i = 1; i <= numberOfLettersToRemove; i++) {
        let randoNum = getRandomIntInclusive(4,24);
        while (headerString[randoNum] === " ") {
            randoNum = getRandomIntInclusive(4,24);
        }
        headerString[randoNum] = " ";
    }
    return headerString.join("");
}

function getRandomIntInclusive(min, max) {
    return Math.floor(Math.random() * ( Math.floor(max) - Math.ceil(min) + 1) + Math.ceil(min));
}
