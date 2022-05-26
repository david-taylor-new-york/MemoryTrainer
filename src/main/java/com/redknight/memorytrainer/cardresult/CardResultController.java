package com.redknight.memorytrainer.cardresult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class CardResultController {

    @Autowired
    private CardResultRepository cardResultRepository;

    @PostMapping("/addCardResult")
    public String addCardResult(@RequestParam long cardId, @RequestParam LocalDateTime timeOfGuess, @RequestParam String guess, @RequestParam double timeToRespond) {
        CardResult cardResult = new CardResult();
        cardResult.setCardId(cardId);
        cardResult.setTimeOfGuess(timeOfGuess);
        cardResult.setGuess(guess);
        cardResult.setTimeToRespond(timeToRespond);
        cardResultRepository.save(cardResult);
        return "Added new card result to repo!";
    }

    @GetMapping("/getAllCardResults")
    public Iterable<CardResult> getAllCardResults() {
        return cardResultRepository.findAll();
    }

    @GetMapping("/getCardResultsByCardId/{cardId}")
    public List<CardResult> getCardResulstByCardId(@PathVariable long cardId) {
        return cardResultRepository.getCardResultsByCardId(cardId);
    }

}
