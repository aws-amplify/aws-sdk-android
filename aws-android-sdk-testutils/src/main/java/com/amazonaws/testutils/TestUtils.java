
package com.amazonaws.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public enum TestUtils {
    ;
    public static String yyMMdd_hhmmss() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd-hhmmss", Locale.US);
        return sdf.format(new Date());
    }
}
