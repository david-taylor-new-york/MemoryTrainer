function fetchAllSubjectDropDownItems() {
    return fetch('/getAllSubjects')
        .then( (response) => response.json())
        .then( (data) => {
            if (JSON.stringify([]) !== JSON.stringify(data)) {
                data.forEach( (item) => {
                    document.getElementById('chooseSubject').innerHTML +=
                        `<option value=${item.subjectId}>${item.subjectName}</option>`;
                });
            } else {
                document.getElementById('chooseSubject').innerText = 'No subjects exist, please create one.';
            }
        })
        .catch(error => console.log("david = an error occured" + error));
}

function getSubjectNameBySubjectId(subjectId) {
    return fetch('/getSubjectBySubjectId/' + subjectId)
        .then( (response) => response.json())
        .then( (data) => {
            let subjectName = JSON.parse(JSON.stringify(data)).subjectName;
            document.getElementById('subjectPageHeader').innerHTML +=
                `<h3 id="subjectPageHeader" style="color:#0275D8">Subject: ${subjectName}</h3>`;
        })
}

function getSubjectIdFromQueryString() {
    const params = (new URL(document.location)).searchParams;
    const subjectId = params.get("subjectId");
    console.log("subjectId= " + subjectId);
    return subjectId
}