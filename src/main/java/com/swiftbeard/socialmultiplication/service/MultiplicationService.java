package com.swiftbeard.socialmultiplication.service;

import com.swiftbeard.socialmultiplication.domain.Multiplication;
import com.swiftbeard.socialmultiplication.domain.MultiplicationResultAttempt;

import java.util.List;

public interface MultiplicationService {

    Multiplication createRandomMultiplication();
    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
    List<MultiplicationResultAttempt> getStatsForUser(final String userAlias);
}
