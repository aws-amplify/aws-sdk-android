/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.unmarshallers;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

/**
 * An unmarshaller that unmarshals BinarySet values as sets of Java
 * {@code byte[]}s.
 */
public final class ByteArraySetUnmarshaller extends BSUnmarshaller {

    private static final ByteArraySetUnmarshaller INSTANCE =
            new ByteArraySetUnmarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link ByteArraySetUnmarshaller}
     */
    public static ByteArraySetUnmarshaller instance() {
        return INSTANCE;
    }

    private ByteArraySetUnmarshaller() {
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        final Set<byte[]> result = new HashSet<byte[]>();

        for (final ByteBuffer buffer : value.getBS()) {
            if (buffer.hasArray()) {
                result.add(buffer.array());
            } else {
                final byte[] array = new byte[buffer.remaining()];
                buffer.get(array);
                result.add(array);
            }
        }

        return result;
    }
}
