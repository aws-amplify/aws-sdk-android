/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import com.google.gson.Gson;

/**
 * Simple JSON marshaller that uses Gson mapper.
 *
 * @param <T> the type of object to be marshalled to json.
 */
public class JsonMarshaller<T extends Object> implements DynamoDBMarshaller<T> {

    private static Gson gson = new Gson();

    @Override
    public String marshall(T obj) {
        return gson.toJson(obj);
    }

    @Override
    public T unmarshall(Class<T> clazz, String json) {
        try {
            return gson.fromJson(json, clazz);
        } catch (final Exception e) {
            throw new RuntimeException("Unable to unmarshall the string " + json
                    + "into " + clazz, e);
        }
    }
}
