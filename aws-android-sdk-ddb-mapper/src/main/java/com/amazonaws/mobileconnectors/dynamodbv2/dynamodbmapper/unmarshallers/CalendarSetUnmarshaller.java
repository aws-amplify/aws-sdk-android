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
import java.util.HashSet;
import java.util.Set;

/**
 * An unmarshaller that unmarshals sets of ISO-8601-formatted dates as sets of
 * Java {@code Calendar} objects.
 */
public final class CalendarSetUnmarshaller extends SSUnmarshaller {

    private static final CalendarSetUnmarshaller INSTANCE =
            new CalendarSetUnmarshaller();

    /**
     * returns a singleton instance.
     *
     * @return instance of {@link CalendarSetUnmarshaller}
     */
    public static CalendarSetUnmarshaller instance() {
        return INSTANCE;
    }

    private CalendarSetUnmarshaller() {
    }

    @Override
    public Object unmarshall(AttributeValue value) {
        final Set<Calendar> result = new HashSet<Calendar>();

        for (final String s : value.getSS()) {
            final Calendar cal = Calendar.getInstance();
            cal.setTime(DateUtils.parseISO8601Date(s));
            result.add(cal);
        }

        return result;
    }
}
