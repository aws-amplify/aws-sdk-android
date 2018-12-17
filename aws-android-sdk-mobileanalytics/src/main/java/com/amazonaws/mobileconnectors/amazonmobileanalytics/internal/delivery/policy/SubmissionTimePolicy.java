/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.delivery.policy;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.AnalyticsContext;
/**
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class SubmissionTimePolicy implements DeliveryPolicy {

    static final String SUBMITTED_TIME_KEY = "SubmissionTimePolicy.submissionTime";

    private final AnalyticsContext context;
    private final Long waitInterval;
    private Long lastSubmittedTime;

    public SubmissionTimePolicy(AnalyticsContext context, Long waitInterval) {
        this.context = context;
        this.waitInterval = waitInterval;

        // initialize the policy to last submitted time
        this.lastSubmittedTime = context.getSystem().getPreferences()
                .getLong(SUBMITTED_TIME_KEY, 0l);
    }

    @Override
    public boolean isAllowed() {
        long timeSinceSubmission = System.currentTimeMillis() - lastSubmittedTime;
        return timeSinceSubmission > waitInterval;
    }

    @Override
    public void handleDeliveryAttempt(boolean successful) {
        if (successful) {
            lastSubmittedTime = System.currentTimeMillis();
            context.getSystem().getPreferences().putLong(SUBMITTED_TIME_KEY, lastSubmittedTime);
        }
    }
}
