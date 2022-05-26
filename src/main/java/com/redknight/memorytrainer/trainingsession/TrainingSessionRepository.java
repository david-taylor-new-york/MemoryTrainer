package com.redknight.memorytrainer.trainingsession;

import org.springframework.data.repository.CrudRepository;

public interface TrainingSessionRepository  extends CrudRepository<TrainingSession, Integer> {

    TrainingSession findTrainingSessionByTrainingSessionId(long trainingSessionId);
}
