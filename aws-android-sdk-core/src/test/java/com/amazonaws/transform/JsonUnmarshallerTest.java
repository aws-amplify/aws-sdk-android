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

import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.MapUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.util.json.AwsJsonReader;
import com.amazonaws.util.json.JsonUtils;

import org.junit.Test;

import java.io.StringReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class JsonUnmarshallerTest {
    public static final String SIMPLE_MAP = "{\"key1\" : \"value1\", \"key2\" : \"value2\"}";
    public static final String MAP_TO_LIST = "{\"key1\" : [ null, \"value1\"], \"key2\" : [\"value2\"]}";

    @Test
    public void testSimpleMap() throws Exception {
        JsonUnmarshallerContext unmarshallerContext = setupUnmarshaller(SIMPLE_MAP);
        MapUnmarshaller<String> unmarshaller = new MapUnmarshaller<String>(
                SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance());
        Map<String, String> map = unmarshaller.unmarshall(unmarshallerContext);
        assertTrue(map.size() == 2);
        assertEquals("value1", map.get("key1"));
        assertEquals("value2", map.get("key2"));
    }

    @Test
    public void testMapToList() throws Exception {
        JsonUnmarshallerContext unmarshallerContext = setupUnmarshaller(MAP_TO_LIST);
        MapUnmarshaller<List<String>> unmarshaller =
                new MapUnmarshaller<List<String>>(
                        new ListUnmarshaller<String>(
                                SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()));
        Map<String, List<String>> map = unmarshaller.unmarshall(unmarshallerContext);
        assertTrue(map.size() == 2);
        assertEquals(Arrays.asList(null, "value1"), map.get("key1"));
        assertEquals(Arrays.asList("value2"), map.get("key2"));
    }

    private JsonUnmarshallerContext setupUnmarshaller(String snippet) throws Exception {
        AwsJsonReader jsonReader = JsonUtils.getJsonReader(new StringReader(snippet));
        JsonUnmarshallerContext unmarshallerContext = new JsonUnmarshallerContext(jsonReader);
        return unmarshallerContext;
    }
}
