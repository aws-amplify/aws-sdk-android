/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util;

import com.amazonaws.SDKGlobalConfiguration;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class DateUtil {

    private static final DateFormat ISO_DATE_FORMATTER_UTC;
    private static final String DATE_FORMAT_STRING = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";

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

    public static synchronized String isoDateFromMillis(long millis) {
        return getDateFormat().format(new Date(millis));
    }

    /**
     * Creates a DateFormat object using the specified format string that is
     * independent of Locale
     *
     * @param dateFormatString The date format string to use when formatting a
     *            date
     * @return A Locale Independent DateFormat object
     */
    public static DateFormat createLocaleIndependentDateFormatter(String dateFormatString) {
        return new SimpleDateFormat(dateFormatString, Locale.US);
    }

    /**
     * @return A date object taking the devices clock skew into configuration if
     *         neccesary
     */
    public static Date getCorrectedDate() {
        Date dateValue = new Date();
        if (SDKGlobalConfiguration.getGlobalTimeOffset() != 0) {
            long epochMillis = dateValue.getTime();
            epochMillis -= SDKGlobalConfiguration.getGlobalTimeOffset() * 1000;
            dateValue = new Date(epochMillis);
        }
        return dateValue;
    }
}
