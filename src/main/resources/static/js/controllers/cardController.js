function getAllCardsBySubjectId(subjectId) {
    console.log("subjectId= " + subjectId);
    const table = document.getElementById("tableBodyId");
    return fetch('/getCardsBySubjectId/' + subjectId)
        .then( (response) => response.json())
        .then( (data) => {
            if (JSON.stringify([]) !== JSON.stringify(data)) {
                data.reverse().forEach( (item) => {
                    table.innerHTML +=
                        `<tr>
                             <td><div>${item.cardId}</td>
                             <td style="background-color: #CDCDCD"><div style="overflow: auto">${item.question}</td>
                             <td style="background-color: #E9E9E9"><div style="overflow: auto">${item.answer}</td>
                        </tr>`;
                });
            } else {
                document.getElementById("tbl").innerHTML =
                    `<thead>
                            <tr>
                                <td></td>
                                <td>No cards exist, please create some.</td>
                            </tr>
                        </thead>`;
            }
        })
        .catch(error => console.log("david, getAllCards = an error occured" + error));
}

