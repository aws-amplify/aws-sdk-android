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

import org.junit.Test;

import java.io.StringWriter;
import java.util.Calendar;
import java.util.Date;

public class XMLWriterTests {

    @Test
    public void testEscapeXMLEntitiesProperlyEscapedFromString() {

        String expectedString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Test>quote &quot;&quot; apostrophe &apos;&apos; lessthan &lt;&lt; greaterthan &gt;&gt; ampersand &amp;&amp;</Test>";
        StringWriter sw = new StringWriter();
        XMLWriter xw = new XMLWriter(sw);
        xw.startElement("Test");
        xw.value("quote &quot;\" apostrophe &apos;' lessthan &lt;< greaterthan &gt;> ampersand &amp;&");
        xw.endElement();
        sw.flush();

        assertEquals(sw.toString(), expectedString);
    }

    @Test
    public void testEscapeXMLEntitiesProperlyEscapedFromObject() {

        final String objectValue = "quote &quot;&quot; apostrophe &apos;&apos; lessthan &lt;&lt; greaterthan &gt;&gt; ampersand &amp;&amp;";
        String expectedString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Test>" + objectValue
                + "</Test>";
        Object objectToWrite = new Object() {
            @Override
            public String toString() {
                return objectValue;
            }
        };

        StringWriter sw = new StringWriter();
        XMLWriter xw = new XMLWriter(sw);
        xw.startElement("Test");
        xw.value(objectToWrite);
        xw.endElement();
        sw.flush();

        assertEquals(sw.toString(), expectedString);
    }

    @Test
    public void testXMLWriterWithDates() {

        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2015, 4, 24);
        Date date = cal.getTime();

        String expectedString = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><Test>"
                + StringUtils.fromDate(date) + "</Test>";
        StringWriter sw = new StringWriter();
        XMLWriter xw = new XMLWriter(sw);
        xw.startElement("Test");
        xw.value(date);
        xw.endElement();
        sw.flush();

        assertEquals(sw.toString(), expectedString);
    }

}
