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

import java.io.IOException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.util.Date;

/**
 * A streaming JSON writer.
 */
public interface AwsJsonWriter {

    /**
     * Writes the character '[' as the beginning of an array
     *
     * @return the writer itself
     * @throws IOException
     */
    AwsJsonWriter beginArray() throws IOException;

    /**
     * Writes the character ']' as the end of an array
     *
     * @return the writer itself
     * @throws IOException
     */
    AwsJsonWriter endArray() throws IOException;

    /**
     * Writes the character '{' as the beginning of an object
     *
     * @return the writer itself
     * @throws IOException
     */
    AwsJsonWriter beginObject() throws IOException;

    /**
     * Writes the character '}' as the end of an object
     *
     * @return the writer itself
     * @throws IOException
     */
    AwsJsonWriter endObject() throws IOException;

    /**
     * Writes the field name in an object
     *
     * @param name field name
     * @return the writer itself
     * @throws IOException
     */
    AwsJsonWriter name(String name) throws IOException;

    /**
     * Writes a {@link String} value
     *
     * @param value {@link String} value
     * @return the writer itself
     * @throws IOException
     */
    AwsJsonWriter value(String value) throws IOException;

    /**
     * Writes a boolean value, either true or false
     *
     * @param value boolean value
     * @return the writer itself
     * @throws IOException
     */
    AwsJsonWriter value(boolean value) throws IOException;

    /**
     * Writes a double value
     *
     * @param value double value
     * @return the writer itself
     * @throws IOException
     */
    AwsJsonWriter value(double value) throws IOException;

    /**
     * Writes a long value
     *
     * @param value long value
     * @return the writer itself
     * @throws IOException
     */
    AwsJsonWriter value(long value) throws IOException;

    /**
     * Writes a {@link Number} value. It outputs the string representation of
     * the value by invoking {@link Number#toString()}. Unlike passing
     * {@link Number#toString()} to {@link #value(String)}, this doesn't include
     * double quote.
     *
     * @param value {@link Number} value
     * @return the writer itself
     * @throws IOException
     */
    AwsJsonWriter value(Number value) throws IOException;

    /**
     * Writes a {@link Date} value as epoch time in seconds in a number format.
     * For example, <code>new Date(1423875641895L)</code> will be encoded as a
     * number <code>1423875641.895</code>.
     *
     * @param value {@link Date} value
     * @return the writer itself
     * @throws IOException
     */
    AwsJsonWriter value(Date value) throws IOException;

    /**
     * Writes a {@link ByteBuffer} value
     *
     * @param value {@link ByteBuffer} value
     * @return the writer itself
     * @throws IOException
     */
    AwsJsonWriter value(ByteBuffer value) throws IOException;

    /**
     * Writes a null value, i.e. literal 'null'
     *
     * @return the writer itself
     * @throws IOException
     */
    AwsJsonWriter value() throws IOException;

    /**
     * Makes sure all buffered data is written to the underlying {@link Writer}.
     *
     * @throws IOException
     */
    void flush() throws IOException;

    /**
     * Flushes and closes this writer as well as the underlying {@link Writer}.
     *
     * @throws IOException
     */
    void close() throws IOException;
}
