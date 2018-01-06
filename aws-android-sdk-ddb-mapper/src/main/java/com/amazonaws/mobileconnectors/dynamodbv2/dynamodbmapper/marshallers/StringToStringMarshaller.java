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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.marshallers;

import com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper.ArgumentMarshaller.StringAttributeMarshaller;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;

/**
 * A marshaller that marshals Java {@code String} objects to DynamoDB Strings.
 */
public final class StringToStringMarshaller implements StringAttributeMarshaller {

    private static final StringToStringMarshaller INSTANCE =
            new StringToStringMarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link StringToStringMarshaller}
     */
    public static StringToStringMarshaller instance() {
        return INSTANCE;
    }

    private StringToStringMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        final String string = (String) obj;
        if (string.length() == 0) {
            // Sticking with the legacy behavior for now.
            return null;
        }

        return new AttributeValue().withS(string);
    }
}
