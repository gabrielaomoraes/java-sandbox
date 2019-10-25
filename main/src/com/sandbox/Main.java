package com.sandbox;

import com.sandbox.java8.Java8Application;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Java8Application app = new Java8Application();

        app.isBlank("Hello world");
        app.isBlank("  ");
        app.isBlank(null);
    }

    public void usignVar() throws IOException {

        var stringList = new ArrayList<String>();

        var parameters = new HashMap<String, String>();

        URL url = new URL("http://example.com");
        var httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setRequestMethod("GET");

    }
}
