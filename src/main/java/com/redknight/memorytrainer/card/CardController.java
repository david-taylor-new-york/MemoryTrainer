package com.redknight.memorytrainer.card;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @PostMapping("/addCard")
    public String addCard(@RequestParam long userId, @RequestParam long subjectId, @RequestParam long precedesCardId, @RequestParam String question, @RequestParam String answer) {
        Card card = new Card();
        card.setUserId(userId);
        card.setSubjectId(subjectId);
        card.setPrecedesCardId(precedesCardId);
        card.setQuestion(question);
        card.setAnswer(answer);
        card.setCreatedDate(LocalDateTime.now());
        cardRepository.save(card);
        return "Added new card:" + card.toString();
    }

    @GetMapping("/getAllCards")
    public Iterable<Card> getAllCards() {
        return cardRepository.findAll();
    }

    @GetMapping("/getCardByCardId/{cardId}")
    public Card getCardByCardId(@PathVariable long cardId) {
        return cardRepository.getCardByCardId(cardId);
    }

    @GetMapping("/getCardsBySubjectId/{subjectId}")
    public Iterable<Card> getCardsBySubjectId(@PathVariable long subjectId) {
        Iterable<Card> cardsBySubjectId = getAllCards();
        List<Card> cardsToReturn = new ArrayList<>();
        for (Card card : cardsBySubjectId) {
            if (card.getSubjectId() == subjectId) {
                cardsToReturn.add(card);
            }
        }
        return cardsToReturn;
    }

}
