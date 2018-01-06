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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.marshallers;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ArgumentMarshaller.BinaryAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.nio.ByteBuffer;

/**
 * A marshaller that marshals Java {@code byte[]}s into DynamoDB Binary
 * attributes.
 */
public final class ByteArrayToBinaryMarshaller implements BinaryAttributeMarshaller {

    private static final ByteArrayToBinaryMarshaller INSTANCE =
            new ByteArrayToBinaryMarshaller();

    /**
     * Return a singleton instance.
     *
     * @return instance of {@link ByteArrayToBinaryMarshaller}
     */
    public static ByteArrayToBinaryMarshaller instance() {
        return INSTANCE;
    }

    private ByteArrayToBinaryMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        return new AttributeValue().withB(ByteBuffer.wrap((byte[]) obj));
    }
}
