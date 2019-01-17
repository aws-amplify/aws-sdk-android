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
import com.amazonaws.util.DateUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * A marshaller that marshals sets of Java {@code Date} objects into DynamoDB
 * StringSets (in ISO 8601 format, ie {"2014-01-01T00:00:00Z", ...}).
 */
public final class DateSetToStringSetMarshaller
        implements StringSetAttributeMarshaller {

    private static final DateSetToStringSetMarshaller INSTANCE =
            new DateSetToStringSetMarshaller();

    /**
     * Return a singleton instance.
     *
     * @return instance of {@link DateSetToStringSetMarshaller}
     */
    public static DateSetToStringSetMarshaller instance() {
        return INSTANCE;
    }

    private DateSetToStringSetMarshaller() {
    }

    @Override
    public AttributeValue marshall(Object obj) {
        @SuppressWarnings("unchecked")
        final Set<Date> dates = (Set<Date>) obj;

        final List<String> timestamps = new ArrayList<String>(dates.size());
        for (final Date date : dates) {
            timestamps.add(DateUtils.formatISO8601Date(date));
        }

        return new AttributeValue().withSS(timestamps);
    }
}
