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

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ArgumentUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

/**
 * An unmarshaller that unmarshals DynamoDB Map type to a Java Map.
 */
public class MapUnmarshaller extends MUnmarshaller {

    private static final MapUnmarshaller INSTANCE = new MapUnmarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link MapUnmarshaller}
     */
    public static MapUnmarshaller instance() {
        return INSTANCE;
    }

    private final ArgumentUnmarshaller memberUnmarshaller;

    private MapUnmarshaller() {
        memberUnmarshaller = null;
    }

    /**
     * Constructor.
     *
     * @param memberUnmarshaller a {@link ArgumentUnmarshaller}
     */
    public MapUnmarshaller(ArgumentUnmarshaller memberUnmarshaller) {
        if (memberUnmarshaller == null) {
            throw new NullPointerException("memberUnmarshaller");
        }
        this.memberUnmarshaller = memberUnmarshaller;
    }

    @Override
    public Object unmarshall(AttributeValue value) throws ParseException {
        final Map<String, AttributeValue> map = value.getM();
        final Map<String, Object> result = new HashMap<String, Object>();

        for (final Map.Entry<String, AttributeValue> entry : map.entrySet()) {
            memberUnmarshaller.typeCheck(entry.getValue(), null);
            result.put(entry.getKey(),
                    memberUnmarshaller.unmarshall(entry.getValue()));
        }

        return result;
    }
}
