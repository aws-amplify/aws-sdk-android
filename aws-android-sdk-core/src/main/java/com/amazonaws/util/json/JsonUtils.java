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
    private static final AwsJsonFactory FACTORY = new GsonFactory();

    /**
     * JSON engine
     * @deprecated JSON engine is no longer configurable at runtime.
     */
    @Deprecated
    public static enum JsonEngine {
        /**
         * An engine powered by Gson.
         * GSON is the only supported value.
         * @see <a href="https://code.google.com/p/google-gson/">Gson</a>
         */
        Gson,

        /**
         * An engine powered by Jackson.
         * @see <a href="https://github.com/FasterXML/jackson-core">jackson-core</a>
         */
        Jackson
    }

    /**
     * Deprecated.
     * @param jsonEngine Ignored
     * @deprecated The JSON engine is always Gson, this has no effect.
     */
    @Deprecated
    public static void setJsonEngine(JsonEngine jsonEngine) {}

    /**
     * Deprecated.
     * @param awsJsonFactory Ignored
     * @deprecated The JSON engine is always Gson, this has no effect.
     */
    @Deprecated
    static void setJsonEngine(AwsJsonFactory awsJsonFactory) {}

    /**
     * Gets a JSON reader. If no JSON engine is available, an
     * {@link AmazonClientException} will be thrown.
     *
     * @param in reader
     * @return a JSON reader
     */
    public static AwsJsonReader getJsonReader(Reader in) {
        return FACTORY.getJsonReader(in);
    }

    /**
     * Gets a JSON writer. If no JSON engine is available, an
     * {@link AmazonClientException} will be thrown.
     *
     * @param out writer
     * @return a JSON writer
     */
    public static AwsJsonWriter getJsonWriter(Writer out) {
        return FACTORY.getJsonWriter(out);
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
     * Convenient method to convert a JSON string to a map. Arrays
     * are not discarded, they are read into the value as a string.
     * Number and boolean are also stored as string.
     * Nested arrays are not supported.
     *
     * @param in reader
     * @return a non null, unmodifiable, string to string map
     */
    @SuppressWarnings("unchecked")
    public static Map<String, String> jsonToStringMapWithList(Reader in) {
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
                    if (AwsJsonToken.BEGIN_ARRAY.equals(reader.peek())) {
                        final StringWriter out = new StringWriter();
                        final AwsJsonWriter writer = getJsonWriter(out);
                        reader.beginArray();
                        writer.beginArray();
                        try {
                            while (!AwsJsonToken.END_ARRAY.equals(reader.peek())) {
                                AwsJsonToken nextToken = reader.peek();
                                if (AwsJsonToken.BEGIN_OBJECT.equals(nextToken)){
                                    reader.beginObject();
                                    writer.beginObject();
                                } else if (AwsJsonToken.FIELD_NAME.equals(nextToken)){
                                    String name = reader.nextName();
                                    // do not write key if the value is a nested array
                                    if (!AwsJsonToken.BEGIN_ARRAY.equals(reader.peek())) {
                                        writer.name(name);
                                    }
                                } else if (AwsJsonToken.END_OBJECT.equals(nextToken)){
                                    reader.endObject();
                                    writer.endObject();
                                } else if (AwsJsonToken.END_ARRAY.equals(nextToken)) {
                                    reader.endArray();
                                    writer.endArray();
                                } else if (AwsJsonToken.VALUE_STRING.equals(nextToken)
                                        || AwsJsonToken.VALUE_NUMBER.equals(nextToken)
                                        || AwsJsonToken.VALUE_NULL.equals(nextToken)
                                        || AwsJsonToken.VALUE_BOOLEAN.equals(nextToken)) {
                                    String value = reader.nextString();
                                    writer.value(value);
                                }
                                else {
                                    // skip non string nodes inside the array
                                    reader.skipValue();
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        reader.endArray();
                        writer.endArray();
                        writer.flush();
                        writer.close();
                        map.put(key, out.toString());
                    } else {
                        // skip non string or non array nodes
                        reader.skipValue();
                    }
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

