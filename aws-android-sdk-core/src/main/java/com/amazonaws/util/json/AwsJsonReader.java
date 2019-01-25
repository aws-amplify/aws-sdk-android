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
import java.io.Reader;

/**
 * A streaming JSON reader.
 */
public interface AwsJsonReader {
    /**
     * Consumes the next token and asserts that it is the beginning of an array.
     *
     * @throws IOException
     */
    void beginArray() throws IOException;

    /**
     * Consumes the next token and asserts that it is the end of an array.
     *
     * @throws IOException
     */
    void endArray() throws IOException;

    /**
     * Consumes the next token and asserts that it is the beginning of an
     * object.
     *
     * @throws IOException
     */
    void beginObject() throws IOException;

    /**
     * Consumes the next token and asserts that it is the end of an object.
     *
     * @throws IOException
     */
    void endObject() throws IOException;

    /**
     * Returns true if the next token is either {@link AwsJsonToken#BEGIN_ARRAY}
     * or {@link AwsJsonToken#BEGIN_OBJECT}.
     *
     * @return true if it's an array or an object
     * @throws IOException
     */
    boolean isContainer() throws IOException;

    /**
     * If in an array or an object, returns true if there are more elements.
     *
     * @return true if the array or object has more elements, false otherwise.
     * @throws IOException
     */
    boolean hasNext() throws IOException;

    /**
     * If the next token is {@link AwsJsonToken#FIELD_NAME}, gets the field name
     * as {@link String}, and consumes it.
     * 
     * @return field name
     * @throws IOException
     */
    String nextName() throws IOException;

    /**
     * Gets the next value as {@link String}, or null if the token is
     * {@link AwsJsonToken#VALUE_NULL}.
     *
     * @return the next value as {@link String}
     * @throws IOException
     */
    String nextString() throws IOException;

    /**
     * Gets the next token but doesn't consume it.
     *
     * @return the next token
     * @throws IOException
     */
    AwsJsonToken peek() throws IOException;

    /**
     * Skips a value.
     *
     * @throws IOException
     */
    void skipValue() throws IOException;

    /**
     * Closes this reader as well as the underlying {@link Reader}.
     *
     * @throws IOException
     */
    void close() throws IOException;
}
