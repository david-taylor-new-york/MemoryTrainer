package com.redknight.memorytrainer.cardresult;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class CardResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cardResultId;
    private long cardId;
    private LocalDateTime timeOfGuess;
    private String guess;
    private double timeToRespond;

    public long getCardResultId() {
        return cardResultId;
    }

    public void setCardResultId(long cardResultId) {
        this.cardResultId = cardResultId;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public LocalDateTime getTimeOfGuess() {
        return timeOfGuess;
    }

    public void setTimeOfGuess(LocalDateTime timeOfGuess) {
        this.timeOfGuess = timeOfGuess;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }

    public double getTimeToRespond() {
        return timeToRespond;
    }

    public void setTimeToRespond(double timeToRespond) {
        this.timeToRespond = timeToRespond;
    }
}
