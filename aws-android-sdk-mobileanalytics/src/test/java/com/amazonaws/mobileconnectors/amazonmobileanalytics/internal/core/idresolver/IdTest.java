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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.idresolver;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.MobileAnalyticsTestBase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class IdTest extends MobileAnalyticsTestBase {

    private Id target;
    private static final String ID_VALUE = "1234567890";

    @Before
    public void setup() {
        target = new Id(ID_VALUE);
    }

    @Test
    public void testEmptyId() {
        assertThat(Id.getEmptyId().getValue(), is(""));
    }

    @Test
    public void valueOf_givenNullId_returnEmptyId() {
        assertThat(Id.valueOf(null).getValue(), is(""));
    }

    @Test
    public void valueOf_givenEmptyId_returnEmptyId() {
        assertThat(Id.valueOf("").getValue(), is(""));
    }

    @Test
    public void getValue_givenIdString_returnIdValue() {
        assertThat(target.getValue(), is(ID_VALUE));
    }

    @Test
    public void equals_sameObject_returnTrue() {
        assertThat(target.equals(target), is(true));
    }

    @Test
    public void equals_sameId_returnTrue() {
        assertThat(target.equals(new Id(ID_VALUE)), is(true));
    }

    @Test
    public void equals_differentType_returnFalse() {
        assertThat(target.equals(new Object()), is(false));
    }

    @Test
    public void equals_null_returnFalse() {
        assertThat(target.equals(null), is(false));
    }

    @Test
    public void equals_nullId_returnFalse() {
        assertThat(target.equals(new Id(null)), is(false));
    }

    @Test
    public void equals_bothNullId_returnTrue() {
        Id left = new Id(null);
        Id right = new Id(null);

        assertThat(left.equals(right), is(true));
    }

    @Test
    public void equals_diffId_returnFalse() {
        assertThat(target.equals(new Id(ID_VALUE + "0")), is(false));
    }
}
