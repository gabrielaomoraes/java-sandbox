package com.sandbox;

import com.sandbox.java8.Java8Application;

import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        Java8Application app = new Java8Application();

        //var app = new Java11Application();

        app.isBlank("Hello world");
        app.isBlank("  ");
        //app.isBlank(null); NPE

        app.strip(" middle ");

        app.splitStringByLines("line1 \nline2 \nline3");

        try {
            Path path = app.writeString("JavaDevGirls", ".txt", "Java is cool!");
            // var path = app.writeString("JavaDevGirls", ".txt", "Java is cool!");
            app.readString(path);
        } catch (Exception e) {
            System.out.println("Something goes wrong...");
        }
    }
/*
    public void usignVar() throws IOException {

        var stringList = new ArrayList<String>();

        var parameters = new HashMap<String, String>();

        URL url = new URL("http://example.com");
        var httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");

    }*/
}
