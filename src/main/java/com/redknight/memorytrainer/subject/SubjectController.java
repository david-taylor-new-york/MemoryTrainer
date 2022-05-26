package com.redknight.memorytrainer.subject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class SubjectController {

    @Autowired
    private SubjectControllerRepository subjectControllerRepository;

    @PostMapping("/addSubject")
    public String addSubject(@RequestParam String subjectName) {
        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setCreatedDate(LocalDateTime.now());
        subjectControllerRepository.save(subject);
        return "Added new subject controller to repo!";
    }

    @GetMapping("/getAllSubjects")
    public Iterable<Subject> getAllSubjects() {
        return subjectControllerRepository.findAll();
    }

    @GetMapping("/getSubjectBySubjectId/{subjectId}")
    public Subject getSubjectById(@PathVariable long subjectId) {
        return subjectControllerRepository.getSubjectBySubjectId(subjectId);
    }

}
