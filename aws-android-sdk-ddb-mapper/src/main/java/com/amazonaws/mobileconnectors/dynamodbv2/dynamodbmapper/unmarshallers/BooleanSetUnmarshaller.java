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

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * A legacy unmarshaller that unmarshals DynamoDB NumberSets containing only "0"
 * and "1" into a set of Java Booleans (with "0" == false and "1" == true).
 * Retained only for backwards compatibility - DynamoDB does not have a
 * BooleanSet type, and sets of booleans aren't particularly useful anyways.
 */
public final class BooleanSetUnmarshaller extends NSUnmarshaller {

    private static final BooleanSetUnmarshaller INSTANCE =
            new BooleanSetUnmarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link BooleanSetUnmarshaller}
     */
    public static BooleanSetUnmarshaller instance() {
        return INSTANCE;
    }

    private BooleanSetUnmarshaller() {
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        final List<String> values = value.getNS();
        final Set<Boolean> result = new HashSet<Boolean>();

        for (final String s : values) {
            if ("1".equals(s)) {
                result.add(Boolean.TRUE);
            } else if ("0".equals(s)) {
                result.add(Boolean.FALSE);
            } else {
                throw new IllegalArgumentException(
                        "Expected '1' or '0' for boolean value, was " + s);
            }
        }

        return result;
    }
}
