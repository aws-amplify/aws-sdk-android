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

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ArgumentMarshaller;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ArgumentMarshaller.MapAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.util.HashMap;
import java.util.Map;

/**
 * A marshaller that marshalls java map to dynamodb map.
 */
public class MapToMapMarshaller implements MapAttributeMarshaller {

    private static final MapToMapMarshaller INSTANCE =
            new MapToMapMarshaller();

    /**
     * Return a singleton instance.
     *
     * @return instance of {@link MapToMapMarshaller}
     */
    public static MapToMapMarshaller instance() {
        return INSTANCE;
    }

    private final ArgumentMarshaller memberMarshaller;

    private MapToMapMarshaller() {
        memberMarshaller = null;
    }

    /**
     * Constructor.
     *
     * @param memberMarshaller an instance of {@link ArgumentMarshaller}
     */
    public MapToMapMarshaller(ArgumentMarshaller memberMarshaller) {
        if (memberMarshaller == null) {
            throw new NullPointerException("memberMarshaller");
        }
        this.memberMarshaller = memberMarshaller;
    }

    @Override
    public AttributeValue marshall(Object obj) {
        if (memberMarshaller == null) {
            throw new IllegalStateException(
                    "No member marshaller configured!");
        }

        @SuppressWarnings("unchecked")
        final Map<String, ?> map = (Map<String, ?>) obj;
        final Map<String, AttributeValue> values =
                new HashMap<String, AttributeValue>();

        for (final Map.Entry<String, ?> entry : map.entrySet()) {
            AttributeValue value;
            if (entry.getValue() == null) {
                value = new AttributeValue().withNULL(true);
            } else {
                value = memberMarshaller.marshall(entry.getValue());
            }

            values.put(entry.getKey(), value);
        }

        final AttributeValue result = new AttributeValue();
        result.setM(values);
        return result;
    }

    public ArgumentMarshaller getMemberMarshaller() {
        return memberMarshaller;
    }
}
