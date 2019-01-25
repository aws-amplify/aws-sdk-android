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
import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ArgumentMarshaller.ListAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.util.ArrayList;
import java.util.List;

/**
 * A marshaller that marshals java list to dynamodb list.
 */
public class ListToListMarshaller implements ListAttributeMarshaller {

    private static final ListToListMarshaller INSTANCE =
            new ListToListMarshaller();

    /**
     * Return a singleton instance.
     *
     * @return instance of {@link ListToListMarshaller}
     */
    public static ListToListMarshaller instance() {
        return INSTANCE;
    }

    private final ArgumentMarshaller memberMarshaller;

    private ListToListMarshaller() {
        this(null);
    }

    /**
     * Constructor.
     *
     * @param memberMarshaller an instance of {@link ArgumentMarshaller}
     */
    public ListToListMarshaller(ArgumentMarshaller memberMarshaller) {
        this.memberMarshaller = memberMarshaller;
    }

    @Override
    public AttributeValue marshall(Object obj) {
        if (memberMarshaller == null) {
            throw new IllegalStateException(
                    "No member marshaller configured!");
        }

        final List<?> objects = (List<?>) obj;
        final List<AttributeValue> values =
                new ArrayList<AttributeValue>(objects.size());

        for (final Object o : objects) {
            AttributeValue value;
            if (o == null) {
                value = new AttributeValue().withNULL(true);
            } else {
                value = memberMarshaller.marshall(o);
            }

            values.add(value);
        }

        final AttributeValue result = new AttributeValue();
        result.setL(values);
        return result;
    }

    public ArgumentMarshaller getMemberMarshaller() {
        return memberMarshaller;
    }
}
