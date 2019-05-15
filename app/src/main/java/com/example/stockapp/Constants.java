package com.example.stockapp;

import java.util.HashMap;

public class Constants {

    public static HashMap<String, String> dbTableMap = new HashMap<String, String>() {{
        put("hm.db", "products_swords");
        put("jackwills.db", "products_dublin");
    }};
}
