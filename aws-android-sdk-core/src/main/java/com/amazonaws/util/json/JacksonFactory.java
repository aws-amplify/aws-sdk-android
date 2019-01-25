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
import com.amazonaws.util.BinaryUtils;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Date;

/**
 * An implementation of {@link AwsJsonFactory} with Jackson 2.x
 */
final class JacksonFactory implements AwsJsonFactory {

    private final JsonFactory factory = new JsonFactory();

    @Override
    public AwsJsonReader getJsonReader(Reader in) {
        return new JacksonReader(factory, in);
    }

    @Override
    public AwsJsonWriter getJsonWriter(Writer out) {
        return new JacksonWriter(factory, out);
    }

    private static final class JacksonReader implements AwsJsonReader {

        private JsonParser reader;
        private JsonToken nextToken = null;

        public JacksonReader(JsonFactory factory, Reader in) {
            try {
                reader = factory.createJsonParser(in);
            } catch (IOException e) {
                throw new AmazonClientException("Failed to create JSON reader", e);
            }
        }

        @Override
        public void beginArray() throws IOException {
            nextToken();
            expect(JsonToken.START_ARRAY);
            clearToken();
        }

        @Override
        public void endArray() throws IOException {
            nextToken();
            expect(JsonToken.END_ARRAY);
            clearToken();
        }

        @Override
        public void beginObject() throws IOException {
            nextToken();
            expect(JsonToken.START_OBJECT);
            clearToken();
        }

        @Override
        public void endObject() throws IOException {
            nextToken();
            expect(JsonToken.END_OBJECT);
            clearToken();
        }

        @Override
        public boolean isContainer() throws IOException {
            nextToken();
            return JsonToken.START_ARRAY == nextToken || JsonToken.START_OBJECT == nextToken;
        }

        @Override
        public boolean hasNext() throws IOException {
            nextToken();
            return JsonToken.END_OBJECT != nextToken && JsonToken.END_ARRAY != nextToken;
        }

        @Override
        public String nextName() throws IOException {
            nextToken();
            expect(JsonToken.FIELD_NAME);
            clearToken();
            return reader.getText();
        }

        @Override
        public String nextString() throws IOException {
            nextToken();
            String s = JsonToken.VALUE_NULL == nextToken ? null : reader.getText();
            clearToken();
            return s;
        }

        @Override
        public AwsJsonToken peek() throws IOException {
            nextToken();
            return convert(nextToken);
        }

        @Override
        public void skipValue() throws IOException {
            nextToken();
            reader.skipChildren();
            clearToken();
        }

        @Override
        public void close() throws IOException {
            reader.close();
        }

        /**
         * If {@link #nextToken} is null then read the next token. Do nothing
         * otherwise.
         *
         * @throws IOException
         */
        private void nextToken() throws IOException {
            if (nextToken == null) {
                nextToken = reader.nextToken();
            }
        }

        /**
         * Clears the {@link #nextToken}
         *
         * @throws IOException
         */
        private void clearToken() throws IOException {
            nextToken = null;
        }

        /**
         * Asserts {@link #nextToken} is the expected token. An
         * {@link IOException} will be thrown if failed.
         *
         * @param token expected token
         * @throws IOException
         */
        private void expect(JsonToken token) throws IOException {
            if (this.nextToken != token) {
                throw new IOException("Expected " + token + " but was " + token);
            }
        }

    }

    private static AwsJsonToken convert(JsonToken token) {
        if (token == null) {
            return null;
        }
        switch (token) {
            case START_ARRAY:
                return AwsJsonToken.BEGIN_ARRAY;
            case END_ARRAY:
                return AwsJsonToken.END_ARRAY;
            case START_OBJECT:
                return AwsJsonToken.BEGIN_OBJECT;
            case END_OBJECT:
                return AwsJsonToken.END_OBJECT;
            case FIELD_NAME:
                return AwsJsonToken.FIELD_NAME;
            case VALUE_TRUE:
            case VALUE_FALSE:
                return AwsJsonToken.VALUE_BOOLEAN;
            case VALUE_NUMBER_INT:
            case VALUE_NUMBER_FLOAT:
                return AwsJsonToken.VALUE_NUMBER;
            case VALUE_NULL:
                return AwsJsonToken.VALUE_NULL;
            case VALUE_STRING:
                return AwsJsonToken.VALUE_STRING;
            default:
                return AwsJsonToken.UNKNOWN;
        }
    }

    private static final class JacksonWriter implements AwsJsonWriter {
        private JsonGenerator writer;
        private static final int NEGATIVE_THREE = -3;

        public JacksonWriter(JsonFactory factory, Writer out) {
            try {
                writer = factory.createGenerator(out);
            } catch (IOException e) {
                throw new AmazonClientException("Failed to create json writer", e);
            }
        }

        @Override
        public AwsJsonWriter beginArray() throws IOException {
            writer.writeStartArray();
            return this;
        }

        @Override
        public AwsJsonWriter endArray() throws IOException {
            writer.writeEndArray();
            return this;
        }

        @Override
        public AwsJsonWriter beginObject() throws IOException {
            writer.writeStartObject();
            return this;
        }

        @Override
        public AwsJsonWriter endObject() throws IOException {
            writer.writeEndObject();
            return this;
        }

        @Override
        public AwsJsonWriter name(String name) throws IOException {
            writer.writeFieldName(name);
            return this;
        }

        @Override
        public AwsJsonWriter value(String value) throws IOException {
            writer.writeString(value);
            return this;
        }

        @Override
        public AwsJsonWriter value(boolean value) throws IOException {
            writer.writeBoolean(value);
            return this;
        }

        @Override
        public AwsJsonWriter value(double value) throws IOException {
            writer.writeNumber(value);
            return this;
        }

        @Override
        public AwsJsonWriter value(long value) throws IOException {
            writer.writeNumber(value);
            return this;
        }

        @Override
        public AwsJsonWriter value(Number value) throws IOException {
            writer.writeNumber(value.toString());
            return this;
        }

        @Override
        public AwsJsonWriter value(Date value) throws IOException {
            BigDecimal dateValue = BigDecimal.valueOf(value.getTime());
            writer.writeNumber(dateValue.scaleByPowerOfTen(NEGATIVE_THREE).toPlainString());
            return this;
        }

        @Override
        public AwsJsonWriter value(ByteBuffer value) throws IOException {
            value.mark();
            byte[] bytes = new byte[value.remaining()];
            value.get(bytes, 0, bytes.length);
            value.reset();
            writer.writeString(BinaryUtils.toBase64(bytes));
            return this;
        }

        @Override
        public AwsJsonWriter value() throws IOException {
            writer.writeNull();
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
