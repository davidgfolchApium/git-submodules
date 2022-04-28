package com.apiumhub.articles.gitsubmodules;

import static java.util.regex.Pattern.quote;

public class Helper {

    private Helper() {}

    public static final String MSS2_SERVER = "http://localhost:8082";
    public static final String USER_JOHN = "{ \"name\": \"John\", \"age\": 40 }";

    public static String addToUser(String value) {
        return USER_JOHN.replaceAll(quote("}"), ", \"bank\": " + value + '}');
    }

}
