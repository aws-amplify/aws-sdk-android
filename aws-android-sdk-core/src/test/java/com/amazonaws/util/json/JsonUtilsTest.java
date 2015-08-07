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

package com.amazonaws.util.json;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.util.json.JsonUtils.JsonEngine;

import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JsonUtilsTest {
    private static final String JSON_STRING = "{\"string\":\"string\","
            + "\"long\":123,"
            + "\"double\":123.45,"
            + "\"null\":null,"
            + "\"true\":true,"
            + "\"false\":false,"
            + "\"encoding\":\"Chloë\","
            + "\"array\":[\"string\",123,123.45,null,true,false],"
            + "\"object\":{}"
            + "}";

    @Test
    public void testJsonToMap() {
        Map<String, String> map = JsonUtils.jsonToMap(JSON_STRING);
        assertEquals("string value", "string", map.get("string"));
        assertEquals("long value", "123", map.get("long"));
        assertEquals("double value", "123.45", map.get("double"));
        assertEquals("null value", null, map.get("null"));
        assertEquals("true value", "true", map.get("true"));
        assertEquals("false value", "false", map.get("false"));
        assertEquals("encoding", "Chloë", map.get("encoding"));
        assertNull("array is ignored", map.get("array"));
        assertNull("object is ignored", map.get("object"));
    }

    @Test
    public void testMapToJson() {
        Map<String, String> source = new HashMap<String, String>();
        source.put("string", "string");
        source.put("long", "123");
        source.put("double", "123.45");
        source.put("null", null);
        source.put("true", "true");
        source.put("false", "false");
        source.put("encoding", "Chloë");

        String json = JsonUtils.mapToString(source);
        Map<String, String> map = JsonUtils.jsonToMap(json);
        assertEquals("string value", "string", map.get("string"));
        assertEquals("long value", "123", map.get("long"));
        assertEquals("double value", "123.45", map.get("double"));
        assertEquals("null value", null, map.get("null"));
        assertEquals("true value", "true", map.get("true"));
        assertEquals("false value", "false", map.get("false"));
        assertEquals("encoding", "Chloë", map.get("encoding"));
    }

    @Test
    public void testEmptyMapToJson() {
        Map<String, String> source = new HashMap<String, String>();
        assertEquals("empty map", "{}", JsonUtils.mapToString(source));
    }

    @Test
    public void testNullJsonToMap() {
        String nullStr = null;
        Map<String, String> map = JsonUtils.jsonToMap(nullStr);
        assertNotNull("map isn't null", map);
        assertTrue("map is empty", map.isEmpty());
    }

    @Test
    public void testEmptyJsonToMap() {
        String json = "";
        Map<String, String> map = JsonUtils.jsonToMap(json);
        assertTrue("empty string", map.isEmpty());
    }

    @Test
    public void testJsonReader() throws IOException {
        AwsJsonReader reader = JsonUtils.getJsonReader(new StringReader(JSON_STRING));
        reader.beginObject();
        assertTrue("has properties", reader.hasNext());
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("string")) {
                assertTrue("VALUE_STRING", AwsJsonToken.VALUE_STRING == reader.peek());
                assertEquals("string value", "string", reader.nextString());
            } else if (name.equals("long")) {
                assertTrue("VALUE_NUMBER", AwsJsonToken.VALUE_NUMBER == reader.peek());
                assertEquals("long value", "123", reader.nextString());
            } else if (name.equals("double")) {
                assertTrue("VALUE_NUMBER", AwsJsonToken.VALUE_NUMBER == reader.peek());
                assertEquals("double value", "123.45", reader.nextString());
            } else if (name.equals("null")) {
                assertTrue("VALUE_NULL", AwsJsonToken.VALUE_NULL == reader.peek());
                assertNull("null value", reader.nextString());
            } else if (name.equals("true")) {
                assertTrue("VALUE_BOOLEAN", AwsJsonToken.VALUE_BOOLEAN == reader.peek());
                assertEquals("true value", "true", reader.nextString());
            } else if (name.equals("false")) {
                assertTrue("VALUE_BOOLEAN", AwsJsonToken.VALUE_BOOLEAN == reader.peek());
                assertEquals("false value", "false", reader.nextString());
            } else if (name.equals("encoding")) {
                assertTrue("VALUE_STRING", AwsJsonToken.VALUE_STRING == reader.peek());
                assertEquals("encoding", "Chloë", reader.nextString());
            } else if (name.equals("array")) {
                assertTrue("BEGIN_ARRAY", AwsJsonToken.BEGIN_ARRAY == reader.peek());
                reader.beginArray();
                assertTrue("has next", reader.hasNext());
                assertEquals("string value", "string", reader.nextString());
                assertEquals("long value", "123", reader.nextString());
                assertEquals("double value", "123.45", reader.nextString());
                assertNull("null value", reader.nextString());
                assertEquals("true value", "true", reader.nextString());
                assertEquals("false value", "false", reader.nextString());
                reader.endArray();
            } else if (name.equals("object")) {
                assertTrue("BEGIN_OBJECT", AwsJsonToken.BEGIN_OBJECT == reader.peek());
                reader.beginObject();
                assertFalse("empty object", reader.hasNext());
                reader.endObject();
            } else {
                fail("should not reach here");
            }
        }
        reader.endObject();
    }

    @Test
    public void testJsonWriter() throws IOException {
        StringWriter out = new StringWriter();
        AwsJsonWriter writer = JsonUtils.getJsonWriter(out);
        writer.beginObject()
                .name("string").value("string")
                .name("long").value(123)
                .name("double").value(123.45)
                .name("null").value()
                .name("true").value(true)
                .name("false").value(false)
                .name("encoding").value("Chloë")
                .name("array").beginArray()
                .value("string").value(123).value(123.45).value().value(true).value(false)
                .endArray()
                .name("object").beginObject().endObject()
                .endObject().close();
        String json = out.toString();
        assertEquals("same json", JSON_STRING, json);
    }

    @Test
    public void testReadPerformance() throws IOException {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 5000; i++) {
            map.put("key" + i, "value" + i);
        }
        String json = JsonUtils.mapToString(map);

        JsonUtils.setJsonEngine(JsonEngine.Jackson);
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            JsonUtils.jsonToMap(json);
        }
        System.out.println("Serialize a 5000 properties map 1000 times");
        System.out.println("Jackson read elapsed: "
                + (System.nanoTime() - start) / 1000000 + "ms");

        JsonUtils.setJsonEngine(JsonEngine.Gson);
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            JsonUtils.jsonToMap(json);
        }
        System.out.println("Gson read elapsed: "
                + (System.nanoTime() - start) / 1000000 + "ms");
    }

    @Test
    public void testWritePerformance() throws IOException {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 5000; i++) {
            map.put("key" + i, "value" + i);
        }

        System.out.println("Deserialize a JSON string with a 5000 properties map 1000 times");
        JsonUtils.setJsonEngine(JsonEngine.Jackson);
        long start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            JsonUtils.mapToString(map);
        }
        System.out.println("Jackson write elapsed: "
                + (System.nanoTime() - start) / 1000000 + "ms");

        JsonUtils.setJsonEngine(JsonEngine.Gson);
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            JsonUtils.mapToString(map);
        }
        System.out.println("Gson write elapsed: "
                + (System.nanoTime() - start) / 1000000 + "ms");
    }

    @Test
    public void testDate() throws IOException {
        Date d = new Date(1423875641895L);
        String target = "1423875641.895";

        JsonUtils.setJsonEngine(JsonEngine.Gson);
        StringWriter out = new StringWriter();
        // This is wrapped in an array so that Gson doesn't complain about
        // invalid JSON encoding
        JsonUtils.getJsonWriter(out)
                .beginArray().value(d).endArray()
                .close();
        assertEquals("[" + target + "]", out.toString());
        out.getBuffer().setLength(0); // clear string writer

        JsonUtils.setJsonEngine(JsonEngine.Jackson);
        JsonUtils.getJsonWriter(out)
                .beginArray().value(d).endArray()
                .close();
        assertEquals("[" + target + "]", out.toString());
    }

    @Test
    public void testByteBuffer() throws IOException {
        ByteBuffer bb = generateByteBuffer(16);
        // Note: the target string is back filled with the output of the above
        // byte buffer
        String target = "AAECAwQFBgcICQoLDA0ODw==";

        JsonUtils.setJsonEngine(JsonEngine.Gson);
        StringWriter out = new StringWriter();
        JsonUtils.getJsonWriter(out)
                .beginArray().value(bb).endArray()
                .close();
        assertEquals("[\"" + target + "\"]", out.toString());
        out.getBuffer().setLength(0);

        JsonUtils.setJsonEngine(JsonEngine.Jackson);
        JsonUtils.getJsonWriter(out)
                .beginArray().value(bb).endArray()
                .close();
        assertEquals("[\"" + target + "\"]", out.toString());
    }

    private ByteBuffer generateByteBuffer(int length) {
        byte[] bytes = new byte[length];
        for (int i = 0; i < length; i++) {
            bytes[i] = (byte) (i % Byte.MAX_VALUE);
        }
        return ByteBuffer.wrap(bytes);
    }
}
