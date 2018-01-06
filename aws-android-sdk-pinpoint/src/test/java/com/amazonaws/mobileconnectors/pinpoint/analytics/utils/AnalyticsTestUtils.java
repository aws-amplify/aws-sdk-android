/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.pinpoint.analytics.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class AnalyticsTestUtils {
    public static class ISODateStringMatcher extends TypeSafeMatcher<String> {

        private final long delta;

        public ISODateStringMatcher(final long delta) {
            this.delta = delta;
        }

        @Factory
        public static <T> Matcher<String> withinISODate(final long delta) {
            return new ISODateStringMatcher(delta);
        }

        @Override
        public void describeTo(Description description) {
            description
                    .appendText(String.format("an ISO formatted date within %ld of now (UTC)",
                                                     delta));
        }

        @Override
        public boolean matchesSafely(String item) {
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'",
                                                            Locale.US);
            format.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date dateToCompare;
            try {
                dateToCompare = format.parse(item);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }

            return Math.abs(dateToCompare.getTime() -
                                    System.currentTimeMillis()) < delta;
        }
    }
}
