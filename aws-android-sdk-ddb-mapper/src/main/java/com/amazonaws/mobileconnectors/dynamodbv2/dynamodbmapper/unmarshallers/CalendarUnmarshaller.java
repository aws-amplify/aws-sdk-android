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
import com.amazonaws.util.DateUtils;

import java.util.Calendar;

/**
 * An unmarshaller that unmarshals ISO-8601-formatted dates as Java
 * {@code Calendar} objects.
 */
public final class CalendarUnmarshaller extends SUnmarshaller {

    private static final CalendarUnmarshaller INSTANCE =
            new CalendarUnmarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link CalendarUnmarshaller}
     */
    public static CalendarUnmarshaller instance() {
        return INSTANCE;
    }

    private CalendarUnmarshaller() {
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        final Calendar cal = Calendar.getInstance();
        cal.setTime(DateUtils.parseISO8601Date(value.getS()));
        return cal;
    }
}
