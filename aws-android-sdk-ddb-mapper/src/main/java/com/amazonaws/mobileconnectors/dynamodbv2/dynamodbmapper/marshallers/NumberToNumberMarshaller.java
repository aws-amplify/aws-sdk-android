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

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ArgumentMarshaller.NumberAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A marshaller that marshals any Java {@code Number} to a DynamoDB number.
 */
public final class NumberToNumberMarshaller implements NumberAttributeMarshaller {

    private static final NumberToNumberMarshaller INSTANCE =
            new NumberToNumberMarshaller();

    /**
     * Return a singleton instance.
     *
     * @return instance of {@link NumberToNumberMarshaller}
     */
    public static NumberToNumberMarshaller instance() {
        return INSTANCE;
    }

    private NumberToNumberMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        final Number number = (Number) obj;
        return new AttributeValue().withN(number.toString());
    }
}
