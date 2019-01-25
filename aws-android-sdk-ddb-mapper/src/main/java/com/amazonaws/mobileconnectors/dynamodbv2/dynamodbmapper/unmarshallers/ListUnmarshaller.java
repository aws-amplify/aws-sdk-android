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

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ArgumentUnmarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * An unmarshaller that unmarshals Lists into Java {@code Lists}.
 */
public final class ListUnmarshaller extends LUnmarshaller {

    private static final ListUnmarshaller INSTANCE = new ListUnmarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link ListUnmarshaller}
     */
    public static ListUnmarshaller instance() {
        return INSTANCE;
    }

    private final ArgumentUnmarshaller memberUnmarshaller;

    private ListUnmarshaller() {
        memberUnmarshaller = null;
    }

    /**
     * Constructor.
     *
     * @param memberUnmarshaller a {@link ArgumentUnmarshaller}.
     */
    public ListUnmarshaller(ArgumentUnmarshaller memberUnmarshaller) {
        if (memberUnmarshaller == null) {
            throw new NullPointerException("memberUnmarshaller");
        }
        this.memberUnmarshaller = memberUnmarshaller;
    }

    @Override
    public Object unmarshall(AttributeValue value) throws ParseException {
        final List<AttributeValue> values = value.getL();
        final List<Object> objects = new ArrayList<Object>(values.size());

        for (final AttributeValue v : values) {
            memberUnmarshaller.typeCheck(v, null);
            objects.add(memberUnmarshaller.unmarshall(v));
        }

        return objects;
    }
}
