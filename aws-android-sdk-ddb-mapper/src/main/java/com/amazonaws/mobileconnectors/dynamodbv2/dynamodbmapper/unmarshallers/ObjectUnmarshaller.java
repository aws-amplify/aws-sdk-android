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

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ItemConverter;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.text.ParseException;
import java.util.Map;

/**
 * An unmarshaller that unmarshals DynamoDB Object.
 */
public class ObjectUnmarshaller extends MUnmarshaller {

    private static final ObjectUnmarshaller INSTANCE = new ObjectUnmarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link ObjectUnmarshaller}
     */
    public static ObjectUnmarshaller instance() {
        return INSTANCE;
    }

    private final ItemConverter converter;
    private final Class<?> clazz;

    private ObjectUnmarshaller() {
        converter = null;
        clazz = null;
    }

    /**
     * Constructor.
     *
     * @param converter an {@link ItemConverter}
     * @param clazz a class to unmarshal to
     */
    public ObjectUnmarshaller(ItemConverter converter, Class<?> clazz) {
        if (converter == null) {
            throw new NullPointerException("converter");
        }
        if (clazz == null) {
            throw new NullPointerException("clazz");
        }

        this.converter = converter;
        this.clazz = clazz;
    }

    @Override
    public Object unmarshall(AttributeValue value) throws ParseException {
        final Map<String, AttributeValue> map = value.getM();
        return converter.unconvert(clazz, map);
    }
}
