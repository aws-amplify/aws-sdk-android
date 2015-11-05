/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.joda.time.tz.FixedDateTimeZone;
import org.junit.Ignore;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;

public class DateUtilsTest {
    private static final boolean DEBUG = false;

    private final DateTimeZone GMT = new FixedDateTimeZone("GMT", "GMT", 0, 0);
    private final DateTimeFormatter iso8601DateFormat =
            ISODateTimeFormat.dateTime().withZone(GMT);
    private final DateTimeFormatter alternateIso8601DateFormat =
            DateTimeFormat.forPattern(DateUtils.ALTERNATE_ISO8601_DATE_PATTERN).withZone(GMT);
    private final DateTimeFormatter rfc822DateFormat =
            DateTimeFormat.forPattern(DateUtils.RFC822_DATE_PATTERN)
                    .withLocale(Locale.US)
                    .withZone(GMT);
    private final DateTimeFormatter compressedIso8601DateFormat =
            DateTimeFormat.forPattern(DateUtils.COMPRESSED_DATE_PATTERN)
                    .withZone(GMT);

    @Test
    public void tt0031561767() throws ParseException {
        String input = "Fri, 16 May 2014 23:56:46 GMT";
        Date date = DateUtils.parseRFC822Date(input);
        assertEquals(input, DateUtils.formatRFC822Date(date));
    }

    @Test
    public void testIso8601Date() {
        Date date = new Date();
        String expected = iso8601DateFormat.print(date.getTime());
        String actual = DateUtils.formatISO8601Date(date);
        assertEquals(expected, actual);

        Date expectedDate = new Date(iso8601DateFormat.parseMillis(expected));
        Date actualDate = DateUtils.parseISO8601Date(actual);
        assertEquals(expectedDate, actualDate);
    }

    @Ignore("Joda has issue handling format string 'z'")
    @Test
    public void testRfc822Date() {
        Date date = new Date();
        String expected = rfc822DateFormat.print(date.getTime());
        String actual = DateUtils.formatRFC822Date(date);
        assertEquals(expected, actual);

        Date expectedDate = new Date(rfc822DateFormat.parseMillis(expected));
        Date actualDate = DateUtils.parseRFC822Date(actual);
        assertEquals(expectedDate, actualDate);
    }

    @Test
    public void testCompressedIso8601Date() throws ParseException {
        Date date = new Date();
        String formatted = compressedIso8601DateFormat.print(date.getTime());
        Date expected = new Date(compressedIso8601DateFormat.parseMillis(formatted));
        Date actual = DateUtils.parseCompressedISO8601Date(formatted);
        assertEquals(expected, actual);
    }

    @Test
    public void testAlternativeIso8601Date() throws ParseException {
        Date date = new Date();
        String formatted = alternateIso8601DateFormat.print(date.getTime());

        Date expectedDate = new Date(alternateIso8601DateFormat.parseMillis(formatted));
        Date actualDate = DateUtils.parseISO8601Date(formatted);
        assertEquals(expectedDate, actualDate);
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidDate() throws ParseException {
        final String input = "2014-03-06T14:28:58.000 Z";
        System.out.println(DateUtils.parseISO8601Date(input));
    }

    @Test
    public void testIssue233() throws ParseException {
        // https://github.com/aws/aws-sdk-java/issues/233
        final String edgeCase = "292278994-08-17T07:12:55.807Z";
        Date expected = DateUtils.parseISO8601Date(edgeCase);
        String formatted = DateUtils.formatISO8601Date(expected);
        if (DEBUG)
            System.out.println("formatted: " + formatted);
        assertEquals(edgeCase, formatted);
        Date parsed = DateUtils.parseISO8601Date(edgeCase);
        if (DEBUG)
            System.out.println("parsed: " + parsed);
        assertEquals(expected, parsed);
    }

    @Test
    public void testIssue233JodaTimeLimit() throws ParseException {
        // https://github.com/aws/aws-sdk-java/issues/233
        String s = DateUtils.formatISO8601Date(new Date(Long.MAX_VALUE));
        System.out.println("s: " + s);
        Date date = DateUtils.parseISO8601Date(s);
        System.out.println("date: " + date);
    }

    @Test
    public void testIssueDaysDiff() throws ParseException {
        // https://github.com/aws/aws-sdk-java/issues/233
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        sdf.setTimeZone(new SimpleTimeZone(0, "GMT"));
        String edgeCase = "292278994-08-17T07:12:55.807Z";
        String testCase = "292278993-08-17T07:12:55.807Z";
        Date od = DateUtils.parseISO8601Date(edgeCase);
        Date testd = DateUtils.parseISO8601Date(testCase);
        long diff = od.getTime() - testd.getTime();
        assertTrue(diff == 365L * 24 * 60 * 60 * 1000);
    }

    @Test
    public void testIssue233Overflows() throws ParseException {
        String[] cases = {
                // 1 milli second passed the max time
                "292278994-08-17T07:12:55.808Z",
                // 1 year passed the max year
                "292278995-01-17T07:12:55.807Z",
        };
        for (String edgeCase : cases) {
            try {
                Date parsed = DateUtils.parseISO8601Date(edgeCase);
                System.out.println("date: " + parsed);
                fail("Unexpected success: " + parsed);
            } catch (IllegalArgumentException ex) {
                assertTrue(ex.getCause() instanceof ParseException);
            }
        }
    }
}
