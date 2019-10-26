package com.sandbox.java13;

import java.time.DayOfWeek;

public class Java13Application {

    public void improvedSwitchExpressions(DayOfWeek day){

        String result = switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> {
                yield  "Weekday";
            }
            case SUNDAY, SATURDAY -> {
                yield  "Weekend";
            }
        };

        System.out.println(result);
    }

    public void textBlocks(){

        // Without Text Blocks
        String messyHtmlTextBlock =  "<html>\n" +
                "   <body>\n" +
                "      <p>Hello, Escapes</p>\n" +
                "   </body>\n" +
                "</html>\n";

        // With Text Blocks
        String html = """
            <html>
                <body>
                <p>Hello, Text Blocks</p>
                </body>
            </html>""";

    }

}
