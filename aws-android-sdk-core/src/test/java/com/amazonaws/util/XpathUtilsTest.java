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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

/**
 * Unit tests for the XpathUtils class.
 *
 * @author fulghum@amazon.com
 */
public class XpathUtilsTest {

    /** Test data for all tests to share */
    private static final String DOCUMENT =
            "<Foo>" +
                    "    <Title>Boo</Title>" +
                    "    <Count Foo='Bar'>1</Count>" +
                    "    <Enabled>true</Enabled>" +
                    "    <Usage>0.0000071759</Usage>" +
                    "    <Since>2008-10-07T11:51:50.000Z</Since>" +
                    "    <Item>A</Item>" +
                    "    <Item>B</Item>" +
                    "    <Item>C</Item>" +
                    "    <Empty></Empty>" +
                    "    <Blob>aGVsbG8gd29ybGQ=</Blob>" +
                    "    <PositiveByte>123</PositiveByte>" +
                    "    <NegativeByte>-99</NegativeByte>" +
                    "</Foo>";

    /** Test XML document with a namespace */
    private static final String DOCUMENT_WITH_NAMESPACE =
            "<?xml version=\"1.0\"?> \n"
                    +
                    "<AllocateAddressResponse xmlns=\"http://ec2.amazonaws.com/doc/2009-04-04/\"> \n"
                    +
                    "    <requestId>a074658d-7624-433e-b4e9-9271f6f5264b</requestId> \n" +
                    "    <publicIp>174.129.242.223</publicIp> \n" +
                    "</AllocateAddressResponse> \n";

    @Test
    public void testXmlDocumentWithNamespace() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT_WITH_NAMESPACE);
        Node root = XpathUtils.asNode("/", document);
        assertNotNull(root);
        Node node = XpathUtils.asNode("AllocateAddressResponse", document);
        assertNotNull(node);

    }

    @Test
    public void testGetRoot() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT);
        Node childTitleNode = XpathUtils.asNode("Foo/Title", document);
        Node childAsRoot = XpathUtils.asNode("/", childTitleNode);
        assertEquals("#document", childAsRoot.getNodeName());
    }

    @Test
    public void testAsString() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT);
        assertEquals("Boo", XpathUtils.asString("Foo/Title", document));
        assertEquals("", XpathUtils.asString("Foo/Empty", document));
        assertEquals("Bar", XpathUtils.asString("Foo/Count/@Foo", document));
        Document namespaceDocument = XpathUtils.documentFrom(DOCUMENT_WITH_NAMESPACE);
        assertEquals("174.129.242.223",
                XpathUtils.asString("/AllocateAddressResponse/publicIp", namespaceDocument));
    }

    @Test
    public void testAsInteger() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT);
        assertEquals((Integer) 1, XpathUtils.asInteger("Foo/Count", document));
        assertNull(XpathUtils.asInteger("Foo/Empty", document));
    }

    @Test
    public void testAsBoolean() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT);
        assertEquals(true, XpathUtils.asBoolean("Foo/Enabled", document));
        assertNull(XpathUtils.asBoolean("Foo/Empty", document));
    }

    @Test
    public void testAsFloat() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT);
        assertEquals((Float) 0.0000071759f, XpathUtils.asFloat("Foo/Usage", document));
        assertNull(XpathUtils.asFloat("Foo/Empty", document));
    }

    /**
     * Tests that we can correctly pull a Byte out of an XML document.
     */
    @Test
    public void testAsByte() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT);
        assertEquals(new Byte((byte) 123), XpathUtils.asByte("Foo/PositiveByte", document));
        assertEquals(new Byte((byte) -99), XpathUtils.asByte("Foo/NegativeByte", document));
        assertNull(XpathUtils.asByte("Foo/Empty", document));
    }

    /**
     * Tests that we can correctly parse out a Date from an XML document.
     */
    @Test
    public void testAsDate() throws Exception {
        /*
         * The example date in our test XML document is:
         * 2008-10-07T11:51:50.000Z So we construct that same date and verify
         * that it matches what we parsed out of the XML.
         */
        Calendar expectedDate = new GregorianCalendar();
        expectedDate.set(Calendar.YEAR, 2008);
        expectedDate.set(Calendar.MONTH, Calendar.OCTOBER);
        expectedDate.set(Calendar.DAY_OF_MONTH, 7);
        expectedDate.set(Calendar.AM_PM, Calendar.AM);
        expectedDate.set(Calendar.HOUR, 11);
        expectedDate.set(Calendar.MINUTE, 51);
        expectedDate.set(Calendar.SECOND, 50);
        expectedDate.set(Calendar.MILLISECOND, 0);
        expectedDate.setTimeZone(new SimpleTimeZone(0, "UTC"));

        Document document = XpathUtils.documentFrom(DOCUMENT);
        Date date = XpathUtils.asDate("Foo/Since", document);
        assertNotNull(date);
        assertEquals(expectedDate.getTimeInMillis(), date.getTime());

        assertNull(XpathUtils.asDate("Foo/Empty", document));
    }

    @Test
    public void testIsEmpty() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT);
        Node emptyNode = XpathUtils.asNode("Foo/Fake", document);
        Node realNode = XpathUtils.asNode("Foo/Count", document);

        assertTrue(XpathUtils.isEmpty(emptyNode));
        assertFalse(XpathUtils.isEmpty(realNode));
    }

    @Test
    public void testAsNode() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT);
        Node node = XpathUtils.asNode("Foo/Title", document);
        assertNotNull(node);
        assertEquals("Title", node.getNodeName());
    }

    /**
     * Tests that we return null when a specified expression doesn't evaluate
     * anything (instead of passing that null/empty value to a parser and
     * getting an error in the parser).
     */
    @Test
    public void testMissingNodes() throws Exception {
        Document document = XpathUtils.documentFrom(DOCUMENT);
        assertNull(XpathUtils.asDouble("non-existant-node/name", document));
        assertNull(XpathUtils.asLong("non-existant-node/name", document));
        assertNull(XpathUtils.asInteger("non-existant-node/name", document));
        assertNull(XpathUtils.asDate("non-existant-node/name", document));
        assertNull(XpathUtils.asFloat("non-existant-node/name", document));
        assertNull(XpathUtils.asString("non-existant-node/name", document));
    }

    /**
     * Tests that {@link XpathUtils#asByteBuffer(String, Node)} correctly base64
     * decodes the XML text data and transforms it into a ByteBuffer.
     */
    @Test
    public void testAsByteBuffer() throws Exception {
        String expectedData = "hello world";

        Document document = XpathUtils.documentFrom(DOCUMENT);
        ByteBuffer byteBuffer = XpathUtils.asByteBuffer("Foo/Blob", document);
        assertEquals(expectedData.length(), byteBuffer.limit());

        String data = new String(byteBuffer.array(), StringUtils.UTF8);
        assertEquals(expectedData, data);

        assertNull(XpathUtils.asByteBuffer("Foo/Empty", document));
    }

}
