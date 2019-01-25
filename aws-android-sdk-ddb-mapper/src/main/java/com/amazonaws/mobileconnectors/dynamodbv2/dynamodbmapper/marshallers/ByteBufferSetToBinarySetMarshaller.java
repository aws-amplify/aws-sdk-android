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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.marshallers;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ArgumentMarshaller.BinarySetAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * A marshaller that marshals sets of Java {@code ByteBuffer}s into DynamoDB
 * BinarySet attributes.
 */
public final class ByteBufferSetToBinarySetMarshaller
        implements BinarySetAttributeMarshaller {

    private static final ByteBufferSetToBinarySetMarshaller INSTANCE =
            new ByteBufferSetToBinarySetMarshaller();

    /**
     * Return a singleton instance.
     *
     * @return instance of {@link ByteBufferSetToBinarySetMarshaller}
     */
    public static ByteBufferSetToBinarySetMarshaller instance() {
        return INSTANCE;
    }

    private ByteBufferSetToBinarySetMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        @SuppressWarnings("unchecked")
        final Set<ByteBuffer> buffers = (Set<ByteBuffer>) obj;
        final List<ByteBuffer> attributes = new ArrayList<ByteBuffer>(buffers.size());

        for (final ByteBuffer b : buffers) {
            attributes.add(b);
        }

        return new AttributeValue().withBS(attributes);
    }
}
