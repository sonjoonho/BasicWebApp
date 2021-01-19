package com.develogical;

import java.util.HashMap;
import java.util.Map;

public class QueryProcessor {

    Map<String, String> queries = new HashMap<String, String>() {{
        put("shakespeare", "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                "English poet, playwright, and actor, widely regarded as the greatest " +
                "writer in the English language and the world's pre-eminent dramatist.");
        put("kapilane", "A great man with a large brain.");
    }};

    public String process(String query) {
        String value = this.queries.get(query.toLowerCase());
        if (value != null) {
            return value;
        }
        return "";
    }
}
