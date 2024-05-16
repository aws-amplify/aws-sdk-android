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

import com.amazonaws.util.Base64;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Date;

public class SimpleTypeJsonUnmarshallerTest {

    @Test
    public void testBigDecimalJsonUnmarshaller() throws Exception {
        BigDecimal bd = new BigDecimal("1.5");

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("bd");
        jw.value(bd.toPlainString());
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.BigDecimalJsonUnmarshaller bdUnmarshaller = SimpleTypeJsonUnmarshallers.BigDecimalJsonUnmarshaller
                .getInstance();
        BigDecimal unmarshalledBD = bdUnmarshaller.unmarshall(context);
        assertEquals(unmarshalledBD.toPlainString(), bd.toPlainString());
    }

    @Test
    public void testBigIntegerJsonUnmarshaller() throws Exception {
        BigInteger bi = new BigInteger("13459712934871293847891231293874");

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("bi");
        jw.value(bi.toString());
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.BigIntegerJsonUnmarshaller biUnmarshaller = SimpleTypeJsonUnmarshallers.BigIntegerJsonUnmarshaller
                .getInstance();
        BigInteger unmarshalledBI = biUnmarshaller.unmarshall(context);
        assertEquals(unmarshalledBI.toString(), bi.toString());
    }

    @Test
    public void testBooleanJsonUnmarshaller() throws Exception {

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("boolean");
        jw.value("true");
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller bUnmarshaller = SimpleTypeJsonUnmarshallers.BooleanJsonUnmarshaller
                .getInstance();
        Boolean unmarshalledB = bUnmarshaller.unmarshall(context);

        assertTrue(unmarshalledB);
    }

    @Test
    public void testByteBufferJsonUnmarshaller() throws Exception {

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("bb");
        jw.value(Base64.encodeAsString("byte".getBytes(StringUtils.UTF8)));
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller bbUnmarshaller = SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller
                .getInstance();
        ByteBuffer unmarshalledBb = bbUnmarshaller.unmarshall(context);
        ByteBuffer expected = ByteBuffer.wrap("byte".getBytes(StringUtils.UTF8));
        assertTrue(unmarshalledBb.equals(expected));
    }

    @Test
    public void testByteJsonUnmarshaller() throws Exception {

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("b");
        jw.value(Byte.valueOf("127"));
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.ByteJsonUnmarshaller bUnmarshaller = SimpleTypeJsonUnmarshallers.ByteJsonUnmarshaller
                .getInstance();
        Byte unmarshalledB = bUnmarshaller.unmarshall(context);
        Byte expected = Byte.valueOf("127");
        assertTrue(unmarshalledB.equals(expected));
    }

    @Test
    public void testDateJsonUnmarshaller() throws Exception {
        Date date = new Date();
        date.setTime(1000);

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("date");
        jw.value(date);
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller dateUnmarshaller = SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller
                .getInstance();
        Date unmarshalledDate = dateUnmarshaller.unmarshall(context);
        assertEquals(unmarshalledDate.getTime(), date.getTime());
    }

    @Test
    public void testDateUnixTimestampJsonUnmarshaller() throws Exception {
        Date date = new Date();
        date.setTime(1000);

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("unix");
        jw.value(date);
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller dateUnmarshaller = SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller
                .getInstance(TimestampFormat.UNIX_TIMESTAMP);
        Date unmarshalledDate = dateUnmarshaller.unmarshall(context);
        assertEquals(unmarshalledDate.getTime(), date.getTime());
    }

    @Test
    public void testDateIso8601JsonUnmarshaller() throws Exception {
        Date date = new Date();
        date.setTime(1000);

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("iso8601");
        jw.value(DateUtils.formatISO8601Date(date));
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller dateUnmarshaller = SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller
                .getInstance(TimestampFormat.ISO_8601);
        Date unmarshalledDate = dateUnmarshaller.unmarshall(context);
        assertEquals(unmarshalledDate.getTime(), date.getTime());
    }

    @Test
    public void testDateRfc822JsonUnmarshaller() throws Exception {
        Date date = new Date();
        date.setTime(1000);

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("rfc822");
        jw.value(DateUtils.formatRFC822Date(date));
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller dateUnmarshaller = SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller
                .getInstance(TimestampFormat.RFC_822);
        Date unmarshalledDate = dateUnmarshaller.unmarshall(context);
        assertEquals(unmarshalledDate.getTime(), date.getTime());
    }

    @Test
    public void defaultFunctionAlwaysReturnsUnixTimestampUnmarshaller() {
        SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller first =
                SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance(TimestampFormat.ISO_8601);
        SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller second =
                SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance();
        assertEquals(TimestampFormat.UNIX_TIMESTAMP, second.format);
    }

    @Test
    public void testDoubleJsonUnmarshaller() throws Exception {
        Double dub = new Double(5.5);

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("dub");
        jw.value(dub);
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.DoubleJsonUnmarshaller dubUnmarshaller = SimpleTypeJsonUnmarshallers.DoubleJsonUnmarshaller
                .getInstance();
        Double unmarshalledDub = dubUnmarshaller.unmarshall(context);
        assertEquals(unmarshalledDub.doubleValue(), 5.5, .001);
    }

    @Test
    public void testFloatJsonUnmarshaller() throws Exception {
        Float f = new Float(5.5);

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("f");
        jw.value(f);
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller fUnmarshaller = SimpleTypeJsonUnmarshallers.FloatJsonUnmarshaller
                .getInstance();
        Float unmarshalledF = fUnmarshaller.unmarshall(context);
        assertEquals(unmarshalledF.floatValue(), 5.5, .001);
    }

    @Test
    public void testIntegerJsonUnmarshaller() throws Exception {
        Integer i = new Integer(5);

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("i");
        jw.value(i);
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller iUnmarshaller = SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller
                .getInstance();
        Integer unmarshalledI = iUnmarshaller.unmarshall(context);
        assertEquals(unmarshalledI.intValue(), 5);
    }

    @Test
    public void testLongJsonUnmarshaller() throws Exception {
        Long l = new Long(5L);

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("l");
        jw.value(l);
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller lUnmarshaller = SimpleTypeJsonUnmarshallers.LongJsonUnmarshaller
                .getInstance();
        Long unmarshalledL = lUnmarshaller.unmarshall(context);
        assertEquals(unmarshalledL.longValue(), 5L);
    }

    @Test
    public void testStringJsonUnmarshaller() throws Exception {

        StringWriter sw = new StringWriter();
        AwsJsonWriter jw = JsonUtils.getJsonWriter(sw);
        jw.beginObject();
        jw.name("s");
        jw.value("String");
        jw.endObject();
        String json = sw.toString();

        StringReader sr = new StringReader(json);
        AwsJsonReader jr = JsonUtils.getJsonReader(sr);
        JsonUnmarshallerContext context = new JsonUnmarshallerContext(jr);
        context.getReader().beginObject();
        context.getReader().nextName();

        SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller sUnmarshaller = SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller
                .getInstance();
        assertEquals(sUnmarshaller.unmarshall(context), "String");
    }

}
