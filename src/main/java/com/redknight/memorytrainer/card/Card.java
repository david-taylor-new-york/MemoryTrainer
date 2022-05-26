package com.redknight.memorytrainer.card;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cardId;
    private long userId;
    private long subjectId;
    private long precedesCardId;
    private String question;
    private String answer;
    private LocalDateTime createdDate;

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }

    public long getPrecedesCardId() {
        return precedesCardId;
    }

    public void setPrecedesCardId(long precedesCardId) {
        this.precedesCardId = precedesCardId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + cardId +
                ", userId=" + userId +
                ", subjectId=" + subjectId +
                ", precedesCardId=" + precedesCardId +
                ", question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}
