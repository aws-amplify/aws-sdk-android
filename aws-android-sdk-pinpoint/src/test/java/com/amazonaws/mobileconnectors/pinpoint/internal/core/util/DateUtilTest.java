/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.pinpoint.internal.core.util;

import static com.amazonaws.mobileconnectors.pinpoint.internal.core.util.DateUtil.isoDateFromMillis;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DateUtilTest {

    @Test
    public void isoDateFromEpoch0() {
        assertThat(isoDateFromMillis(0), is("1970-01-01T00:00:00.000Z"));
    }

    @Test
    public void isoDateFromKnownTimeStamp() {
        assertThat(isoDateFromMillis(1370114707266l), is("2013-06-01T19:25:07.266Z"));
        assertThat(isoDateFromMillis(1370114707266l + 1l), is("2013-06-01T19:25:07.267Z"));
    }

    @Test
    public void isoDateFromKnownTimeStampRoundedToSec() {
        assertThat(isoDateFromMillis(1370114707000l), is("2013-06-01T19:25:07.000Z"));
    }

}
