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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.policy;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.system.Preferences;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.utils.AnalyticsContextBuilder;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class SubmissionTimePolicyTest {

    @Mock
    Preferences mockPreferences;
    private AnalyticsContext mockContext;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockContext = new AnalyticsContextBuilder().withPreferences(mockPreferences).build();
    }

    @Test
    public void isAllowed_notEnoughTimeHasPassed_policyIsFalse() {
        when(mockPreferences.getLong("SubmissionTimePolicy.submissionTime", 0)).thenReturn(
                System.currentTimeMillis() - 500l);
        SubmissionTimePolicy target = new SubmissionTimePolicy(mockContext, 1000l);
        assertThat(target.isAllowed(), is(false));
    }

    @Test
    public void isAllowed_enoughTimeHasPassed_policyIsTrue() {
        when(mockPreferences.getLong("SubmissionTimePolicy.submissionTime", 0)).thenReturn(
                System.currentTimeMillis() - 2000l);
        SubmissionTimePolicy target = new SubmissionTimePolicy(mockContext, 1000l);
        assertThat(target.isAllowed(), is(true));
    }

    @Test
    public void handleDeliveryAttempt_successfulDelivery_submissionTimeUpdated() {
        SubmissionTimePolicy target = new SubmissionTimePolicy(mockContext, 100l);
        target.handleDeliveryAttempt(true);

        ArgumentCaptor<Long> timestamp = ArgumentCaptor.forClass(Long.class);
        verify(mockPreferences, times(1)).putLong(eq("SubmissionTimePolicy.submissionTime"),
                timestamp.capture());

        // verify that the new submission time that was written is within 100ms
        // of now
        long now = System.currentTimeMillis();
        assertThat(timestamp.getValue(), is(lessThan(now + 1000)));
        assertThat(timestamp.getValue(), is(greaterThan(now - 1000)));
    }

    @Test
    public void handleDeliveryAttempt_failedDelivery_submissionTimeNotUpdated() {
        SubmissionTimePolicy target = new SubmissionTimePolicy(mockContext, 100l);
        target.handleDeliveryAttempt(false);
        verify(mockPreferences, times(0)).putLong(anyString(), anyLong());
    }

}
