package com.redknight.memorytrainer.card;

import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card, Integer> {

    Card getCardByCardId(long cardId);

}
