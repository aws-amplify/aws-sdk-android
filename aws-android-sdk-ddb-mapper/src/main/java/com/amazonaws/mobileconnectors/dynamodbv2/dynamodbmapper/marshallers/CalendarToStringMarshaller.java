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
import com.amazonaws.util.DateUtils;

import java.util.Calendar;

/**
 * A marshaller that marshals Java {@code Calendar} objects into DynamoDB
 * Strings (in ISO 8601 format, ie "2014-01-01T00:00:00Z").
 */
public final class CalendarToStringMarshaller implements StringAttributeMarshaller {

    private static final CalendarToStringMarshaller INSTANCE =
            new CalendarToStringMarshaller();

    /**
     * Return a singleton instance.
     *
     * @return instance of {@link CalendarToStringMarshaller}
     */
    public static CalendarToStringMarshaller instance() {
        return INSTANCE;
    }

    private CalendarToStringMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        return new AttributeValue().withS(
                DateUtils.formatISO8601Date(((Calendar) obj).getTime()));
    }
}
