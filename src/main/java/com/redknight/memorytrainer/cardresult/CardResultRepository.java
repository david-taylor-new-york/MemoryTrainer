package com.redknight.memorytrainer.cardresult;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CardResultRepository extends CrudRepository<CardResult, Integer> {

    List<CardResult> getCardResultsByCardId(long cardId);
}
