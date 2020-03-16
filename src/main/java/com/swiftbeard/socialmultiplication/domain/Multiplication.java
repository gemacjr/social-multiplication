package com.swiftbeard.socialmultiplication.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class Multiplication {

    // Both factors
    private final int factorA;
    private final int factorB;


    Multiplication(){
        this(0,0);
    }


}
