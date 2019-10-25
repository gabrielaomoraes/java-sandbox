package com.sandbox.java11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Java11Application {

    /*public void isBlank(String str) {
        if (str.isBlank()) {
            System.out.println("This string is blank!");
        } else {
            System.out.println(str + " --> This string is NOT blank!");
        }
    }

    public void strip(String str) {

        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");
    }

    public Path writeString(String fileNamePrefix, String fileNameSuffix, String fileContent) throws Exception {
        Path path = Files.writeString(Files.createTempFile(fileNamePrefix, fileNameSuffix), fileContent);
        System.out.println(path);
        return path;
    }

    public void readString(Path path) throws Exception {
        String s = Files.readString(path);
        System.out.println(s);
    }*/

    /*public void splitStringByLines (String str) {
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));
    }*/
}
