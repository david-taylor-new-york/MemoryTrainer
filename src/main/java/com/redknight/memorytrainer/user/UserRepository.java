package com.redknight.memorytrainer.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User getUserByUserId(long userId);
}
