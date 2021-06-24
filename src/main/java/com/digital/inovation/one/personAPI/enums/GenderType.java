package com.digital.inovation.one.personAPI.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum GenderType {

    MALE("male"),
    FEMALE("female"),
    OTHER("other");

    private final String description;
}
