package com.redknight.memorytrainer.subject;

import org.springframework.data.repository.CrudRepository;

public interface SubjectControllerRepository extends CrudRepository<Subject, Integer> {

    Subject getSubjectBySubjectId(long subjectId);
}
