package org.example._2023_06_29_Stream_API;

import java.util.Optional;

public class Optional_Class {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("!!");
        if (optional.isPresent()){
            System.out.println(optional.get());
        }
    }
}
