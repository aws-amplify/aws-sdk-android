/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.internal.core.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import com.amazonaws.SDKGlobalConfiguration;

/**
 * A utility class for date marshalling
 */
public final class DateUtil {

    private static final DateFormat ISO_DATE_FORMATTER_UTC;
    private static final String DATE_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private static final long SECS = 1000L;

    static {
        ISO_DATE_FORMATTER_UTC = new SimpleDateFormat(DATE_FORMAT_STRING, Locale.US);
        ISO_DATE_FORMATTER_UTC.setTimeZone(TimeZone.getTimeZone("UTC"));
    }

    private DateUtil() {
    }

    private static synchronized DateFormat getDateFormat() {
        // date formats are not thread safe, so we must synchronize it since
        // this is shared
        return ISO_DATE_FORMATTER_UTC;
    }

    /**
     * get date in iso format "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"
     *
     * @param millis the time in milli seconds
     * @return the formatted date.
     */
    public static synchronized String isoDateFromMillis(long millis) {
        return getDateFormat().format(new Date(millis));
    }

    /**
     * Creates a DateFormat object using the specified format string that is
     * independent of Locale
     *
     * @param dateFormatString The date format string to use when formatting a
     *                         date
     * @return A Locale Independent DateFormat object
     */
    public static DateFormat createLocaleIndependentDateFormatter(String dateFormatString) {
        return new SimpleDateFormat(dateFormatString, Locale.US);
    }

    /**
     * @return A date object taking the devices clock skew into configuration if
     * neccesary
     */
    public static Date getCorrectedDate() {
        Date dateValue = new Date();
        if (SDKGlobalConfiguration.getGlobalTimeOffset() != 0) {
            long epochMillis = dateValue.getTime();
            epochMillis -= Long.valueOf(SDKGlobalConfiguration.getGlobalTimeOffset()) * SECS;
            dateValue = new Date(epochMillis);
        }
        return dateValue;
    }
}
