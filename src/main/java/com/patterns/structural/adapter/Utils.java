package com.patterns.structural.adapter;

import java.util.regex.Pattern;

public class Utils {

    public static String getExtension(String file){
        var fileSplit = file.split(Pattern.quote("."));
        return fileSplit[1];
    }
}
