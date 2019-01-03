/*
 * Copyright 2015-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.util.json;

import com.amazonaws.AmazonClientException;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * A utility class to process JSON contents.
 */
public class JsonUtils {

    private static volatile AwsJsonFactory factory = new GsonFactory();

    /**
     * JSON engine
     */
    public static enum JsonEngine {
        /**
         * An engine powered by the build-in {@link JsonReader} and
         * {@link JsonWriter} available since Android API 11.
         */
        // Android,
        /**
         * An engine powered by Gson.
         *
         * @see <a href="https://code.google.com/p/google-gson/">Gson</a>
         */
        Gson,
        /**
         * An engine powered by Jackson 2.x. It's the fastest engine.
         *
         * @see <a
         *      href="https://github.com/FasterXML/jackson-core">jackson-core</a>
         */
        Jackson
    }

    /**
     * Sets the JSON engine. Default is Gson.
     *
     * @param jsonEngine the json engine.
     */
    public static void setJsonEngine(JsonEngine jsonEngine) {
        switch (jsonEngine) {
            case Gson:
                factory = new GsonFactory();
                break;
            case Jackson:
                factory = new JacksonFactory();
                break;
            default:
                throw new RuntimeException("Unsupported json engine");
        }
    }

    /**
     * Sets the JSON engine.
     *
     * @param factory an {@link AwsJsonFactory}
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    static void setJsonEngine(AwsJsonFactory factory) {
        if (factory == null) {
            throw new IllegalArgumentException("factory can't be null");
        }
        JsonUtils.factory = factory;
    }

    /**
     * Gets a JSON reader. If no JSON engine is available, an
     * {@link AmazonClientException} will be thrown.
     *
     * @param in reader
     * @return a JSON reader
     */
    public static AwsJsonReader getJsonReader(Reader in) {
        if (factory == null) {
            throw new IllegalStateException("Json engine is unavailable.");
        }
        return factory.getJsonReader(in);
    }

    /**
     * Gets a JSON writer. If no JSON engine is available, an
     * {@link AmazonClientException} will be thrown.
     *
     * @param out writer
     * @return a JSON writer
     */
    public static AwsJsonWriter getJsonWriter(Writer out) {
        if (factory == null) {
            throw new IllegalStateException("Json engine is unavailable.");
        }
        return factory.getJsonWriter(out);
    }

    /**
     * Convenient method to convert a JSON string to a map. Any object or array
     * will be discarded. Number and boolean are stored as string.
     *
     * @param in reader
     * @return a non null, unmodifiable, string to string map
     */
    @SuppressWarnings("unchecked")
    public static Map<String, String> jsonToMap(Reader in) {
        AwsJsonReader reader = getJsonReader(in);
        try {
            // in case it's empty
            if (reader.peek() == null) {
                return Collections.EMPTY_MAP;
            }

            Map<String, String> map = new HashMap<String, String>();
            reader.beginObject();
            while (reader.hasNext()) {
                String key = reader.nextName();
                if (reader.isContainer()) {
                    // skip non string nodes
                    reader.skipValue();
                } else {
                    map.put(key, reader.nextString());
                }
            }
            reader.endObject();
            reader.close();

            return Collections.unmodifiableMap(map);
        } catch (IOException e) {
            throw new AmazonClientException("Unable to parse JSON String.", e);
        }
    }

    /**
     * Convenient method to convert a JSON string to a map. Any object or array
     * will be discarded. Number and boolean are stored as string.
     *
     * @param json a JSON encoding string
     * @return a non null, unmodifiable, string to string map
     */
    @SuppressWarnings("unchecked")
    public static Map<String, String> jsonToMap(String json) {
        if (json == null || json.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        return jsonToMap(new StringReader(json));
    }

    /**
     * Encode a string to string map as a JSON string.
     *
     * @param map map to be encoded
     * @return a non null JSON string
     */
    public static String mapToString(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return "{}";
        }

        try {
            StringWriter out = new StringWriter();
            AwsJsonWriter writer = getJsonWriter(out);
            writer.beginObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writer.name(entry.getKey()).value(entry.getValue());
            }
            writer.endObject();
            writer.close();
            return out.toString();
        } catch (IOException e) {
            throw new AmazonClientException("Unable to serialize to JSON String.", e);
        }
    }

    /**
     * A helper function to check whether a class is available.
     *
     * @param className full name of the class
     * @return true if found, false otherwise
     */
    @SuppressWarnings("unused")
    private static boolean isClassAvailable(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
