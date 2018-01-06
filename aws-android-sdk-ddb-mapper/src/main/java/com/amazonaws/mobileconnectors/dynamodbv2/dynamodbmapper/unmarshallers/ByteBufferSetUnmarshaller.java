/*
 * Copyright 2014-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * An unmarshaller that unmarshals BinarySet values as sets of Java
 * {@code ByteBuffer}s.
 */
public final class ByteBufferSetUnmarshaller extends BSUnmarshaller {

    private static final ByteBufferSetUnmarshaller INSTANCE =
            new ByteBufferSetUnmarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link ByteBufferSetUnmarshaller}
     */
    public static ByteBufferSetUnmarshaller instance() {
        return INSTANCE;
    }

    private ByteBufferSetUnmarshaller() {
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        return new HashSet<ByteBuffer>(value.getBS());
    }
}
