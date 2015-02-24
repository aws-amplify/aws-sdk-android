/*
 * Copyright 2015-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Reader;
import java.io.Writer;

/**
 * A Json factory that creates Json reader and writer.
 */
public interface AwsJsonFactory {

    /**
     * Creates a Json reader
     *
     * @param in input {@link Reader}
     * @return a Json reader
     */
    AwsJsonReader getJsonReader(Reader in);

    /**
     * Creates a Json writer
     *
     * @param out output {@link Writer}
     * @return a Json writer
     */
    AwsJsonWriter getJsonWriter(Writer out);
}
