function getInnerQuestionHtml() {
    for (let i = 1; i <= 6; i++) {
        // document.getElementById('mt').innerHTML += getHeaderString(i, numberOfLettersToRemove);
        // numberOfLettersToRemove+=2;
    }
}

function startTraining() {

    const cards = getAllCardsBySubjectId();
    // for (let i = 0; i < cards.size()-1; i++) {
    //     let card = cards[i];
    //     getInnerQuestionHtml(card);
    // }

    console.log("first time cards= " + cards);
    return cards[0];
}
// when page is loaded:
//      getAllCardsBySubjectId(subjectId)
//      create set of cards to review
//      sort random
//      honor "precedesId"
//      return assembleHtml(w/ start button)


// after the start/submit (any) button is  hit you:
//      capture input value
//      compare to expected value
//      if input==expected {
//          assembleHtml(card, success);
//      } else {
//          assembleHtml(card, fail);

//      when loop is finished,
//          wrapUp(assembleHtml(wrapup);


// function startTraining() {
//     console.log("training started");
//     const table = document.getElementById("tableBodyId");
//     return { table.innerHTML +=
//             `<tr>
//                  <td><div>${item.cardId}</td>
//                  <td style="background-color: #CDCDCD"><div style="overflow: auto">${item.question}</td>
//                  <td style="background-color: #E9E9E9"><div style="overflow: auto">${item.answer}</td>
//             </tr>`}
// }

//
// public void reviewCards() {
//        Reviewer reviewer = new Reviewer();
//
//     /*
//     QuestionAnswer + Guess = Response
//      */

//     TrainingSession trainingSession = new TrainingSession(currentSubject.getName());
//     final Set<Card> cardsToReview = getCardsToReview();
//     if (cardsToReview.size()==0) { view.say(NO_CARDS_FOUND); return; }
//


//     for (Card card : cardsToReview) {
//         long startTime = System.currentTimeMillis();
//         String answer = askFor("<Question> " + card.getQuestion());
//         double timeToAnswer = (double) System.currentTimeMillis() - startTime;
//

// long cardId, LocalDateTime timeOfGuess, String guess,  double timeToRespond

//          Response response = new Response(card, LocalDateTime.now(), answer, timeToAnswer);
//

//         if (!answer.equalsIgnoreCase(card.getAnswer())) {
//             view.say(NOPE + card.getAnswer());
//         }
//
//         trainingSession.addResults(response); ==> POST <ITERATOR>cardId, <LocalDateTime> timeOfGuess, <INPUT> guess,  <TIMER> timeToRespond
//     }
//

//     trainingSession.conclude();
//     view.printTrainingSession(trainingSession);
//     resultsModel.addTrainingSession(trainingSession);
// }





// public void reviewCards() {
//        Reviewer reviewer = new Reviewer();
//
//     /*
//     QuestionAnswer + Guess = Response
//      */

//     TrainingSession trainingSession = new TrainingSession(currentSubject.getName());
//     final Set<Card> cardsToReview = getCardsToReview();
//     if (cardsToReview.size()==0) { view.say(NO_CARDS_FOUND); return; }
//
//     for (Card card : cardsToReview) {
//         long startTime = System.currentTimeMillis();
//         String answer = askFor("<Question> " + card.getQuestion());
//         double timeToAnswer = (double) System.currentTimeMillis() - startTime;
//
//         Response response = new Response(card, LocalDateTime.now(), answer, timeToAnswer);
//
//         if (!answer.equalsIgnoreCase(card.getAnswer())) {
//             view.say(NOPE + card.getAnswer());
//         }
//
//         trainingSession.addResults(response);
//     }
//
//     trainingSession.conclude();
//     view.printTrainingSession(trainingSession);
//     resultsModel.addTrainingSession(trainingSession);
// }
