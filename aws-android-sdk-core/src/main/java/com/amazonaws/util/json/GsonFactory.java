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

import com.amazonaws.util.BinaryUtils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Date;

/**
 * An implementation of {@link AwsJsonFactory} with Gson.
 */
final class GsonFactory implements AwsJsonFactory {

    @Override
    public AwsJsonReader getJsonReader(Reader in) {
        return new GsonReader(in);
    }

    @Override
    public AwsJsonWriter getJsonWriter(Writer out) {
        return new GsonWriter(out);
    }

    private static final class GsonReader implements AwsJsonReader {
        private final JsonReader reader;

        public GsonReader(Reader in) {
            this.reader = new JsonReader(in);
        }

        @Override
        public void beginArray() throws IOException {
            reader.beginArray();
        }

        @Override
        public void endArray() throws IOException {
            reader.endArray();
        }

        @Override
        public void beginObject() throws IOException {
            reader.beginObject();
        }

        @Override
        public void endObject() throws IOException {
            reader.endObject();
        }

        @Override
        public boolean isContainer() throws IOException {
            JsonToken token = reader.peek();
            return JsonToken.BEGIN_ARRAY.equals(token)
                    || JsonToken.BEGIN_OBJECT.equals(token);
        }

        @Override
        public boolean hasNext() throws IOException {
            return reader.hasNext();
        }

        @Override
        public String nextName() throws IOException {
            return reader.nextName();
        }

        @Override
        public String nextString() throws IOException {
            JsonToken token = reader.peek();
            if (JsonToken.NULL.equals(token)) {
                reader.nextNull();
                return null;
            }
            if (JsonToken.BOOLEAN.equals(token)) {
                return reader.nextBoolean() ? "true" : "false";
            }
            return reader.nextString();
        }

        @Override
        public void skipValue() throws IOException {
            reader.skipValue();
        }

        @Override
        public AwsJsonToken peek() throws IOException {
            try {
                return convert(reader.peek());
            } catch (EOFException e) {
                return null;
            }
        }

        @Override
        public void close() throws IOException {
            reader.close();
        }
    }

    private static AwsJsonToken convert(JsonToken token) {
        if (token == null) {
            return null;
        }
        switch (token) {
            case BEGIN_ARRAY:
                return AwsJsonToken.BEGIN_ARRAY;
            case END_ARRAY:
                return AwsJsonToken.END_ARRAY;
            case BEGIN_OBJECT:
                return AwsJsonToken.BEGIN_OBJECT;
            case END_OBJECT:
                return AwsJsonToken.END_OBJECT;
            case NAME:
                return AwsJsonToken.FIELD_NAME;
            case BOOLEAN:
                return AwsJsonToken.VALUE_BOOLEAN;
            case NUMBER:
                return AwsJsonToken.VALUE_NUMBER;
            case NULL:
                return AwsJsonToken.VALUE_NULL;
            case STRING:
                return AwsJsonToken.VALUE_STRING;
            case END_DOCUMENT:
                return null;
            default:
                return AwsJsonToken.UNKNOWN;
        }
    }

    private static final class GsonWriter implements AwsJsonWriter {

        private final JsonWriter writer;
        private static final int NEGATIVE_THREE = -3;

        public GsonWriter(Writer out) {
            writer = new JsonWriter(out);
        }

        @Override
        public AwsJsonWriter beginArray() throws IOException {
            writer.beginArray();
            return this;
        }

        @Override
        public AwsJsonWriter endArray() throws IOException {
            writer.endArray();
            return this;
        }

        @Override
        public AwsJsonWriter beginObject() throws IOException {
            writer.beginObject();
            return this;
        }

        @Override
        public AwsJsonWriter endObject() throws IOException {
            writer.endObject();
            return this;
        }

        @Override
        public AwsJsonWriter name(String name) throws IOException {
            writer.name(name);
            return this;
        }

        @Override
        public AwsJsonWriter value(String value) throws IOException {
            writer.value(value);
            return this;
        }

        @Override
        public AwsJsonWriter value(boolean value) throws IOException {
            writer.value(value);
            return this;
        }

        @Override
        public AwsJsonWriter value(double value) throws IOException {
            writer.value(value);
            return this;
        }

        @Override
        public AwsJsonWriter value(long value) throws IOException {
            writer.value(value);
            return this;
        }

        @Override
        public AwsJsonWriter value(Number value) throws IOException {
            writer.value(value);
            return this;
        }

        @Override
        public AwsJsonWriter value(Date value) throws IOException {
            BigDecimal dateValue = BigDecimal.valueOf(value.getTime());
            writer.value(dateValue.scaleByPowerOfTen(NEGATIVE_THREE));
            return this;
        }

        @Override
        public AwsJsonWriter value(ByteBuffer value) throws IOException {
            value.mark();
            byte[] bytes = new byte[value.remaining()];
            value.get(bytes, 0, bytes.length);
            value.reset();
            writer.value(BinaryUtils.toBase64(bytes));
            return this;
        }

        @Override
        public AwsJsonWriter value() throws IOException {
            writer.nullValue();
            return this;
        }

        @Override
        public void flush() throws IOException {
            writer.flush();
        }

        @Override
        public void close() throws IOException {
            writer.close();
        }
    }
}
