package com.mz.mynotes.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utility {

    public static String getCurrentTimestamp() {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
            String currentDateTime = dateFormat.format(new Date());

            return currentDateTime;
        } catch(Exception e) {
            return null;
        }
    }
}
