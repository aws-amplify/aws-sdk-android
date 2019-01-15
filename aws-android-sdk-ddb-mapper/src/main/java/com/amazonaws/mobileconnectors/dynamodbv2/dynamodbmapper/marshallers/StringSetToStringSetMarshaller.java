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

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ArgumentMarshaller.StringSetAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * A marshaller that marshals sets of Java {@code String}s to DynamoDB
 * StringSets.
 */
public final class StringSetToStringSetMarshaller
        implements StringSetAttributeMarshaller {

    private static final StringSetToStringSetMarshaller INSTANCE =
            new StringSetToStringSetMarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link StringSetToStringSetMarshaller}
     */
    public static StringSetToStringSetMarshaller instance() {
        return INSTANCE;
    }

    private StringSetToStringSetMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        @SuppressWarnings("unchecked")
        final Set<String> set = (Set<String>) obj;

        final List<String> strings = new ArrayList<String>(set.size());
        for (final String s : set) {
            strings.add(s);
        }

        return new AttributeValue().withSS(strings);
    }
}
