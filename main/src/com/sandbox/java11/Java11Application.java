package com.sandbox.java11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Java11Application {

    public void isBlank(String str) {
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

    /**
     * Files.writeString() method introduced in Java 11
     */
    public Path writeString(String fileNamePrefix, String fileNameSuffix, String fileContent) throws Exception {
        Path path = Files.writeString(Files.createTempFile(fileNamePrefix, fileNameSuffix), fileContent);
        System.out.println(path);
        return path;
    }

    public void readString(Path path) throws Exception {
        String s = Files.readString(path);
        System.out.println(s);
    }

    /**
     * String.lines() method introduced in Java 11
     */
    public void splitStringByLines(String str) {
        System.out.println(str);
        System.out.println(str.lines().collect(Collectors.toList()));
    }

    /**
     *  Factory methods introduced in Java 9
     */
    public void collectionsInitialization() {
        // List
        List<String> unmodifiableList = List.of("java", "php", "python", "c++");

        // Set
        Set<String> bar = Set.of("cat", "dog", "rat", "frog");

        // Map
        Map<Integer, String> newEntryMap = Map.ofEntries(
                Map.entry(20, "twenty"),
                Map.entry(30, "thirty"),
                Map.entry(40, "forty")
        );

        Map<Integer, String> immutableMapEntry = Map.of(20, "twenty", 30, "thirty");
    }

}
