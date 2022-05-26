package com.redknight.memorytrainer.trainingsession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class TrainingSessionController {

    @Autowired
    private TrainingSessionRepository trainingSessionRepository;

    @PostMapping("/addTrainingSession")
    public String addTrainingSession(@RequestParam long userId, @RequestParam long subjectId, @RequestParam LocalDateTime startTime, @RequestParam LocalDateTime endTime) {
        TrainingSession trainingSession = new TrainingSession();
        trainingSession.setUserId(userId);
        trainingSession.setSubjectId(subjectId);
        trainingSession.setStartTime(startTime);
        trainingSession.setEndTime(endTime);
        trainingSessionRepository.save(trainingSession);
        return "Added new training session to repo!";
    }

    @GetMapping("/getAllTrainingSessions")
    public Iterable<TrainingSession> getAllTrainingSessions() {
        return trainingSessionRepository.findAll();
    }

    @GetMapping("/getTrainingSessionByTrainingSessionId/{trainingSessionId}")
    public TrainingSession getTrainingSessionByTrainingSessionId(@PathVariable long trainingSessionId) {
        return trainingSessionRepository.findTrainingSessionByTrainingSessionId(trainingSessionId);
    }

}