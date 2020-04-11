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
import static org.junit.Assert.assertTrue;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.Base64;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;

@RunWith(RobolectricTestRunner.class)
public class SimpleTypeStaxUnmarshallerTest {

    /** Shared factory for creating XML event readers */
    private static final XmlPullParserFactory xmlPullParserFactory;
    static {
        try {
            xmlPullParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException xppe) {
            throw new AmazonClientException("Couldn't initialize XmlPullParserFactory", xppe);
        }
    }

    @Test
    public void testBigDecimalStaxUnmarshaller() throws Exception {
        BigDecimal bd = new BigDecimal("1.5");

        SimpleTypeStaxUnmarshallers.BigDecimalStaxUnmarshaller bdUnmarshaller = SimpleTypeStaxUnmarshallers.BigDecimalStaxUnmarshaller
                .getInstance();
        BigDecimal unmarshalledBD = bdUnmarshaller.unmarshall(getContext(bd.toPlainString()));
        assertEquals(unmarshalledBD.toPlainString(), bd.toPlainString());
    }

    @Test
    public void testBigIntegerStaxUnmarshaller() throws Exception {
        BigInteger data = new BigInteger("1534523");

        SimpleTypeStaxUnmarshallers.BigIntegerStaxUnmarshaller unmarshaller = SimpleTypeStaxUnmarshallers.BigIntegerStaxUnmarshaller
                .getInstance();
        BigInteger unmarshalled = unmarshaller.unmarshall(getContext(data.toString()));
        assertEquals(unmarshalled.intValue(), 1534523);
    }

    @Test
    public void testBooleanStaxUnmarshaller() throws Exception {
        Boolean data = new Boolean(true);

        SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller unmarshaller = SimpleTypeStaxUnmarshallers.BooleanStaxUnmarshaller
                .getInstance();
        Boolean unmarshalled = unmarshaller.unmarshall(getContext(data.toString()));
        assertTrue(unmarshalled);
    }

    @Test
    public void testByteBufferStaxUnmarshaller() throws Exception {
        SimpleTypeStaxUnmarshallers.ByteBufferStaxUnmarshaller unmarshaller = SimpleTypeStaxUnmarshallers.ByteBufferStaxUnmarshaller
                .getInstance();
        ByteBuffer unmarshalled = unmarshaller.unmarshall(getContext(Base64.encodeAsString("byte"
                .getBytes(StringUtils.UTF8))));
        assertEquals(unmarshalled, ByteBuffer.wrap("byte".getBytes(StringUtils.UTF8)));
    }

    @Test
    public void testByteStaxUnmarshaller() throws Exception {
        SimpleTypeStaxUnmarshallers.ByteStaxUnmarshaller unmarshaller = SimpleTypeStaxUnmarshallers.ByteStaxUnmarshaller
                .getInstance();
        Byte unmarshalled = unmarshaller.unmarshall(getContext("127"));
        assertEquals(unmarshalled, Byte.valueOf("127"));
    }

    @Test
    public void testDateStaxUnmarshaller() throws Exception {
        Date data = new Date(1000);

        SimpleTypeStaxUnmarshallers.DateStaxUnmarshaller unmarshaller = SimpleTypeStaxUnmarshallers.DateStaxUnmarshaller
                .getInstance();
        Date unmarshalled = unmarshaller.unmarshall(getContext(DateUtils.formatISO8601Date(data)));
        assertEquals(unmarshalled.getTime(), data.getTime());
    }

    @Test
    public void testDoubleStaxUnmarshaller() throws Exception {
        Double data = new Double(1000.0);

        SimpleTypeStaxUnmarshallers.DoubleStaxUnmarshaller unmarshaller = SimpleTypeStaxUnmarshallers.DoubleStaxUnmarshaller
                .getInstance();
        Double unmarshalled = unmarshaller.unmarshall(getContext(data.toString()));
        assertEquals(unmarshalled, 1000.0, .01);
    }

    @Test
    public void testLongStaxUnmarshaller() throws Exception {
        Long data = new Long(1000L);

        SimpleTypeStaxUnmarshallers.LongStaxUnmarshaller unmarshaller = SimpleTypeStaxUnmarshallers.LongStaxUnmarshaller
                .getInstance();
        Long unmarshalled = unmarshaller.unmarshall(getContext(data.toString()));
        assertEquals(unmarshalled, Long.valueOf(1000L));
    }

    @Test
    public void testIntegerStaxUnmarshaller() throws Exception {
        Integer data = new Integer(1000);

        SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller unmarshaller = SimpleTypeStaxUnmarshallers.IntegerStaxUnmarshaller
                .getInstance();
        Integer unmarshalled = unmarshaller.unmarshall(getContext(data.toString()));
        assertEquals(unmarshalled, new Integer(1000));
    }

    @Test
    public void testFloatStaxUnmarshaller() throws Exception {
        Float data = new Float(1000.0);

        SimpleTypeStaxUnmarshallers.FloatStaxUnmarshaller unmarshaller = SimpleTypeStaxUnmarshallers.FloatStaxUnmarshaller
                .getInstance();
        Float unmarshalled = unmarshaller.unmarshall(getContext(data.toString()));
        assertEquals(unmarshalled, new Float(1000.0));
    }

    @Test
    public void testStringStaxUnmarshaller() throws Exception {
        SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller unmarshaller = SimpleTypeStaxUnmarshallers.StringStaxUnmarshaller
                .getInstance();
        String unmarshalled = unmarshaller.unmarshall(getContext("String"));
        assertEquals(unmarshalled, "String");
    }

    private StaxUnmarshallerContext getContext(String elementData) throws XmlPullParserException,
            IOException {
        XmlPullParser xpp = xmlPullParserFactory.newPullParser();
        String xml = "<tag>" + elementData + "</tag>";
        StringReader sr = new StringReader(xml);
        xpp.setInput(sr);

        StaxUnmarshallerContext suc = new StaxUnmarshallerContext(xpp);
        suc.nextEvent();
        return suc;
    }

}
