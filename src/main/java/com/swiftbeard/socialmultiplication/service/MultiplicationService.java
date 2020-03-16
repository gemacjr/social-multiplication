package com.swiftbeard.socialmultiplication.service;

import com.swiftbeard.socialmultiplication.domain.Multiplication;
import com.swiftbeard.socialmultiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationService {

    Multiplication createRandomMultiplication();
    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);

}
