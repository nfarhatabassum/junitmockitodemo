package com.learning.service;

public class StringUtilityImpl implements StringUtility{
    @Override
    public int getLengthOfString(String input) {
        if(input==null){
            throw new NullPointerException();
        }
        return input.length();
    }

    @Override
    public String convertToUpperCase(String input) {
        return input.toUpperCase();
    }

    @Override
    public boolean startsWithA(String input) {
        return input.startsWith("A");
    }
}
