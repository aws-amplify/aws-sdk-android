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

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ArgumentMarshaller.MapAttributeMarshaller;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ItemConverter;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.util.Map;

/**
 * A marshaller that marshals object to map.
 */
public class ObjectToMapMarshaller implements MapAttributeMarshaller {

    private static final ObjectToMapMarshaller INSTANCE =
            new ObjectToMapMarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link ObjectToMapMarshaller}
     */
    public static ObjectToMapMarshaller instance() {
        return INSTANCE;
    }

    private final ItemConverter converter;

    private ObjectToMapMarshaller() {
        converter = null;
    }

    /**
     * Constructor.
     *
     * @param converter the {@link ItemConverter}
     */
    public ObjectToMapMarshaller(ItemConverter converter) {
        if (converter == null) {
            throw new NullPointerException("converter");
        }
        this.converter = converter;
    }

    @Override
    public AttributeValue marshall(Object obj) {
        final Map<String, AttributeValue> values = converter.convert(obj);
        return new AttributeValue().withM(values);
    }
}
