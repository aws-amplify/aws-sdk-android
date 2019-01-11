/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import com.amazonaws.util.Base64;

/**
 * A parser for Kinesis records. It has a helper method to serialize a Kinesis
 * record. The serialized data can be read via {@link #parse(String)}. It's not
 * thread safe.
 */
class FileRecordParser {
    /**
     * Field delimiter.
     */
    private static final String DELIMITER = ",";

    String streamName;
    byte[] bytes;

    /**
     * Parses a Kinesis record from a line.
     * 
     * @param line a string to parse
     */
    void parse(String line) {
        String[] parts = line.split(DELIMITER, 2);
        if (parts.length < 2) {
            throw new IllegalArgumentException("Invalid line: " + line);
        }
        streamName = parts[0];
        bytes = Base64.decode(parts[1]);
    }

    @Override
    public String toString() {
        return asString(streamName, bytes);
    }

    /**
     * A convenient method that serialize a Kinesis record into a String.
     * 
     * @param streamName the stream name of the Kinesis record
     * @param bytes data to be serialized
     * @return a string
     */
    public static String asString(String streamName, byte[] bytes) {
        return streamName + DELIMITER + Base64.encodeAsString(bytes);
    }
}
