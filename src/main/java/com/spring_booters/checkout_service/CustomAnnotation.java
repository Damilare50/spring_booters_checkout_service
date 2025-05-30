package com.spring_booters.checkout_service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
public @interface CustomAnnotation {

    //todo: complete both checkout and credit card validator
    //todo: create your own custom annotation and use it
    //todo: if feeling motivated, create your own big decimal class
}


