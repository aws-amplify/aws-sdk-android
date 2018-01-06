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

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMappingException;
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.DynamoDBMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * An unmarshaller that delegates to an instance of a {@code DynamoDBMarshaller}
 * -derived custom marshaler.
 */
public class CustomUnmarshaller extends SUnmarshaller {

    private final Class<?> targetClass;
    private final Class<? extends DynamoDBMarshaller<?>> unmarshallerClass;

    /**
     * Constructor.
     *
     * @param targetClass the target class.
     * @param unmarshallerClass the custom unmarshaller
     */
    public CustomUnmarshaller(
            Class<?> targetClass,
            Class<? extends DynamoDBMarshaller<?>> unmarshallerClass) {

        this.targetClass = targetClass;
        this.unmarshallerClass = unmarshallerClass;
    }

    @Override
    @SuppressWarnings({"rawtypes", "unchecked"})
    public Object unmarshall(AttributeValue value) {

        // TODO: Would be nice to cache this object, but not sure if we can
        // do that now without a breaking change; user's unmarshallers
        // might not all be thread-safe.

        final DynamoDBMarshaller unmarshaller =
                createUnmarshaller(unmarshallerClass);

        return unmarshaller.unmarshall(targetClass, value.getS());
    }

    @SuppressWarnings({"rawtypes"})
    private static DynamoDBMarshaller createUnmarshaller(Class<?> clazz) {
        try {

            return (DynamoDBMarshaller) clazz.newInstance();

        } catch (final InstantiationException e) {
            throw new DynamoDBMappingException(
                    "Failed to instantiate custom marshaler for class " + clazz,
                    e);

        } catch (final IllegalAccessException e) {
            throw new DynamoDBMappingException(
                    "Failed to instantiate custom marshaler for class " + clazz,
                    e);
        }
    }
}
