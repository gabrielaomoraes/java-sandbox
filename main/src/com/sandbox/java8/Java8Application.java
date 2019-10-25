package com.sandbox.java8;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Application {

    public void isBlank(String str) {

        if (str == null || str.trim().isEmpty()) {
            System.out.println(str + "--> This string is blank");
        } else {
            System.out.println(str + " --> This string is NOT blank!");
        }
    }

    public void strip(String str) {
        System.out.print("Start");
        System.out.print(str.trim());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(trimStart(str));
        System.out.println("End");

        System.out.print("Start");
        System.out.print(trimEnd(str.trim()));
        System.out.println("End");

    }

    public Path writeString(String fileNamePrefix, String fileNameSuffix, String fileContent) throws Exception {
        Path file = Files.write(Paths.get(fileNamePrefix + fileNameSuffix), fileContent.getBytes());
        return file.getName(0);
    }

    public void readString(Path path) throws Exception {
        Stream<String> lines = Files.lines(path);
        String data = lines.collect(Collectors.joining("\n"));
        System.out.println(data);
    }

    public static String trimEnd(String value) {
        // Use replaceFirst to remove trailing spaces.
        return value.replaceFirst("\\s+$", "");
    }

    public static String trimStart(String value) {
        // Remove leading spaces.
        return value.replaceFirst("^\\s+", "");
    }

    public void splitStringByLines(String str) {
        String[] strSplit = str.split("\\s*,\\s*");
        List<String> result = Arrays.stream(strSplit).collect(Collectors.toList());
        result.stream().forEach(s -> System.out.println(s));
    }

}
