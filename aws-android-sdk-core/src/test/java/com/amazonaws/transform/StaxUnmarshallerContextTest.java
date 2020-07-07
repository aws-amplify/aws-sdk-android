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

package com.amazonaws.transform;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

@RunWith(RobolectricTestRunner.class)
public class StaxUnmarshallerContextTest {
    private static final XmlPullParserFactory factory;
    static {
        try {
            factory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException(e);
        }
    }

    private static final String XML_STRING =
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                    + "<DescribeImagesResponse xmlns=\"http://ec2.amazonaws.com/doc/2014-05-01/\">"
                    + "  <requestId>12345</requestId>"
                    + "  <architecture>architecture value</architecture>"
                    + "  <imageSet>"
                    + "    <item>"
                    + "      <id>id</id>"
                    + "    </item>"
                    + "    <item>"
                    + "      <id>id</id>"
                    + "    </item>"
                    + "  </imageSet>"
                    + "</DescribeImagesResponse>";

    private StaxUnmarshallerContext context;

    private StaxUnmarshallerContext getContext(String xml, Map<String, String> headers)
            throws Exception {
        XmlPullParser xpp = factory.newPullParser();
        Reader reader = new StringReader(xml);
        xpp.setInput(reader);
        return new StaxUnmarshallerContext(xpp, headers);
    }

    @Test
    public void testParse() throws Exception {
        context = getContext(XML_STRING, null);
        assertTrue("start of document", context.isStartOfDocument());

        // test nextEvent(), getCurrentDepth(), and readText()
        assertTrue("/DescribeImagesResponse", context.nextEvent() == XmlPullParser.START_TAG);
        assertTrue(context.getCurrentDepth() == 1);
        assertTrue("/DescribeImagesResponse/requestId",
                context.nextEvent() == XmlPullParser.START_TAG);
        assertTrue(context.getCurrentDepth() == 2);
        assertEquals("requestId", "12345", context.readText());
        assertTrue("depth reduced by 1 after readText()", context.getCurrentDepth() == 1);

        assertTrue("/DescribeImagesResponse/architecture",
                context.nextEvent() == XmlPullParser.START_TAG);
        assertTrue(context.getCurrentDepth() == 2);
        assertEquals("architecture", "architecture value", context.readText());

        assertTrue("/DescribeImagesResponse/imageSet",
                context.nextEvent() == XmlPullParser.START_TAG);
        assertTrue(context.getCurrentDepth() == 2);
        assertTrue("/DescribeImagesResponse/imageSet/item",
                context.nextEvent() == XmlPullParser.START_TAG);
        assertTrue(context.getCurrentDepth() == 3);
        assertTrue("/DescribeImagesResponse/imageSet/item/id",
                context.nextEvent() == XmlPullParser.START_TAG);
        assertTrue(context.getCurrentDepth() == 4);

        // test testExpression
        assertTrue(". always match", context.testExpression(".", 4));
        assertTrue(context.testExpression("id", 4));
        assertTrue("default is current depth", context.testExpression("id"));
        assertTrue(context.testExpression("item/id", 3));
        assertTrue(context.testExpression("imageSet/item/id", 2));
        assertFalse("depth not match", context.testExpression("imageSet/item/id", 3));
        assertFalse("expression not match", context.testExpression("imageSet/item_id", 2));
    }

    @Test
    public void testMetadata() throws Exception {
        String key = "AWS_REQUEST_ID";
        context = getContext(XML_STRING, null);
        context.registerMetadataExpression("ResponseMetadata/RequestId", 2, key);
        context.registerMetadataExpression("requestId", 2, key);
        while (context.nextEvent() != XmlPullParser.END_DOCUMENT)
            ;
        assertNotNull(context.getMetadata().get(key));
        assertEquals("request id", "12345", context.getMetadata().get(key));
    }

    @Test
    public void testHeader() throws Exception {
        Map<String, String> headers = new HashMap<String, String>();
        headers.put("key", "value");
        context = getContext("", headers);
        assertNull("non existing key", context.getHeader("invalid key"));
        assertEquals("header value", "value", context.getHeader("key"));
    }
}
